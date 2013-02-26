package com.fand.generator;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.jdbc.support.DatabaseMetaDataCallback;
import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.jdbc.support.MetaDataAccessException;

import com.fand.generator.mapper.FieldMapper;
import com.fand.generator.mapper.PoMapper;
import com.fand.generator.template.Template;

/**
 * PO对象映射工厂
 * 
 * @author yaoht
 */
public class PoMapperFactory {
	private String defaultFieldType;

	private JdbcTemplate jdbcTemplate;

	private Map<String, String> poMap;

	private Map<String, PoMapper> poMapperMap;

	private String productName;

	private String schemaPattern;

	private Template template;

	private Map<Integer, String> typeMap;

	private PoMapper getPoMapper(final DatabaseMetaData dbmd, final String tableName) throws SQLException,
			MetaDataAccessException {
		PoMapper poMapper = null;

		ResultSet rs = null;

		try {
			rs = dbmd.getTables(null, this.schemaPattern, tableName, null);

			final RowMapperResultSetExtractor<PoMapper> rowMapperResultSetExtractor = new RowMapperResultSetExtractor<PoMapper>(
					BeanPropertyRowMapper.newInstance(PoMapper.class), 1);

			poMapper = DataAccessUtils.requiredSingleResult(rowMapperResultSetExtractor.extractData(rs));
		} finally {
			JdbcUtils.closeResultSet(rs);
		}

		this.productName = JdbcUtils.extractDatabaseMetaData(this.jdbcTemplate.getDataSource(), "getDatabaseProductName")
				.toString();

		this.productName = JdbcUtils.commonDatabaseName(this.productName);

		if ("Oracle".equals(this.productName)) {
			final String sql = "SELECT COMMENTS FROM USER_TAB_COMMENTS WHERE TABLE_NAME= ?";

			final String remarks = this.jdbcTemplate.queryForObject(sql, new Object[] { tableName }, String.class);

			poMapper.setRemarks(remarks);
		}

		Map<String, FieldMapper> fieldMapperMap = new HashMap<String, FieldMapper>();

		List<FieldMapper> fieldMapperList;

		try {
			rs = dbmd.getColumns(null, this.schemaPattern, tableName, null);

			final RowMapperResultSetExtractor<FieldMapper> rowMapperResultSetExtractor = new RowMapperResultSetExtractor<FieldMapper>(
					BeanPropertyRowMapper.newInstance(FieldMapper.class), 0);

			fieldMapperList = rowMapperResultSetExtractor.extractData(rs);
		} finally {
			JdbcUtils.closeResultSet(rs);
		}

		for (final FieldMapper fieldMapper : fieldMapperList) {
			final String code = com.fand.utils.StringUtils.toCamelCase(fieldMapper.getColumnName());

			final String namePascalCase = com.fand.utils.StringUtils.toPascalCase(fieldMapper.getColumnName());

			fieldMapper.setCode(code);
			fieldMapper.setName(code);
			fieldMapper.setNamePascalCase(namePascalCase);

			if (fieldMapperMap == null) {
				fieldMapperMap = new HashMap<String, FieldMapper>();
			}

			String typeCode = this.typeMap.get(fieldMapper.getDataType());

			typeCode = StringUtils.defaultIfBlank(typeCode, this.defaultFieldType);

			fieldMapper.setTypeCode(typeCode);

			fieldMapperMap.put(code, fieldMapper);
		}

		if ("Oracle".equals(this.productName)) {
			final String sql = "SELECT COMMENTS FROM USER_COL_COMMENTS WHERE TABLE_NAME= ? AND COLUMN_NAME = ?";

			for (final FieldMapper fieldMapper : fieldMapperMap.values()) {
				final String remarks = this.jdbcTemplate.queryForObject(sql,
						new Object[] { tableName, fieldMapper.getColumnName() }, String.class);

				fieldMapper.setRemarks(remarks);
			}
		}

		poMapper.setFieldMapperMap(fieldMapperMap);

		try {
			rs = dbmd.getPrimaryKeys(null, this.schemaPattern, tableName);

			final RowMapperResultSetExtractor<FieldMapper> rowMapperResultSetExtractor = new RowMapperResultSetExtractor<FieldMapper>(
					BeanPropertyRowMapper.newInstance(FieldMapper.class), 0);

			fieldMapperList = rowMapperResultSetExtractor.extractData(rs);
		} finally {
			JdbcUtils.closeResultSet(rs);
		}

		if (!CollectionUtils.isEmpty(fieldMapperList)) {
			for (final FieldMapper itemFieldMapper : fieldMapperList) {
				final String code = com.fand.utils.StringUtils.toCamelCase(itemFieldMapper.getColumnName());

				final FieldMapper fieldMapper = fieldMapperMap.get(code);

				fieldMapper.setKeySeq(itemFieldMapper.getKeySeq());
				fieldMapper.setPkName(itemFieldMapper.getPkName());
			}
		}

		return poMapper;
	}

	public void init() {
		Validate.notNull(this.defaultFieldType);

		Validate.notEmpty(this.poMap);

		Validate.notEmpty(this.typeMap);
	}

	private void initPoMapperMap(final DatabaseMetaData dbmd) throws MetaDataAccessException, SQLException {
		for (final String key : this.poMap.keySet()) {
			final String tableName = this.poMap.get(key);

			final PoMapper poMapper = this.getPoMapper(dbmd, tableName);

			if (poMapper == null) {
				continue;
			}

			poMapper.setCode(key);

			if (this.poMapperMap == null) {
				this.poMapperMap = new HashMap<String, PoMapper>();
			}

			this.poMapperMap.put(key, poMapper);
		}
	}

	public void run() throws Exception {
		JdbcUtils.extractDatabaseMetaData(this.jdbcTemplate.getDataSource(), new DatabaseMetaDataCallback() {
			@Override
			public Object processMetaData(final DatabaseMetaData dbmd) throws SQLException, MetaDataAccessException {
				PoMapperFactory.this.initPoMapperMap(dbmd);

				return null;
			}
		});

		Validate.notEmpty(this.poMapperMap);

		this.template.run(this.poMapperMap);
	}

	/**
	 * @param defaultFieldType
	 *            the defaultFieldType to set
	 */
	public void setDefaultFieldType(final String defaultFieldType) {
		this.defaultFieldType = defaultFieldType;
	}

	public void setJdbcTemplate(final JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * @param poMap
	 *            the poMap to set
	 */
	public void setPoMap(final Map<String, String> poMap) {
		this.poMap = poMap;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(final String productName) {
		this.productName = productName;
	}

	public void setSchemaPattern(final String schemaPattern) {
		this.schemaPattern = schemaPattern;
	}

	public void setTemplate(final Template template) {
		this.template = template;
	}

	/**
	 * @param typeMap
	 *            the typeMap to set
	 */
	public void setTypeMap(final Map<Integer, String> typeMap) {
		this.typeMap = typeMap;
	}

}

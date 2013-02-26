package com.fand.extend.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.transaction.annotation.Transactional;

import com.fand.builder.DefaultModelBuilder;
import com.fand.builder.ModelArgs;
import com.fand.builder.ModelBuilder;
import com.fand.builder.ModelBuilderUtils;
import com.fand.dto.PaginationDto;
import com.fand.support.TemplateSupport;

/**
 * jdbc dao
 * 
 * @author yaoht
 * 
 */
public class JdbcSimpleDao extends NamedParameterJdbcDaoSupport implements SimpleDao {
	/**
	 * 模板支持
	 */
	private TemplateSupport templateSupport;

	@Override
	public int create(final String sqlIdSuffixName, final Boolean isSave, final ModelArgs... modelArgss) {
		if (ArrayUtils.isEmpty(modelArgss)) {
			return 0;
		}

		final String readSqlId = ModelArgs._read + sqlIdSuffixName;

		final String createSqlId = ModelArgs._create + sqlIdSuffixName;

		final String saveSqlId = ModelArgs._save + sqlIdSuffixName;

		return this.create(readSqlId, createSqlId, isSave, saveSqlId, modelArgss);
	}

	@Override
	public int create(final String sqlIdSuffixName, final Boolean isSave, final Object... objects) {
		if (ArrayUtils.isEmpty(objects)) {
			return 0;
		}

		final String readSqlId = ModelArgs._read + sqlIdSuffixName;

		final String createSqlId = ModelArgs._create + sqlIdSuffixName;

		final String saveSqlId = ModelArgs._save + sqlIdSuffixName;

		return this.create(readSqlId, createSqlId, isSave, saveSqlId, objects);
	}

	@Override
	public int create(final String sqlId, final List<Map<String, Object>> modelList) {
		return this.update(ModelArgs._create, sqlId, modelList);
	}

	@Override
	public int create(final String sqlId, final Map<String, Object> model) {
		return this.update(ModelArgs._create, sqlId, model);
	}

	@Override
	public int create(final String readSqlId, final String createSqlId, final Boolean isSave, final String saveSqlId,
			final ModelArgs... modelArgss) {
		if (ArrayUtils.isEmpty(modelArgss)) {
			return 0;
		}

		final ModelBuilder modelBuilder = new DefaultModelBuilder();

		ModelBuilderUtils.putByFilters(modelBuilder, modelArgss, ModelArgs._create, ModelArgs._save);

		final int count = this.read(readSqlId, null, modelBuilder.build());

		if (count > 0) {
			if (!isSave) {
				return 0;
			}

			ModelBuilderUtils.putByHandle(modelBuilder, modelArgss, ModelArgs._save);

			return this.save(saveSqlId, modelBuilder.build());
		}

		ModelBuilderUtils.putByHandle(modelBuilder, modelArgss, ModelArgs._create);

		return this.create(createSqlId, modelBuilder.build());
	}

	@Transactional(readOnly = false)
	@Override
	public int create(final String readSqlId, final String createSqlId, final Boolean isSave, final String saveSqlId,
			final Object... objects) {
		if (ArrayUtils.isEmpty(objects)) {
			return 0;
		}

		int rowCount = 0;

		for (final Object object : objects) {
			final ModelArgs modelArgs1 = new ModelArgs(ModelArgs._create, object).setSkipNullValue(true);

			final ModelArgs modelArgs2 = new ModelArgs(object).addUseAnnotationClassList(javax.persistence.Id.class);

			if (isSave) {
				final ModelArgs modelArgs3 = new ModelArgs(ModelArgs._save, object)
						.addIgnoreAnnotationClassList(javax.persistence.Id.class);

				rowCount += this.create(readSqlId, createSqlId, isSave, saveSqlId, modelArgs1, modelArgs2, modelArgs3);
			} else {
				rowCount += this.create(readSqlId, createSqlId, isSave, saveSqlId, modelArgs1, modelArgs2);
			}
		}

		return rowCount;
	}

	@Override
	public <T> List<T> find(String sqlId, final Class<T> mappedClass, final Map<String, Object> model) {
		sqlId = StringUtils.defaultIfBlank(sqlId, ModelArgs._find);

		final String sql = this.templateSupport.processTemplateIntoString(sqlId, model);

		return this.getNamedParameterJdbcTemplate().query(sql, model,
				ParameterizedBeanPropertyRowMapper.newInstance(mappedClass));
	}

	@Override
	public <T> List<T> find(final String sqlId, final Class<T> mappedClass, final ModelArgs... modelArgss) {
		if (ArrayUtils.isEmpty(modelArgss)) {
			return new ArrayList<T>();
		}

		final ModelBuilder modelBuilder = new DefaultModelBuilder();

		ModelBuilderUtils.putByHandle(modelBuilder, modelArgss);

		return this.find(sqlId, mappedClass, modelBuilder.build());
	}

	@Override
	public List<Map<String, Object>> find(String sqlId, final Map<String, Object> model) {
		sqlId = StringUtils.defaultIfBlank(sqlId, ModelArgs._find);

		final String sql = this.templateSupport.processTemplateIntoString(sqlId, model);

		return this.getNamedParameterJdbcTemplate().queryForList(sql, model);
	}

	@Override
	public List<Map<String, Object>> find(final String sqlId, final ModelArgs... modelArgss) {
		if (ArrayUtils.isEmpty(modelArgss)) {
			return new ArrayList<Map<String, Object>>();
		}

		final ModelBuilder modelBuilder = new DefaultModelBuilder();

		ModelBuilderUtils.putByFilters(modelBuilder, modelArgss);

		return this.find(sqlId, modelBuilder.build());
	}

	@Override
	public <T> T get(String sqlId, final Class<T> mappedClass, final Map<String, Object> model) {
		sqlId = StringUtils.defaultIfBlank(sqlId, ModelArgs._get);

		final String sql = this.templateSupport.processTemplateIntoString(sqlId, model);

		return this.getNamedParameterJdbcTemplate().queryForObject(sql, model,
				ParameterizedBeanPropertyRowMapper.newInstance(mappedClass));
	}

	@Override
	public <T> T get(final String sqlId, final Class<T> mappedClass, final ModelArgs... modelArgss) {
		if (ArrayUtils.isEmpty(modelArgss)) {
			try {
				return mappedClass.newInstance();
			} catch (final InstantiationException e) {
				e.printStackTrace();
			} catch (final IllegalAccessException e) {
				e.printStackTrace();
			}

			return null;
		}

		final ModelBuilder modelBuilder = new DefaultModelBuilder();

		ModelBuilderUtils.putByHandle(modelBuilder, modelArgss);

		return this.get(sqlId, mappedClass, modelBuilder.build());
	}

	@Override
	public Map<String, Object> get(String sqlId, final Map<String, Object> model) {
		sqlId = StringUtils.defaultIfBlank(sqlId, ModelArgs._get);

		final String sql = this.templateSupport.processTemplateIntoString(sqlId, model);

		return this.getNamedParameterJdbcTemplate().queryForMap(sql, model);
	}

	@Override
	public Map<String, Object> get(final String sqlId, final ModelArgs... modelArgss) {
		if (ArrayUtils.isEmpty(modelArgss)) {
			return new HashMap<String, Object>();
		}

		final ModelBuilder modelBuilder = new DefaultModelBuilder();

		ModelBuilderUtils.putByHandle(modelBuilder, modelArgss);

		return this.get(sqlId, modelBuilder.build());
	}

	@Override
	public <T> PaginationDto<T> pagination(final String readSqlId, final String findSqlId, int paginationNo,
			int paginationSize, final Class<T> mappedClass, final Map<String, Object> model) {
		final PaginationDto<T> paginationDto = new PaginationDto<>();

		final int totalSize = this.read(readSqlId, null, model);

		if (totalSize > 0) {
			if (model != null) {
				paginationNo = (paginationNo > 0) ? paginationNo : 1;

				paginationSize = (paginationSize > 0) ? paginationSize : 10;

				final int beginRowNum = (paginationNo * paginationSize) - (paginationSize - 1);

				model.put("begin__row__num", beginRowNum);

				final int endRowNum = paginationNo * paginationSize;

				model.put("end__row__num", endRowNum);
			}

			final List<T> dataList = this.find(findSqlId, mappedClass, model);

			paginationDto.setDataList(dataList);
		} else {
			paginationDto.setDataList(new ArrayList<T>());
		}

		return paginationDto;
	}

	@Override
	public <T> PaginationDto<T> pagination(final String readSqlId, final String findSqlId, final int paginationNo,
			final int paginationSize, final Class<T> mappedClass, final ModelArgs... modelArgss) {
		if (ArrayUtils.isEmpty(modelArgss)) {
			return new PaginationDto<>();
		}

		final ModelBuilder modelBuilder = new DefaultModelBuilder();

		ModelBuilderUtils.putByHandle(modelBuilder, modelArgss);

		return this.pagination(readSqlId, findSqlId, paginationNo, paginationSize, mappedClass, modelBuilder.build());
	}

	@Override
	public PaginationDto<Map<String, Object>> pagination(final String readSqlId, final String findSqlId, int paginationNo,
			int paginationSize, final Map<String, Object> model) {
		final PaginationDto<Map<String, Object>> paginationDto = new PaginationDto<>();

		final int totalSize = this.read(readSqlId, null, model);

		if (totalSize > 0) {
			if (model != null) {
				paginationNo = (paginationNo > 0) ? paginationNo : 1;

				paginationSize = (paginationSize > 0) ? paginationSize : 10;

				final int beginRowNum = (paginationNo * paginationSize) - (paginationSize - 1);

				model.put("begin__row__num", beginRowNum);

				final int endRowNum = paginationNo * paginationSize;

				model.put("end__row__num", endRowNum);
			}
			
			final List<Map<String, Object>> dataList = this.find(findSqlId, model);

			paginationDto.setDataList(dataList);
		} else {
			paginationDto.setDataList(new ArrayList<Map<String, Object>>());
		}

		return paginationDto;
	}

	@Override
	public PaginationDto<Map<String, Object>> pagination(final String readSqlId, final String findSqlId,
			final int paginationNo, final int paginationSize, final ModelArgs... modelArgss) {
		if (ArrayUtils.isEmpty(modelArgss)) {
			return new PaginationDto<>();
		}

		final ModelBuilder modelBuilder = new DefaultModelBuilder();

		ModelBuilderUtils.putByHandle(modelBuilder, modelArgss);

		return this.pagination(readSqlId, findSqlId, paginationNo, paginationSize, modelBuilder.build());
	}

	@Override
	public <T> T read(String sqlId, final String readFieldId, final Class<T> requiredType, Map<String, Object> model) {
		sqlId = StringUtils.defaultIfBlank(sqlId, ModelArgs._read);

		if (StringUtils.isNotBlank(readFieldId)) {
			if (model == null) {
				model = new HashMap<>();
			}

			model.put(ModelArgs._readFieldId, readFieldId);
		}

		final String sql = this.templateSupport.processTemplateIntoString(sqlId, model);

		return this.getNamedParameterJdbcTemplate().queryForObject(sql, model, requiredType);
	}

	@Override
	public <T> T read(final String sqlId, final String readFieldId, final Class<T> requiredType, final ModelArgs... modelArgss) {
		if (ArrayUtils.isEmpty(modelArgss)) {
			try {
				return requiredType.newInstance();
			} catch (final InstantiationException e) {
				e.printStackTrace();
			} catch (final IllegalAccessException e) {
				e.printStackTrace();
			}
		}

		final ModelBuilder modelBuilder = new DefaultModelBuilder();

		ModelBuilderUtils.putByHandle(modelBuilder, modelArgss);

		return this.read(sqlId, readFieldId, requiredType, modelBuilder.build());
	}

	@Override
	public int read(String sqlId, final String readFieldId, Map<String, Object> model) {
		sqlId = StringUtils.defaultIfBlank(sqlId, ModelArgs._read);

		if (StringUtils.isNotBlank(readFieldId)) {
			if (model == null) {
				model = new HashMap<String, Object>();
			}

			model.put(ModelArgs._readFieldId, readFieldId);
		}

		final String sql = this.templateSupport.processTemplateIntoString(sqlId, model);

		return this.getNamedParameterJdbcTemplate().queryForInt(sql, model);
	}

	@Override
	public int read(final String sqlId, final String readFieldId, final ModelArgs... modelArgss) {
		if (ArrayUtils.isEmpty(modelArgss)) {

			return 0;
		}

		final ModelBuilder modelBuilder = new DefaultModelBuilder();

		ModelBuilderUtils.putByHandle(modelBuilder, modelArgss);

		return this.read(sqlId, readFieldId, modelBuilder.build());
	}

	@Override
	public <T> List<T> readList(String sqlId, final String readFieldId, final Class<T> elementType, Map<String, Object> model) {
		sqlId = StringUtils.defaultIfBlank(sqlId, ModelArgs._read);

		if (StringUtils.isNotBlank(readFieldId)) {
			if (model == null) {
				model = new HashMap<String, Object>();
			}

			model.put(ModelArgs._readFieldId, readFieldId);
		}

		final String sql = this.templateSupport.processTemplateIntoString(sqlId, model);

		return this.getNamedParameterJdbcTemplate().queryForList(sql, model, elementType);
	}

	@Override
	public <T> List<T> readList(final String sqlId, final String readFieldId, final Class<T> elementType,
			final ModelArgs... modelArgss) {
		if (ArrayUtils.isEmpty(modelArgss)) {

			return new ArrayList<>();
		}

		final ModelBuilder modelBuilder = new DefaultModelBuilder();

		ModelBuilderUtils.putByHandle(modelBuilder, modelArgss);

		return this.readList(sqlId, readFieldId, elementType, modelBuilder.build());
	}

	@Override
	public int remove(final String sqlId, final List<Map<String, Object>> modelList) {
		return this.update(ModelArgs._remove, sqlId, modelList);
	}

	@Override
	public int remove(final String sqlId, final Map<String, Object> model) {
		return this.update(ModelArgs._remove, sqlId, model);
	}

	@Override
	public int remove(final String sqlId, final ModelArgs... modelArgss) {
		if (ArrayUtils.isEmpty(modelArgss)) {
			return 0;
		}

		final ModelBuilder modelBuilder = new DefaultModelBuilder();

		ModelBuilderUtils.putByFilters(modelBuilder, modelArgss);

		return this.remove(sqlId, modelBuilder.build());
	}

	@Override
	public int remove(final String sqlId, final Object... objects) {
		if (ArrayUtils.isEmpty(objects)) {
			return 0;
		}

		int rowCount = 0;

		for (final Object object : objects) {
			final ModelArgs modelArgs1 = new ModelArgs(object).addUseAnnotationClassList(javax.persistence.Id.class);

			rowCount += this.remove(sqlId, modelArgs1);
		}

		return rowCount;
	}

	@Override
	public int save(final String sqlIdSuffixName, final Boolean isCreate, final ModelArgs... modelArgss) {
		if (ArrayUtils.isEmpty(modelArgss)) {
			return 0;
		}

		final String readSqlId = ModelArgs._read + sqlIdSuffixName;

		final String saveSqlId = ModelArgs._save + sqlIdSuffixName;

		final String createSqlId = ModelArgs._create + sqlIdSuffixName;

		return this.save(saveSqlId, isCreate, readSqlId, createSqlId, modelArgss);
	}

	@Override
	public int save(final String sqlIdSuffixName, final Boolean isCreate, final Object... objects) {
		if (ArrayUtils.isEmpty(objects)) {
			return 0;
		}

		final String readSqlId = ModelArgs._read + sqlIdSuffixName;

		final String saveSqlId = ModelArgs._save + sqlIdSuffixName;

		final String createSqlId = ModelArgs._create + sqlIdSuffixName;

		return this.save(saveSqlId, isCreate, readSqlId, createSqlId, objects);
	}

	@Override
	public int save(final String saveSqlId, final Boolean isCreate, final String readSqlId, final String createSqlId,
			final ModelArgs... modelArgss) {
		if (ArrayUtils.isEmpty(modelArgss)) {
			return 0;
		}

		final ModelBuilder modelBuilder = new DefaultModelBuilder();

		ModelBuilderUtils.putByFilters(modelBuilder, modelArgss, ModelArgs._create, ModelArgs._save);

		if (isCreate) {
			final int count = this.read(readSqlId, null, modelBuilder.build());

			if (count < 1) {
				ModelBuilderUtils.putByHandle(modelBuilder, modelArgss, ModelArgs._create);

				return this.create(createSqlId, modelBuilder.build());
			}
		}

		ModelBuilderUtils.putByHandle(modelBuilder, modelArgss, ModelArgs._save);

		return this.save(saveSqlId, modelBuilder.build());
	}

	@Override
	public int save(final String saveSqlId, final Boolean isCreate, final String readSqlId, final String createSqlId,
			final Object... objects) {
		if (ArrayUtils.isEmpty(objects)) {
			return 0;
		}

		int rowCount = 0;

		for (final Object object : objects) {
			final ModelArgs saveModelArgs = new ModelArgs(ModelArgs._save, object)
					.addIgnoreAnnotationClassList(javax.persistence.Id.class);

			final ModelArgs whereAndEqModelArgs = new ModelArgs(object).addUseAnnotationClassList(javax.persistence.Id.class);

			if (isCreate) {
				final ModelArgs createModelArgs = new ModelArgs(ModelArgs._create, object).setSkipNullValue(true);

				rowCount += this.save(saveSqlId, isCreate, readSqlId, createSqlId, saveModelArgs, whereAndEqModelArgs,
						createModelArgs);
			} else {
				rowCount += this.save(saveSqlId, isCreate, readSqlId, createSqlId, saveModelArgs, whereAndEqModelArgs);
			}
		}

		return rowCount;
	}

	@Override
	public int save(final String sqlId, final List<Map<String, Object>> modelList) {
		return this.update(ModelArgs._save, sqlId, modelList);
	}

	@Override
	public int save(final String sqlId, final Map<String, Object> model) {
		return this.update(ModelArgs._save, sqlId, model);
	}

	public void setTemplateSupport(final TemplateSupport templateSupport) {
		this.templateSupport = templateSupport;
	}

	@Override
	public int update(final String defaultSqlId, final String sqlId, final List<Map<String, Object>> modelList) {
		if (CollectionUtils.isEmpty(modelList)) {
			return 0;
		}

		int rowCount = 0;

		for (final Map<String, Object> model : modelList) {
			rowCount += this.update(defaultSqlId, sqlId, model);
		}

		return rowCount;
	}

	@Override
	public int update(final String defaultSqlId, String sqlId, final Map<String, Object> model) {
		sqlId = StringUtils.defaultIfBlank(sqlId, defaultSqlId);

		final String sql = this.templateSupport.processTemplateIntoString(sqlId, model);

		return this.getNamedParameterJdbcTemplate().update(sql, model);
	}
}

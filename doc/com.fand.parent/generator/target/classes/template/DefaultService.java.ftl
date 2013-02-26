<#include "macro_.ftl">
package ${packageCode}.${moduleMapperKey}.service;

import java.util.List;
import java.util.Map;

import com.fand.builder.ModelArgs;
import com.fand.dto.PaginationDto;
import com.fand.extend.service.DefaultSimpleService;
import ${packageCode}.${moduleMapperKey}.service.${businessCode}Service;
import ${packageCode}.${moduleMapperKey}.dao.${businessCode}Dao;
<#list entityList as entity>
import ${packageCode}.${moduleMapperKey}.dao.${entity}Dao;
</#list>

/**
 * ${businessMapper.name!businessCode}
 *
 * @author ${author!'yaoht'}
 * 
 */
public class Default${businessCode}Service extends DefaultSimpleService<${businessCode}Dao> implements ${businessCode}Service {
<#list poMapperList as poMapper>
	/**
	 * <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 */
	private ${poMapper.code}Dao ${poMapper.code?uncap_first}Dao;

</#list>
<#list poMapperList as poMapper>

	/**
	 * <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param ${poMapper.code?uncap_first}Dao
	 *            <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 */
	public void set${poMapper.code}Dao(${poMapper.code}Dao ${poMapper.code?uncap_first}Dao) {
		this.${poMapper.code?uncap_first}Dao = ${poMapper.code?uncap_first}Dao;
	}
</#list>
<#list poMapperList as poMapper>

	@Override
	public int create${poMapper.code}(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss) {
		return this.${poMapper.code?uncap_first}Dao.create(sqlIdSuffixName, isSave, modelArgss);
	}

	@Override
	public int create${poMapper.code}(String sqlIdSuffixName, Boolean isSave, Object... objects) {
		return this.${poMapper.code?uncap_first}Dao.create(sqlIdSuffixName, isSave, objects);
	}

	@Override
	public int create${poMapper.code}(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss) {
		return this.${poMapper.code?uncap_first}Dao.create(readSqlId, createSqlId, isSave, saveSqlId, modelArgss);
	}

	@Override
	public int create${poMapper.code}(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects) {
		return this.${poMapper.code?uncap_first}Dao.create(readSqlId, createSqlId, isSave, saveSqlId, objects);
	}

	@Override
	public <T> List<T> find${poMapper.code}(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.${poMapper.code?uncap_first}Dao.find(sqlId, mappedClass, modelArgss);
	}

	@Override
	public List<Map<String, Object>> find${poMapper.code}(String sqlId, ModelArgs... modelArgss) {
		return this.${poMapper.code?uncap_first}Dao.find(sqlId, modelArgss);
	}

	@Override
	public <T> T get${poMapper.code}(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.${poMapper.code?uncap_first}Dao.get(sqlId, mappedClass, modelArgss);
	}

	@Override
	public Map<String, Object> get${poMapper.code}(String sqlId, ModelArgs... modelArgss) {
		return this.${poMapper.code?uncap_first}Dao.get(sqlId, modelArgss);
	}

	@Override
	public <T> PaginationDto<T> pagination${poMapper.code}(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.${poMapper.code?uncap_first}Dao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, mappedClass, modelArgss);
	}

	@Override
	public PaginationDto<Map<String, Object>> pagination${poMapper.code}(String readSqlId, String findSqlId, int paginationNo,
			int paginationSize, ModelArgs... modelArgss) {
		return this.${poMapper.code?uncap_first}Dao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, modelArgss);
	}

	@Override
	public <T> T read${poMapper.code}(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss) {
		return this.${poMapper.code?uncap_first}Dao.read(sqlId, readFieldId, requiredType, modelArgss);
	}

	@Override
	public int read${poMapper.code}(String sqlId, String readFieldId, ModelArgs... modelArgss) {
		return this.${poMapper.code?uncap_first}Dao.read(sqlId, readFieldId, modelArgss);
	}

	@Override
	public <T> List<T> readList${poMapper.code}(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss) {
		return this.${poMapper.code?uncap_first}Dao.readList(sqlId, readFieldId, elementType, modelArgss);
	}
	
	@Override
	public int remove${poMapper.code}(String sqlId, Object... objects){
		return this.${poMapper.code?uncap_first}Dao.remove(sqlId, objects);
	}

	@Override
	public int remove${poMapper.code}(String sqlId, ModelArgs... modelArgss) {
		return this.${poMapper.code?uncap_first}Dao.remove(sqlId, modelArgss);
	}

	@Override
	public int save${poMapper.code}(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss) {
		return this.${poMapper.code?uncap_first}Dao.save(sqlIdSuffixName, isCreate, modelArgss);
	}

	@Override
	public int save${poMapper.code}(String sqlIdSuffixName, Boolean isCreate, Object... objects) {
		return this.${poMapper.code?uncap_first}Dao.save(sqlIdSuffixName, isCreate, objects);
	}

	@Override
	public int save${poMapper.code}(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss) {
		return this.${poMapper.code?uncap_first}Dao.save(saveSqlId, isCreate, readSqlId, createSqlId, modelArgss);
	}

	@Override
	public int save${poMapper.code}(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects) {
		return this.${poMapper.code?uncap_first}Dao.save(saveSqlId, isCreate, readSqlId, createSqlId, objects);
	}
</#list>
}
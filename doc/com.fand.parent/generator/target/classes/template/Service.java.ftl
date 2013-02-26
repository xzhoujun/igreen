<#include "macro_.ftl">
package ${packageCode}.${moduleMapperKey}.service;

import java.util.List;
import java.util.Map;

import com.fand.builder.ModelArgs;
import com.fand.dto.PaginationDto;
import com.fand.extend.service.SimpleService;

/**
 * ${businessMapper.name!businessCode}
 *
 * @author ${author!'yaoht'}
 */
public interface ${businessCode}Service extends SimpleService {
<#list poMapperList as poMapper>
	/**
	 * 创建<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int create${poMapper.code}(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss);

	/**
	 * 创建<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param objects
	 *            对象集合
	 * @return 影响行数
	 */
	int create${poMapper.code}(String sqlIdSuffixName, Boolean isSave, Object... objects);

	/**
	 * 创建<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param readSqlId
	 *            读取sql标识
	 * @param createSqlId
	 *            创建sql标识
	 * @param isSave
	 *            是否保存
	 * @param saveSqlId
	 *            保存sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int create${poMapper.code}(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss);

	/**
	 * 创建<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param readSqlId
	 *            读取sql标识
	 * @param createSqlId
	 *            创建sql标识
	 * @param isSave
	 *            是否保存
	 * @param saveSqlId
	 *            保存sql标识
	 * @param objects
	 *            对象集合
	 * @return 影响行数
	 */
	int create${poMapper.code}(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects);

	/**
	 * 查询<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	<T> List<T> find${poMapper.code}(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 查询<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	List<Map<String, Object>> find${poMapper.code}(String sqlId, ModelArgs... modelArgss);

	/**
	 * 获取<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	<T> T get${poMapper.code}(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 获取<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	Map<String, Object> get${poMapper.code}(String sqlId, ModelArgs... modelArgss);

	/**
	 * 分页<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param readSqlId
	 *            读取sql标识
	 * @param findSqlId
	 *            查询sql标识
	 * @param paginationNo
	 *            分页号
	 * @param paginationSize
	 *            分页大小
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 分页对象
	 */
	<T> PaginationDto<T> pagination${poMapper.code}(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 分页<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param readSqlId
	 *            读取sql标识
	 * @param findSqlId
	 *            查询sql标识
	 * @param paginationNo
	 *            分页号
	 * @param paginationSize
	 *            分页大小
	 * @param modelArgss
	 *            model参数
	 * @return 分页对象
	 */
	PaginationDto<Map<String, Object>> pagination${poMapper.code}(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			ModelArgs... modelArgss);

	/**
	 * 读取<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param readFieldId
	 *            读取字段标识
	 * @param requiredType
	 *            数据类型
	 * @param modelArgss
	 *            modelArgss
	 * @return 字段值
	 */
	<T> T read${poMapper.code}(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss);

	/**
	 * 读取<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param readFieldId
	 *            读取字段标识
	 * @param modelArgss
	 *            modelArgss
	 * @return 总数
	 */
	int read${poMapper.code}(String sqlId, String readFieldId, ModelArgs... modelArgss);

	/**
	 * 读取<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param readFieldId
	 *            读取字段标识
	 * @param elementType
	 *            数据类型
	 * @param modelArgss
	 *            modelArgss
	 * @return 字段值列表
	 */
	<T> List<T> readList${poMapper.code}(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss);
	
	/**
	 * 删除
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int remove${poMapper.code}(String sqlId, Object... objects);

	/**
	 * 删除<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int remove${poMapper.code}(String sqlId, ModelArgs... modelArgss);

	/**
	 * 保存<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int save${poMapper.code}(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss);

	/**
	 * 保存<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int save${poMapper.code}(String sqlIdSuffixName, Boolean isCreate, Object... objects);

	/**
	 * 保存<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param saveSqlId
	 *            保存sql标识
	 * @param isCreate
	 *            是否创建
	 * @param readSqlId
	 *            读取sql标识
	 * @param createSqlId
	 *            创建sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int save${poMapper.code}(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss);

	/**
	 * 保存<@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 * 
	 * @param saveSqlId
	 *            保存sql标识
	 * @param isCreate
	 *            是否创建
	 * @param readSqlId
	 *            读取sql标识
	 * @param createSqlId
	 *            创建sql标识
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int save${poMapper.code}(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects);
</#list>
}
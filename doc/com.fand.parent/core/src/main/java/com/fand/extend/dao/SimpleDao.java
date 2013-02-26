package com.fand.extend.dao;

import java.util.List;
import java.util.Map;

import com.fand.builder.ModelArgs;
import com.fand.dto.PaginationDto;

/**
 * 简易dao接口
 * 
 * @author yaoht
 */
public interface SimpleDao {
	/**
	 * 创建
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int create(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss);

	/**
	 * 创建
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param objects
	 *            对象集合
	 * @return 影响行数
	 */
	int create(String sqlIdSuffixName, Boolean isSave, Object... objects);

	/**
	 * 创建
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelList
	 *            modelList
	 * @return 影响行数
	 */
	int create(String sqlId, List<Map<String, Object>> modelList);

	/**
	 * 创建
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param model
	 *            model
	 * @return 影响行数
	 */
	int create(String sqlId, Map<String, Object> model);

	/**
	 * 创建
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
	int create(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss);

	/**
	 * 创建
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
	int create(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects);

	/**
	 * 查询
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param model
	 *            model
	 * @return 行字段值对象列表
	 */
	<T> List<T> find(String sqlId, Class<T> mappedClass, Map<String, Object> model);

	/**
	 * 查询
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	<T> List<T> find(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 查询
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param model
	 *            model
	 * @return 行字段值对象列表
	 */
	List<Map<String, Object>> find(String sqlId, Map<String, Object> model);

	/**
	 * 查询
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	List<Map<String, Object>> find(String sqlId, ModelArgs... modelArgss);

	/**
	 * 获取
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param model
	 *            model
	 * @return 行字段值对象
	 */
	<T> T get(String sqlId, Class<T> mappedClass, Map<String, Object> model);

	/**
	 * 获取
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	<T> T get(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 获取
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param model
	 *            model
	 * @return 行字段值对象
	 */
	Map<String, Object> get(String sqlId, Map<String, Object> model);

	/**
	 * 获取
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	Map<String, Object> get(String sqlId, ModelArgs... modelArgss);

	/**
	 * 分页
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
	 * @param model
	 *            model
	 * @return 分页对象
	 */
	<T> PaginationDto<T> pagination(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, Map<String, Object> model);

	/**
	 * 分页
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
	<T> PaginationDto<T> pagination(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 分页
	 * 
	 * @param readSqlId
	 *            读取sql标识
	 * @param findSqlId
	 *            查询sql标识
	 * @param paginationNo
	 *            分页号
	 * @param paginationSize
	 *            分页大小
	 * @param model
	 *            model
	 * @return 分页对象
	 */
	PaginationDto<Map<String, Object>> pagination(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Map<String, Object> model);

	/**
	 * 分页
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
	PaginationDto<Map<String, Object>> pagination(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			ModelArgs... modelArgss);

	/**
	 * 读取
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param readFieldId
	 *            读取字段标识
	 * @param requiredType
	 *            数据类型
	 * @param model
	 *            model
	 * @return 字段值
	 */
	<T> T read(String sqlId, String readFieldId, Class<T> requiredType, Map<String, Object> model);

	/**
	 * 读取
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
	<T> T read(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss);

	/**
	 * 读取
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param readFieldId
	 *            读取字段标识
	 * @param model
	 *            model
	 * @return 总数
	 */
	int read(String sqlId, String readFieldId, Map<String, Object> model);

	/**
	 * 读取
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param readFieldId
	 *            读取字段标识
	 * @param modelArgss
	 *            modelArgss
	 * @return 总数
	 */
	int read(String sqlId, String readFieldId, ModelArgs... modelArgss);

	/**
	 * 读取
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param readFieldId
	 *            读取字段标识
	 * @param elementType
	 *            数据类型
	 * @param model
	 *            model
	 * @return 字段值列表
	 */
	<T> List<T> readList(String sqlId, String readFieldId, Class<T> elementType, Map<String, Object> model);

	/**
	 * 读取
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
	<T> List<T> readList(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss);

	/**
	 * 删除
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelList
	 *            modelList
	 * @return 影响行数
	 */
	int remove(String sqlId, List<Map<String, Object>> modelList);

	/**
	 * 删除
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param model
	 *            model
	 * @return 影响行数
	 */
	int remove(String sqlId, Map<String, Object> model);

	/**
	 * 删除
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int remove(String sqlId, ModelArgs... modelArgss);

	/**
	 * 删除
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int remove(String sqlId, Object... objects);

	/**
	 * 保存
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int save(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss);

	/**
	 * 保存
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int save(String sqlIdSuffixName, Boolean isCreate, Object... objects);

	/**
	 * 保存
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
	int save(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss);

	/**
	 * 保存
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
	int save(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects);

	/**
	 * 保存
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelList
	 *            modelList
	 * @return 影响行数
	 */
	int save(String sqlId, List<Map<String, Object>> modelList);

	/**
	 * 保存
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param model
	 *            model
	 * @return 影响行数
	 */
	int save(String sqlId, Map<String, Object> model);

	/**
	 * 更新
	 * 
	 * @param defaultSqlId
	 *            默认sql标识
	 * @param sqlId
	 *            sql标识
	 * @param modelList
	 *            modelList
	 * @return 影响行数
	 */
	int update(String defaultSqlId, String sqlId, final List<Map<String, Object>> modelList);

	/**
	 * 更新
	 * 
	 * @param defaultSqlId
	 *            默认sql标识
	 * @param sqlId
	 *            sql标识
	 * @param model
	 *            model
	 * @return 影响行数
	 */
	int update(String defaultSqlId, String sqlId, final Map<String, Object> model);
}
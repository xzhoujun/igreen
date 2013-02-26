package com.sany.hrm.system.service;

import java.util.List;
import java.util.Map;

import com.fand.builder.ModelArgs;
import com.fand.dto.PaginationDto;
import com.fand.extend.service.SimpleService;

/**
 * 系统运行
 *
 * @author yaoht
 */
public interface SystemRunService extends SimpleService {
	/**
	 * 创建目录
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int createDirectory(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss);

	/**
	 * 创建目录
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param objects
	 *            对象集合
	 * @return 影响行数
	 */
	int createDirectory(String sqlIdSuffixName, Boolean isSave, Object... objects);

	/**
	 * 创建目录
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
	int createDirectory(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss);

	/**
	 * 创建目录
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
	int createDirectory(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects);

	/**
	 * 查询目录
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	<T> List<T> findDirectory(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 查询目录
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	List<Map<String, Object>> findDirectory(String sqlId, ModelArgs... modelArgss);

	/**
	 * 获取目录
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	<T> T getDirectory(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 获取目录
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	Map<String, Object> getDirectory(String sqlId, ModelArgs... modelArgss);

	/**
	 * 分页目录
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
	<T> PaginationDto<T> paginationDirectory(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 分页目录
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
	PaginationDto<Map<String, Object>> paginationDirectory(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			ModelArgs... modelArgss);

	/**
	 * 读取目录
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
	<T> T readDirectory(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss);

	/**
	 * 读取目录
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param readFieldId
	 *            读取字段标识
	 * @param modelArgss
	 *            modelArgss
	 * @return 总数
	 */
	int readDirectory(String sqlId, String readFieldId, ModelArgs... modelArgss);

	/**
	 * 读取目录
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
	<T> List<T> readListDirectory(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss);
	
	/**
	 * 删除
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int removeDirectory(String sqlId, Object... objects);

	/**
	 * 删除目录
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int removeDirectory(String sqlId, ModelArgs... modelArgss);

	/**
	 * 保存目录
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int saveDirectory(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss);

	/**
	 * 保存目录
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int saveDirectory(String sqlIdSuffixName, Boolean isCreate, Object... objects);

	/**
	 * 保存目录
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
	int saveDirectory(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss);

	/**
	 * 保存目录
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
	int saveDirectory(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects);
	/**
	 * 创建目录字段
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int createDirectoryFi(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss);

	/**
	 * 创建目录字段
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param objects
	 *            对象集合
	 * @return 影响行数
	 */
	int createDirectoryFi(String sqlIdSuffixName, Boolean isSave, Object... objects);

	/**
	 * 创建目录字段
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
	int createDirectoryFi(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss);

	/**
	 * 创建目录字段
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
	int createDirectoryFi(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects);

	/**
	 * 查询目录字段
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	<T> List<T> findDirectoryFi(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 查询目录字段
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	List<Map<String, Object>> findDirectoryFi(String sqlId, ModelArgs... modelArgss);

	/**
	 * 获取目录字段
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	<T> T getDirectoryFi(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 获取目录字段
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	Map<String, Object> getDirectoryFi(String sqlId, ModelArgs... modelArgss);

	/**
	 * 分页目录字段
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
	<T> PaginationDto<T> paginationDirectoryFi(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 分页目录字段
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
	PaginationDto<Map<String, Object>> paginationDirectoryFi(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			ModelArgs... modelArgss);

	/**
	 * 读取目录字段
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
	<T> T readDirectoryFi(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss);

	/**
	 * 读取目录字段
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param readFieldId
	 *            读取字段标识
	 * @param modelArgss
	 *            modelArgss
	 * @return 总数
	 */
	int readDirectoryFi(String sqlId, String readFieldId, ModelArgs... modelArgss);

	/**
	 * 读取目录字段
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
	<T> List<T> readListDirectoryFi(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss);
	
	/**
	 * 删除
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int removeDirectoryFi(String sqlId, Object... objects);

	/**
	 * 删除目录字段
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int removeDirectoryFi(String sqlId, ModelArgs... modelArgss);

	/**
	 * 保存目录字段
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int saveDirectoryFi(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss);

	/**
	 * 保存目录字段
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int saveDirectoryFi(String sqlIdSuffixName, Boolean isCreate, Object... objects);

	/**
	 * 保存目录字段
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
	int saveDirectoryFi(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss);

	/**
	 * 保存目录字段
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
	int saveDirectoryFi(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects);
	/**
	 * 创建目录索引
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int createDirectoryIn(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss);

	/**
	 * 创建目录索引
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param objects
	 *            对象集合
	 * @return 影响行数
	 */
	int createDirectoryIn(String sqlIdSuffixName, Boolean isSave, Object... objects);

	/**
	 * 创建目录索引
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
	int createDirectoryIn(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss);

	/**
	 * 创建目录索引
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
	int createDirectoryIn(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects);

	/**
	 * 查询目录索引
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	<T> List<T> findDirectoryIn(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 查询目录索引
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	List<Map<String, Object>> findDirectoryIn(String sqlId, ModelArgs... modelArgss);

	/**
	 * 获取目录索引
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	<T> T getDirectoryIn(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 获取目录索引
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	Map<String, Object> getDirectoryIn(String sqlId, ModelArgs... modelArgss);

	/**
	 * 分页目录索引
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
	<T> PaginationDto<T> paginationDirectoryIn(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 分页目录索引
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
	PaginationDto<Map<String, Object>> paginationDirectoryIn(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			ModelArgs... modelArgss);

	/**
	 * 读取目录索引
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
	<T> T readDirectoryIn(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss);

	/**
	 * 读取目录索引
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param readFieldId
	 *            读取字段标识
	 * @param modelArgss
	 *            modelArgss
	 * @return 总数
	 */
	int readDirectoryIn(String sqlId, String readFieldId, ModelArgs... modelArgss);

	/**
	 * 读取目录索引
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
	<T> List<T> readListDirectoryIn(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss);
	
	/**
	 * 删除
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int removeDirectoryIn(String sqlId, Object... objects);

	/**
	 * 删除目录索引
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int removeDirectoryIn(String sqlId, ModelArgs... modelArgss);

	/**
	 * 保存目录索引
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int saveDirectoryIn(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss);

	/**
	 * 保存目录索引
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int saveDirectoryIn(String sqlIdSuffixName, Boolean isCreate, Object... objects);

	/**
	 * 保存目录索引
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
	int saveDirectoryIn(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss);

	/**
	 * 保存目录索引
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
	int saveDirectoryIn(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects);
	/**
	 * 创建分区
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int createPartition(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss);

	/**
	 * 创建分区
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param objects
	 *            对象集合
	 * @return 影响行数
	 */
	int createPartition(String sqlIdSuffixName, Boolean isSave, Object... objects);

	/**
	 * 创建分区
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
	int createPartition(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss);

	/**
	 * 创建分区
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
	int createPartition(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects);

	/**
	 * 查询分区
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	<T> List<T> findPartition(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 查询分区
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	List<Map<String, Object>> findPartition(String sqlId, ModelArgs... modelArgss);

	/**
	 * 获取分区
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	<T> T getPartition(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 获取分区
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	Map<String, Object> getPartition(String sqlId, ModelArgs... modelArgss);

	/**
	 * 分页分区
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
	<T> PaginationDto<T> paginationPartition(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 分页分区
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
	PaginationDto<Map<String, Object>> paginationPartition(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			ModelArgs... modelArgss);

	/**
	 * 读取分区
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
	<T> T readPartition(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss);

	/**
	 * 读取分区
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param readFieldId
	 *            读取字段标识
	 * @param modelArgss
	 *            modelArgss
	 * @return 总数
	 */
	int readPartition(String sqlId, String readFieldId, ModelArgs... modelArgss);

	/**
	 * 读取分区
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
	<T> List<T> readListPartition(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss);
	
	/**
	 * 删除
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int removePartition(String sqlId, Object... objects);

	/**
	 * 删除分区
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int removePartition(String sqlId, ModelArgs... modelArgss);

	/**
	 * 保存分区
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int savePartition(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss);

	/**
	 * 保存分区
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int savePartition(String sqlIdSuffixName, Boolean isCreate, Object... objects);

	/**
	 * 保存分区
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
	int savePartition(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss);

	/**
	 * 保存分区
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
	int savePartition(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects);
	/**
	 * 创建资源
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int createResource(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss);

	/**
	 * 创建资源
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param objects
	 *            对象集合
	 * @return 影响行数
	 */
	int createResource(String sqlIdSuffixName, Boolean isSave, Object... objects);

	/**
	 * 创建资源
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
	int createResource(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss);

	/**
	 * 创建资源
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
	int createResource(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects);

	/**
	 * 查询资源
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	<T> List<T> findResource(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 查询资源
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	List<Map<String, Object>> findResource(String sqlId, ModelArgs... modelArgss);

	/**
	 * 获取资源
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	<T> T getResource(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 获取资源
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	Map<String, Object> getResource(String sqlId, ModelArgs... modelArgss);

	/**
	 * 分页资源
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
	<T> PaginationDto<T> paginationResource(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 分页资源
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
	PaginationDto<Map<String, Object>> paginationResource(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			ModelArgs... modelArgss);

	/**
	 * 读取资源
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
	<T> T readResource(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss);

	/**
	 * 读取资源
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param readFieldId
	 *            读取字段标识
	 * @param modelArgss
	 *            modelArgss
	 * @return 总数
	 */
	int readResource(String sqlId, String readFieldId, ModelArgs... modelArgss);

	/**
	 * 读取资源
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
	<T> List<T> readListResource(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss);
	
	/**
	 * 删除
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int removeResource(String sqlId, Object... objects);

	/**
	 * 删除资源
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int removeResource(String sqlId, ModelArgs... modelArgss);

	/**
	 * 保存资源
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int saveResource(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss);

	/**
	 * 保存资源
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int saveResource(String sqlIdSuffixName, Boolean isCreate, Object... objects);

	/**
	 * 保存资源
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
	int saveResource(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss);

	/**
	 * 保存资源
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
	int saveResource(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects);
	/**
	 * 创建资源字段
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int createResourceFi(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss);

	/**
	 * 创建资源字段
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param objects
	 *            对象集合
	 * @return 影响行数
	 */
	int createResourceFi(String sqlIdSuffixName, Boolean isSave, Object... objects);

	/**
	 * 创建资源字段
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
	int createResourceFi(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss);

	/**
	 * 创建资源字段
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
	int createResourceFi(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects);

	/**
	 * 查询资源字段
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	<T> List<T> findResourceFi(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 查询资源字段
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	List<Map<String, Object>> findResourceFi(String sqlId, ModelArgs... modelArgss);

	/**
	 * 获取资源字段
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	<T> T getResourceFi(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 获取资源字段
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	Map<String, Object> getResourceFi(String sqlId, ModelArgs... modelArgss);

	/**
	 * 分页资源字段
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
	<T> PaginationDto<T> paginationResourceFi(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 分页资源字段
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
	PaginationDto<Map<String, Object>> paginationResourceFi(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			ModelArgs... modelArgss);

	/**
	 * 读取资源字段
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
	<T> T readResourceFi(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss);

	/**
	 * 读取资源字段
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param readFieldId
	 *            读取字段标识
	 * @param modelArgss
	 *            modelArgss
	 * @return 总数
	 */
	int readResourceFi(String sqlId, String readFieldId, ModelArgs... modelArgss);

	/**
	 * 读取资源字段
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
	<T> List<T> readListResourceFi(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss);
	
	/**
	 * 删除
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int removeResourceFi(String sqlId, Object... objects);

	/**
	 * 删除资源字段
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int removeResourceFi(String sqlId, ModelArgs... modelArgss);

	/**
	 * 保存资源字段
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int saveResourceFi(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss);

	/**
	 * 保存资源字段
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int saveResourceFi(String sqlIdSuffixName, Boolean isCreate, Object... objects);

	/**
	 * 保存资源字段
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
	int saveResourceFi(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss);

	/**
	 * 保存资源字段
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
	int saveResourceFi(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects);
	/**
	 * 创建资源索引
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int createResourceIn(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss);

	/**
	 * 创建资源索引
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isSave
	 *            是否保存
	 * @param objects
	 *            对象集合
	 * @return 影响行数
	 */
	int createResourceIn(String sqlIdSuffixName, Boolean isSave, Object... objects);

	/**
	 * 创建资源索引
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
	int createResourceIn(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss);

	/**
	 * 创建资源索引
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
	int createResourceIn(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects);

	/**
	 * 查询资源索引
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	<T> List<T> findResourceIn(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 查询资源索引
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象列表
	 */
	List<Map<String, Object>> findResourceIn(String sqlId, ModelArgs... modelArgss);

	/**
	 * 获取资源索引
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param mappedClass
	 *            数据类型
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	<T> T getResourceIn(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 获取资源索引
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 行字段值对象
	 */
	Map<String, Object> getResourceIn(String sqlId, ModelArgs... modelArgss);

	/**
	 * 分页资源索引
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
	<T> PaginationDto<T> paginationResourceIn(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss);

	/**
	 * 分页资源索引
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
	PaginationDto<Map<String, Object>> paginationResourceIn(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			ModelArgs... modelArgss);

	/**
	 * 读取资源索引
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
	<T> T readResourceIn(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss);

	/**
	 * 读取资源索引
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param readFieldId
	 *            读取字段标识
	 * @param modelArgss
	 *            modelArgss
	 * @return 总数
	 */
	int readResourceIn(String sqlId, String readFieldId, ModelArgs... modelArgss);

	/**
	 * 读取资源索引
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
	<T> List<T> readListResourceIn(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss);
	
	/**
	 * 删除
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int removeResourceIn(String sqlId, Object... objects);

	/**
	 * 删除资源索引
	 * 
	 * @param sqlId
	 *            sql标识
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int removeResourceIn(String sqlId, ModelArgs... modelArgss);

	/**
	 * 保存资源索引
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param modelArgss
	 *            model参数
	 * @return 影响行数
	 */
	int saveResourceIn(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss);

	/**
	 * 保存资源索引
	 * 
	 * @param sqlIdSuffixName
	 *            sql标识后缀
	 * @param isCreate
	 *            是否创建
	 * @param objects
	 *            model参数
	 * @return 影响行数
	 */
	int saveResourceIn(String sqlIdSuffixName, Boolean isCreate, Object... objects);

	/**
	 * 保存资源索引
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
	int saveResourceIn(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss);

	/**
	 * 保存资源索引
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
	int saveResourceIn(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects);
}
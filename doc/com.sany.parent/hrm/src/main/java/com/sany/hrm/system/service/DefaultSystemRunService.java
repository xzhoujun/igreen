package com.sany.hrm.system.service;

import java.util.List;
import java.util.Map;

import com.fand.builder.ModelArgs;
import com.fand.dto.PaginationDto;
import com.fand.extend.service.DefaultSimpleService;
import com.sany.hrm.system.service.SystemRunService;
import com.sany.hrm.system.dao.SystemRunDao;
import com.sany.hrm.system.dao.DirectoryDao;
import com.sany.hrm.system.dao.DirectoryFiDao;
import com.sany.hrm.system.dao.DirectoryInDao;
import com.sany.hrm.system.dao.PartitionDao;
import com.sany.hrm.system.dao.ResourceDao;
import com.sany.hrm.system.dao.ResourceFiDao;
import com.sany.hrm.system.dao.ResourceInDao;

/**
 * 系统运行
 *
 * @author yaoht
 * 
 */
public class DefaultSystemRunService extends DefaultSimpleService<SystemRunDao> implements SystemRunService {
	/**
	 * 目录
	 */
	private DirectoryDao directoryDao;

	/**
	 * 目录字段
	 */
	private DirectoryFiDao directoryFiDao;

	/**
	 * 目录索引
	 */
	private DirectoryInDao directoryInDao;

	/**
	 * 分区
	 */
	private PartitionDao partitionDao;

	/**
	 * 资源
	 */
	private ResourceDao resourceDao;

	/**
	 * 资源字段
	 */
	private ResourceFiDao resourceFiDao;

	/**
	 * 资源索引
	 */
	private ResourceInDao resourceInDao;


	/**
	 * 目录
	 * 
	 * @param directoryDao
	 *            目录
	 */
	public void setDirectoryDao(DirectoryDao directoryDao) {
		this.directoryDao = directoryDao;
	}

	/**
	 * 目录字段
	 * 
	 * @param directoryFiDao
	 *            目录字段
	 */
	public void setDirectoryFiDao(DirectoryFiDao directoryFiDao) {
		this.directoryFiDao = directoryFiDao;
	}

	/**
	 * 目录索引
	 * 
	 * @param directoryInDao
	 *            目录索引
	 */
	public void setDirectoryInDao(DirectoryInDao directoryInDao) {
		this.directoryInDao = directoryInDao;
	}

	/**
	 * 分区
	 * 
	 * @param partitionDao
	 *            分区
	 */
	public void setPartitionDao(PartitionDao partitionDao) {
		this.partitionDao = partitionDao;
	}

	/**
	 * 资源
	 * 
	 * @param resourceDao
	 *            资源
	 */
	public void setResourceDao(ResourceDao resourceDao) {
		this.resourceDao = resourceDao;
	}

	/**
	 * 资源字段
	 * 
	 * @param resourceFiDao
	 *            资源字段
	 */
	public void setResourceFiDao(ResourceFiDao resourceFiDao) {
		this.resourceFiDao = resourceFiDao;
	}

	/**
	 * 资源索引
	 * 
	 * @param resourceInDao
	 *            资源索引
	 */
	public void setResourceInDao(ResourceInDao resourceInDao) {
		this.resourceInDao = resourceInDao;
	}

	@Override
	public int createDirectory(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss) {
		return this.directoryDao.create(sqlIdSuffixName, isSave, modelArgss);
	}

	@Override
	public int createDirectory(String sqlIdSuffixName, Boolean isSave, Object... objects) {
		return this.directoryDao.create(sqlIdSuffixName, isSave, objects);
	}

	@Override
	public int createDirectory(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss) {
		return this.directoryDao.create(readSqlId, createSqlId, isSave, saveSqlId, modelArgss);
	}

	@Override
	public int createDirectory(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects) {
		return this.directoryDao.create(readSqlId, createSqlId, isSave, saveSqlId, objects);
	}

	@Override
	public <T> List<T> findDirectory(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.directoryDao.find(sqlId, mappedClass, modelArgss);
	}

	@Override
	public List<Map<String, Object>> findDirectory(String sqlId, ModelArgs... modelArgss) {
		return this.directoryDao.find(sqlId, modelArgss);
	}

	@Override
	public <T> T getDirectory(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.directoryDao.get(sqlId, mappedClass, modelArgss);
	}

	@Override
	public Map<String, Object> getDirectory(String sqlId, ModelArgs... modelArgss) {
		return this.directoryDao.get(sqlId, modelArgss);
	}

	@Override
	public <T> PaginationDto<T> paginationDirectory(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.directoryDao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, mappedClass, modelArgss);
	}

	@Override
	public PaginationDto<Map<String, Object>> paginationDirectory(String readSqlId, String findSqlId, int paginationNo,
			int paginationSize, ModelArgs... modelArgss) {
		return this.directoryDao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, modelArgss);
	}

	@Override
	public <T> T readDirectory(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss) {
		return this.directoryDao.read(sqlId, readFieldId, requiredType, modelArgss);
	}

	@Override
	public int readDirectory(String sqlId, String readFieldId, ModelArgs... modelArgss) {
		return this.directoryDao.read(sqlId, readFieldId, modelArgss);
	}

	@Override
	public <T> List<T> readListDirectory(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss) {
		return this.directoryDao.readList(sqlId, readFieldId, elementType, modelArgss);
	}
	
	@Override
	public int removeDirectory(String sqlId, Object... objects){
		return this.directoryDao.remove(sqlId, objects);
	}

	@Override
	public int removeDirectory(String sqlId, ModelArgs... modelArgss) {
		return this.directoryDao.remove(sqlId, modelArgss);
	}

	@Override
	public int saveDirectory(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss) {
		return this.directoryDao.save(sqlIdSuffixName, isCreate, modelArgss);
	}

	@Override
	public int saveDirectory(String sqlIdSuffixName, Boolean isCreate, Object... objects) {
		return this.directoryDao.save(sqlIdSuffixName, isCreate, objects);
	}

	@Override
	public int saveDirectory(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss) {
		return this.directoryDao.save(saveSqlId, isCreate, readSqlId, createSqlId, modelArgss);
	}

	@Override
	public int saveDirectory(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects) {
		return this.directoryDao.save(saveSqlId, isCreate, readSqlId, createSqlId, objects);
	}

	@Override
	public int createDirectoryFi(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss) {
		return this.directoryFiDao.create(sqlIdSuffixName, isSave, modelArgss);
	}

	@Override
	public int createDirectoryFi(String sqlIdSuffixName, Boolean isSave, Object... objects) {
		return this.directoryFiDao.create(sqlIdSuffixName, isSave, objects);
	}

	@Override
	public int createDirectoryFi(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss) {
		return this.directoryFiDao.create(readSqlId, createSqlId, isSave, saveSqlId, modelArgss);
	}

	@Override
	public int createDirectoryFi(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects) {
		return this.directoryFiDao.create(readSqlId, createSqlId, isSave, saveSqlId, objects);
	}

	@Override
	public <T> List<T> findDirectoryFi(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.directoryFiDao.find(sqlId, mappedClass, modelArgss);
	}

	@Override
	public List<Map<String, Object>> findDirectoryFi(String sqlId, ModelArgs... modelArgss) {
		return this.directoryFiDao.find(sqlId, modelArgss);
	}

	@Override
	public <T> T getDirectoryFi(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.directoryFiDao.get(sqlId, mappedClass, modelArgss);
	}

	@Override
	public Map<String, Object> getDirectoryFi(String sqlId, ModelArgs... modelArgss) {
		return this.directoryFiDao.get(sqlId, modelArgss);
	}

	@Override
	public <T> PaginationDto<T> paginationDirectoryFi(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.directoryFiDao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, mappedClass, modelArgss);
	}

	@Override
	public PaginationDto<Map<String, Object>> paginationDirectoryFi(String readSqlId, String findSqlId, int paginationNo,
			int paginationSize, ModelArgs... modelArgss) {
		return this.directoryFiDao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, modelArgss);
	}

	@Override
	public <T> T readDirectoryFi(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss) {
		return this.directoryFiDao.read(sqlId, readFieldId, requiredType, modelArgss);
	}

	@Override
	public int readDirectoryFi(String sqlId, String readFieldId, ModelArgs... modelArgss) {
		return this.directoryFiDao.read(sqlId, readFieldId, modelArgss);
	}

	@Override
	public <T> List<T> readListDirectoryFi(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss) {
		return this.directoryFiDao.readList(sqlId, readFieldId, elementType, modelArgss);
	}
	
	@Override
	public int removeDirectoryFi(String sqlId, Object... objects){
		return this.directoryFiDao.remove(sqlId, objects);
	}

	@Override
	public int removeDirectoryFi(String sqlId, ModelArgs... modelArgss) {
		return this.directoryFiDao.remove(sqlId, modelArgss);
	}

	@Override
	public int saveDirectoryFi(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss) {
		return this.directoryFiDao.save(sqlIdSuffixName, isCreate, modelArgss);
	}

	@Override
	public int saveDirectoryFi(String sqlIdSuffixName, Boolean isCreate, Object... objects) {
		return this.directoryFiDao.save(sqlIdSuffixName, isCreate, objects);
	}

	@Override
	public int saveDirectoryFi(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss) {
		return this.directoryFiDao.save(saveSqlId, isCreate, readSqlId, createSqlId, modelArgss);
	}

	@Override
	public int saveDirectoryFi(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects) {
		return this.directoryFiDao.save(saveSqlId, isCreate, readSqlId, createSqlId, objects);
	}

	@Override
	public int createDirectoryIn(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss) {
		return this.directoryInDao.create(sqlIdSuffixName, isSave, modelArgss);
	}

	@Override
	public int createDirectoryIn(String sqlIdSuffixName, Boolean isSave, Object... objects) {
		return this.directoryInDao.create(sqlIdSuffixName, isSave, objects);
	}

	@Override
	public int createDirectoryIn(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss) {
		return this.directoryInDao.create(readSqlId, createSqlId, isSave, saveSqlId, modelArgss);
	}

	@Override
	public int createDirectoryIn(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects) {
		return this.directoryInDao.create(readSqlId, createSqlId, isSave, saveSqlId, objects);
	}

	@Override
	public <T> List<T> findDirectoryIn(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.directoryInDao.find(sqlId, mappedClass, modelArgss);
	}

	@Override
	public List<Map<String, Object>> findDirectoryIn(String sqlId, ModelArgs... modelArgss) {
		return this.directoryInDao.find(sqlId, modelArgss);
	}

	@Override
	public <T> T getDirectoryIn(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.directoryInDao.get(sqlId, mappedClass, modelArgss);
	}

	@Override
	public Map<String, Object> getDirectoryIn(String sqlId, ModelArgs... modelArgss) {
		return this.directoryInDao.get(sqlId, modelArgss);
	}

	@Override
	public <T> PaginationDto<T> paginationDirectoryIn(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.directoryInDao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, mappedClass, modelArgss);
	}

	@Override
	public PaginationDto<Map<String, Object>> paginationDirectoryIn(String readSqlId, String findSqlId, int paginationNo,
			int paginationSize, ModelArgs... modelArgss) {
		return this.directoryInDao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, modelArgss);
	}

	@Override
	public <T> T readDirectoryIn(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss) {
		return this.directoryInDao.read(sqlId, readFieldId, requiredType, modelArgss);
	}

	@Override
	public int readDirectoryIn(String sqlId, String readFieldId, ModelArgs... modelArgss) {
		return this.directoryInDao.read(sqlId, readFieldId, modelArgss);
	}

	@Override
	public <T> List<T> readListDirectoryIn(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss) {
		return this.directoryInDao.readList(sqlId, readFieldId, elementType, modelArgss);
	}
	
	@Override
	public int removeDirectoryIn(String sqlId, Object... objects){
		return this.directoryInDao.remove(sqlId, objects);
	}

	@Override
	public int removeDirectoryIn(String sqlId, ModelArgs... modelArgss) {
		return this.directoryInDao.remove(sqlId, modelArgss);
	}

	@Override
	public int saveDirectoryIn(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss) {
		return this.directoryInDao.save(sqlIdSuffixName, isCreate, modelArgss);
	}

	@Override
	public int saveDirectoryIn(String sqlIdSuffixName, Boolean isCreate, Object... objects) {
		return this.directoryInDao.save(sqlIdSuffixName, isCreate, objects);
	}

	@Override
	public int saveDirectoryIn(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss) {
		return this.directoryInDao.save(saveSqlId, isCreate, readSqlId, createSqlId, modelArgss);
	}

	@Override
	public int saveDirectoryIn(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects) {
		return this.directoryInDao.save(saveSqlId, isCreate, readSqlId, createSqlId, objects);
	}

	@Override
	public int createPartition(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss) {
		return this.partitionDao.create(sqlIdSuffixName, isSave, modelArgss);
	}

	@Override
	public int createPartition(String sqlIdSuffixName, Boolean isSave, Object... objects) {
		return this.partitionDao.create(sqlIdSuffixName, isSave, objects);
	}

	@Override
	public int createPartition(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss) {
		return this.partitionDao.create(readSqlId, createSqlId, isSave, saveSqlId, modelArgss);
	}

	@Override
	public int createPartition(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects) {
		return this.partitionDao.create(readSqlId, createSqlId, isSave, saveSqlId, objects);
	}

	@Override
	public <T> List<T> findPartition(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.partitionDao.find(sqlId, mappedClass, modelArgss);
	}

	@Override
	public List<Map<String, Object>> findPartition(String sqlId, ModelArgs... modelArgss) {
		return this.partitionDao.find(sqlId, modelArgss);
	}

	@Override
	public <T> T getPartition(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.partitionDao.get(sqlId, mappedClass, modelArgss);
	}

	@Override
	public Map<String, Object> getPartition(String sqlId, ModelArgs... modelArgss) {
		return this.partitionDao.get(sqlId, modelArgss);
	}

	@Override
	public <T> PaginationDto<T> paginationPartition(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.partitionDao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, mappedClass, modelArgss);
	}

	@Override
	public PaginationDto<Map<String, Object>> paginationPartition(String readSqlId, String findSqlId, int paginationNo,
			int paginationSize, ModelArgs... modelArgss) {
		return this.partitionDao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, modelArgss);
	}

	@Override
	public <T> T readPartition(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss) {
		return this.partitionDao.read(sqlId, readFieldId, requiredType, modelArgss);
	}

	@Override
	public int readPartition(String sqlId, String readFieldId, ModelArgs... modelArgss) {
		return this.partitionDao.read(sqlId, readFieldId, modelArgss);
	}

	@Override
	public <T> List<T> readListPartition(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss) {
		return this.partitionDao.readList(sqlId, readFieldId, elementType, modelArgss);
	}
	
	@Override
	public int removePartition(String sqlId, Object... objects){
		return this.partitionDao.remove(sqlId, objects);
	}

	@Override
	public int removePartition(String sqlId, ModelArgs... modelArgss) {
		return this.partitionDao.remove(sqlId, modelArgss);
	}

	@Override
	public int savePartition(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss) {
		return this.partitionDao.save(sqlIdSuffixName, isCreate, modelArgss);
	}

	@Override
	public int savePartition(String sqlIdSuffixName, Boolean isCreate, Object... objects) {
		return this.partitionDao.save(sqlIdSuffixName, isCreate, objects);
	}

	@Override
	public int savePartition(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss) {
		return this.partitionDao.save(saveSqlId, isCreate, readSqlId, createSqlId, modelArgss);
	}

	@Override
	public int savePartition(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects) {
		return this.partitionDao.save(saveSqlId, isCreate, readSqlId, createSqlId, objects);
	}

	@Override
	public int createResource(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss) {
		return this.resourceDao.create(sqlIdSuffixName, isSave, modelArgss);
	}

	@Override
	public int createResource(String sqlIdSuffixName, Boolean isSave, Object... objects) {
		return this.resourceDao.create(sqlIdSuffixName, isSave, objects);
	}

	@Override
	public int createResource(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss) {
		return this.resourceDao.create(readSqlId, createSqlId, isSave, saveSqlId, modelArgss);
	}

	@Override
	public int createResource(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects) {
		return this.resourceDao.create(readSqlId, createSqlId, isSave, saveSqlId, objects);
	}

	@Override
	public <T> List<T> findResource(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.resourceDao.find(sqlId, mappedClass, modelArgss);
	}

	@Override
	public List<Map<String, Object>> findResource(String sqlId, ModelArgs... modelArgss) {
		return this.resourceDao.find(sqlId, modelArgss);
	}

	@Override
	public <T> T getResource(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.resourceDao.get(sqlId, mappedClass, modelArgss);
	}

	@Override
	public Map<String, Object> getResource(String sqlId, ModelArgs... modelArgss) {
		return this.resourceDao.get(sqlId, modelArgss);
	}

	@Override
	public <T> PaginationDto<T> paginationResource(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.resourceDao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, mappedClass, modelArgss);
	}

	@Override
	public PaginationDto<Map<String, Object>> paginationResource(String readSqlId, String findSqlId, int paginationNo,
			int paginationSize, ModelArgs... modelArgss) {
		return this.resourceDao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, modelArgss);
	}

	@Override
	public <T> T readResource(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss) {
		return this.resourceDao.read(sqlId, readFieldId, requiredType, modelArgss);
	}

	@Override
	public int readResource(String sqlId, String readFieldId, ModelArgs... modelArgss) {
		return this.resourceDao.read(sqlId, readFieldId, modelArgss);
	}

	@Override
	public <T> List<T> readListResource(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss) {
		return this.resourceDao.readList(sqlId, readFieldId, elementType, modelArgss);
	}
	
	@Override
	public int removeResource(String sqlId, Object... objects){
		return this.resourceDao.remove(sqlId, objects);
	}

	@Override
	public int removeResource(String sqlId, ModelArgs... modelArgss) {
		return this.resourceDao.remove(sqlId, modelArgss);
	}

	@Override
	public int saveResource(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss) {
		return this.resourceDao.save(sqlIdSuffixName, isCreate, modelArgss);
	}

	@Override
	public int saveResource(String sqlIdSuffixName, Boolean isCreate, Object... objects) {
		return this.resourceDao.save(sqlIdSuffixName, isCreate, objects);
	}

	@Override
	public int saveResource(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss) {
		return this.resourceDao.save(saveSqlId, isCreate, readSqlId, createSqlId, modelArgss);
	}

	@Override
	public int saveResource(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects) {
		return this.resourceDao.save(saveSqlId, isCreate, readSqlId, createSqlId, objects);
	}

	@Override
	public int createResourceFi(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss) {
		return this.resourceFiDao.create(sqlIdSuffixName, isSave, modelArgss);
	}

	@Override
	public int createResourceFi(String sqlIdSuffixName, Boolean isSave, Object... objects) {
		return this.resourceFiDao.create(sqlIdSuffixName, isSave, objects);
	}

	@Override
	public int createResourceFi(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss) {
		return this.resourceFiDao.create(readSqlId, createSqlId, isSave, saveSqlId, modelArgss);
	}

	@Override
	public int createResourceFi(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects) {
		return this.resourceFiDao.create(readSqlId, createSqlId, isSave, saveSqlId, objects);
	}

	@Override
	public <T> List<T> findResourceFi(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.resourceFiDao.find(sqlId, mappedClass, modelArgss);
	}

	@Override
	public List<Map<String, Object>> findResourceFi(String sqlId, ModelArgs... modelArgss) {
		return this.resourceFiDao.find(sqlId, modelArgss);
	}

	@Override
	public <T> T getResourceFi(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.resourceFiDao.get(sqlId, mappedClass, modelArgss);
	}

	@Override
	public Map<String, Object> getResourceFi(String sqlId, ModelArgs... modelArgss) {
		return this.resourceFiDao.get(sqlId, modelArgss);
	}

	@Override
	public <T> PaginationDto<T> paginationResourceFi(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.resourceFiDao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, mappedClass, modelArgss);
	}

	@Override
	public PaginationDto<Map<String, Object>> paginationResourceFi(String readSqlId, String findSqlId, int paginationNo,
			int paginationSize, ModelArgs... modelArgss) {
		return this.resourceFiDao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, modelArgss);
	}

	@Override
	public <T> T readResourceFi(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss) {
		return this.resourceFiDao.read(sqlId, readFieldId, requiredType, modelArgss);
	}

	@Override
	public int readResourceFi(String sqlId, String readFieldId, ModelArgs... modelArgss) {
		return this.resourceFiDao.read(sqlId, readFieldId, modelArgss);
	}

	@Override
	public <T> List<T> readListResourceFi(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss) {
		return this.resourceFiDao.readList(sqlId, readFieldId, elementType, modelArgss);
	}
	
	@Override
	public int removeResourceFi(String sqlId, Object... objects){
		return this.resourceFiDao.remove(sqlId, objects);
	}

	@Override
	public int removeResourceFi(String sqlId, ModelArgs... modelArgss) {
		return this.resourceFiDao.remove(sqlId, modelArgss);
	}

	@Override
	public int saveResourceFi(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss) {
		return this.resourceFiDao.save(sqlIdSuffixName, isCreate, modelArgss);
	}

	@Override
	public int saveResourceFi(String sqlIdSuffixName, Boolean isCreate, Object... objects) {
		return this.resourceFiDao.save(sqlIdSuffixName, isCreate, objects);
	}

	@Override
	public int saveResourceFi(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss) {
		return this.resourceFiDao.save(saveSqlId, isCreate, readSqlId, createSqlId, modelArgss);
	}

	@Override
	public int saveResourceFi(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects) {
		return this.resourceFiDao.save(saveSqlId, isCreate, readSqlId, createSqlId, objects);
	}

	@Override
	public int createResourceIn(String sqlIdSuffixName, Boolean isSave, ModelArgs... modelArgss) {
		return this.resourceInDao.create(sqlIdSuffixName, isSave, modelArgss);
	}

	@Override
	public int createResourceIn(String sqlIdSuffixName, Boolean isSave, Object... objects) {
		return this.resourceInDao.create(sqlIdSuffixName, isSave, objects);
	}

	@Override
	public int createResourceIn(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, ModelArgs... modelArgss) {
		return this.resourceInDao.create(readSqlId, createSqlId, isSave, saveSqlId, modelArgss);
	}

	@Override
	public int createResourceIn(String readSqlId, String createSqlId, Boolean isSave, String saveSqlId, Object... objects) {
		return this.resourceInDao.create(readSqlId, createSqlId, isSave, saveSqlId, objects);
	}

	@Override
	public <T> List<T> findResourceIn(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.resourceInDao.find(sqlId, mappedClass, modelArgss);
	}

	@Override
	public List<Map<String, Object>> findResourceIn(String sqlId, ModelArgs... modelArgss) {
		return this.resourceInDao.find(sqlId, modelArgss);
	}

	@Override
	public <T> T getResourceIn(String sqlId, Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.resourceInDao.get(sqlId, mappedClass, modelArgss);
	}

	@Override
	public Map<String, Object> getResourceIn(String sqlId, ModelArgs... modelArgss) {
		return this.resourceInDao.get(sqlId, modelArgss);
	}

	@Override
	public <T> PaginationDto<T> paginationResourceIn(String readSqlId, String findSqlId, int paginationNo, int paginationSize,
			Class<T> mappedClass, ModelArgs... modelArgss) {
		return this.resourceInDao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, mappedClass, modelArgss);
	}

	@Override
	public PaginationDto<Map<String, Object>> paginationResourceIn(String readSqlId, String findSqlId, int paginationNo,
			int paginationSize, ModelArgs... modelArgss) {
		return this.resourceInDao.pagination(readSqlId, findSqlId, paginationNo, paginationSize, modelArgss);
	}

	@Override
	public <T> T readResourceIn(String sqlId, String readFieldId, Class<T> requiredType, ModelArgs... modelArgss) {
		return this.resourceInDao.read(sqlId, readFieldId, requiredType, modelArgss);
	}

	@Override
	public int readResourceIn(String sqlId, String readFieldId, ModelArgs... modelArgss) {
		return this.resourceInDao.read(sqlId, readFieldId, modelArgss);
	}

	@Override
	public <T> List<T> readListResourceIn(String sqlId, String readFieldId, Class<T> elementType, ModelArgs... modelArgss) {
		return this.resourceInDao.readList(sqlId, readFieldId, elementType, modelArgss);
	}
	
	@Override
	public int removeResourceIn(String sqlId, Object... objects){
		return this.resourceInDao.remove(sqlId, objects);
	}

	@Override
	public int removeResourceIn(String sqlId, ModelArgs... modelArgss) {
		return this.resourceInDao.remove(sqlId, modelArgss);
	}

	@Override
	public int saveResourceIn(String sqlIdSuffixName, Boolean isCreate, ModelArgs... modelArgss) {
		return this.resourceInDao.save(sqlIdSuffixName, isCreate, modelArgss);
	}

	@Override
	public int saveResourceIn(String sqlIdSuffixName, Boolean isCreate, Object... objects) {
		return this.resourceInDao.save(sqlIdSuffixName, isCreate, objects);
	}

	@Override
	public int saveResourceIn(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, ModelArgs... modelArgss) {
		return this.resourceInDao.save(saveSqlId, isCreate, readSqlId, createSqlId, modelArgss);
	}

	@Override
	public int saveResourceIn(String saveSqlId, Boolean isCreate, String readSqlId, String createSqlId, Object... objects) {
		return this.resourceInDao.save(saveSqlId, isCreate, readSqlId, createSqlId, objects);
	}
}
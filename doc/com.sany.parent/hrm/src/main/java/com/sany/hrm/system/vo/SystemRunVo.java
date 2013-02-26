package com.sany.hrm.system.vo;

import com.sany.hrm.system.dto.DirectoryDto;
import com.sany.hrm.system.dto.DirectoryFiDto;
import com.sany.hrm.system.dto.DirectoryInDto;
import com.sany.hrm.system.dto.PartitionDto;
import com.sany.hrm.system.dto.ResourceDto;
import com.sany.hrm.system.dto.ResourceFiDto;
import com.sany.hrm.system.dto.ResourceInDto;
/**
 * 系统运行
 *
 * @author yaoht
 */
public class SystemRunVo implements java.io.Serializable {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 379531889839542844L;
	
	/**
	 * 目录
	 */
	private DirectoryDto directoryDto;

	/**
	 * 目录字段
	 */
	private DirectoryFiDto directoryFiDto;

	/**
	 * 目录索引
	 */
	private DirectoryInDto directoryInDto;

	/**
	 * 分区
	 */
	private PartitionDto partitionDto;

	/**
	 * 资源
	 */
	private ResourceDto resourceDto;

	/**
	 * 资源字段
	 */
	private ResourceFiDto resourceFiDto;

	/**
	 * 资源索引
	 */
	private ResourceInDto resourceInDto;

	/**
	 * 构造
	 */
	public SystemRunVo() {
		this.directoryDto = new DirectoryDto();
		this.directoryFiDto = new DirectoryFiDto();
		this.directoryInDto = new DirectoryInDto();
		this.partitionDto = new PartitionDto();
		this.resourceDto = new ResourceDto();
		this.resourceFiDto = new ResourceFiDto();
		this.resourceInDto = new ResourceInDto();
	}

	/**
     * 获取
     *
	 * @return 目录
	 */
	public DirectoryDto getDirectoryDto() {
		return this.directoryDto;
	}


	/**
     * 获取
     *
	 * @return 目录字段
	 */
	public DirectoryFiDto getDirectoryFiDto() {
		return this.directoryFiDto;
	}


	/**
     * 获取
     *
	 * @return 目录索引
	 */
	public DirectoryInDto getDirectoryInDto() {
		return this.directoryInDto;
	}


	/**
     * 获取
     *
	 * @return 分区
	 */
	public PartitionDto getPartitionDto() {
		return this.partitionDto;
	}


	/**
     * 获取
     *
	 * @return 资源
	 */
	public ResourceDto getResourceDto() {
		return this.resourceDto;
	}


	/**
     * 获取
     *
	 * @return 资源字段
	 */
	public ResourceFiDto getResourceFiDto() {
		return this.resourceFiDto;
	}


	/**
     * 获取
     *
	 * @return 资源索引
	 */
	public ResourceInDto getResourceInDto() {
		return this.resourceInDto;
	}


	/**
	 * 设置
     *
	 * @param directoryDto
	 *            目录
	 */
	public void setDirectoryDto(DirectoryDto directoryDto) {
		this.directoryDto = directoryDto;
	}

	/**
	 * 设置
     *
	 * @param directoryFiDto
	 *            目录字段
	 */
	public void setDirectoryFiDto(DirectoryFiDto directoryFiDto) {
		this.directoryFiDto = directoryFiDto;
	}

	/**
	 * 设置
     *
	 * @param directoryInDto
	 *            目录索引
	 */
	public void setDirectoryInDto(DirectoryInDto directoryInDto) {
		this.directoryInDto = directoryInDto;
	}

	/**
	 * 设置
     *
	 * @param partitionDto
	 *            分区
	 */
	public void setPartitionDto(PartitionDto partitionDto) {
		this.partitionDto = partitionDto;
	}

	/**
	 * 设置
     *
	 * @param resourceDto
	 *            资源
	 */
	public void setResourceDto(ResourceDto resourceDto) {
		this.resourceDto = resourceDto;
	}

	/**
	 * 设置
     *
	 * @param resourceFiDto
	 *            资源字段
	 */
	public void setResourceFiDto(ResourceFiDto resourceFiDto) {
		this.resourceFiDto = resourceFiDto;
	}

	/**
	 * 设置
     *
	 * @param resourceInDto
	 *            资源索引
	 */
	public void setResourceInDto(ResourceInDto resourceInDto) {
		this.resourceInDto = resourceInDto;
	}
}
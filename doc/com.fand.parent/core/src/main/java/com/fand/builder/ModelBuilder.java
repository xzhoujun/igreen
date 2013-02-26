package com.fand.builder;

import java.util.Map;

/**
 * 对象映射生成器
 * 
 * @author yaoht
 * 
 */
public interface ModelBuilder {
	/**
	 * 对象映射生成
	 * 
	 * @return 对象映射
	 */
	Map<String, Object> build();

	/**
	 * 填充
	 * 
	 * @param value
	 *            值
	 * @param keys
	 *            键数组
	 * 
	 * @return 对象映射生成器
	 */
	ModelBuilder put(Object value, String... keys);

	/**
	 * 充值扩展
	 * 
	 * @param value
	 *            值
	 * @param keyPrefixName
	 *            键前缀名称
	 * @param keySuffixName
	 *            键后缀名称
	 * @return 对象映射生成器
	 */
	ModelBuilder putExtend(Object value, String keyPrefixName, String keySuffixName, String... keyBaseNames);

	/**
	 * 充值扩展
	 * 
	 * @param keyPrefixName
	 *            键前缀名称
	 * @param kvMap
	 *            键值映射
	 * @param keySuffixName
	 *            键后缀名称
	 * @return 对象映射生成器
	 */
	ModelBuilder putExtend(String keyPrefixName, Map<String, Object> kvMap, String keySuffixName);

	/**
	 * 填充类型或对象字段
	 * 
	 * @param keyPrefixName
	 *            键前缀名称
	 * @param keySuffixName
	 *            键后缀名称
	 * @param o
	 *            对象
	 * @param c
	 *            类型
	 * @return 对象映射生成器
	 */
	ModelBuilder putObjectField(ModelArgs modelArgs);

	/**
	 * 充值true值
	 * 
	 * @param keys
	 *            键数组
	 * @return 对象映射生成器
	 */
	ModelBuilder putTrue(String... keys);

	/**
	 * 充值true值扩展
	 * 
	 * @param keyPrefixName
	 *            键前缀名称
	 * @param keyBaseNames
	 *            键基本名称
	 * 
	 * @return 对象映射生成器
	 */
	ModelBuilder putTrueExtend(String keyPrefixName, String... keyBaseNames);

	/**
	 * 移除扩展
	 * 
	 * @param keys
	 *            键数组
	 * @return 对象映射生成器
	 */
	ModelBuilder remove(String... keys);

	/**
	 * 移除扩展
	 * 
	 * @param keyPrefixName
	 *            键前缀名称
	 * @param keySuffixName
	 *            键后缀名称
	 * @param keyBaseNames
	 *            键基本名称
	 * @return 对象映射生成器
	 */
	ModelBuilder removeExtend(String keyPrefixName, String keySuffixName, String... keyBaseNames);

	/**
	 * 设置
	 * 
	 * @param defaultKeyPrefixName
	 *            默认键值前缀名称
	 */
	ModelBuilder setDefaultKeyPrefixName(String defaultKeyPrefixName);

	/**
	 * 设置
	 * 
	 * @param defaultKeySuffixName
	 *            默认键值后缀名称
	 */
	ModelBuilder setDefaultKeySuffixName(String defaultKeySuffixName);

	/**
	 * 设置
	 * 
	 * @param defaultSimpleparator
	 *            默认间隔
	 */
	ModelBuilder setDefaultSimpleparator(String defaultSimpleparator);
}
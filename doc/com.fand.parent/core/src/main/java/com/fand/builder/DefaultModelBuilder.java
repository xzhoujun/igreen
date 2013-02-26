package com.fand.builder;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.reflect.FieldUtils;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.ReflectionUtils.FieldCallback;
import org.springframework.util.ReflectionUtils.FieldFilter;

public class DefaultModelBuilder implements ModelBuilder {

	/**
	 * 默认键值前缀名称
	 */
	protected String defaultKeyPrefixName = "where__and__eq";

	/**
	 * 默认键值后缀名称
	 */
	protected String defaultKeySuffixName = "value";

	/**
	 * 默认间隔
	 */
	protected String defaultSimpleparator = "__";

	/**
	 * 对象映射
	 */
	protected Map<String, Object> model;

	/**
	 * 对象映射生成器构造
	 */
	public DefaultModelBuilder() {
		this.model = new HashMap<String, Object>();
	}

	@Override
	public Map<String, Object> build() {
		return this.model;
	}

	@Override
	public ModelBuilder put(final Object value, final String... keys) {
		if (ArrayUtils.isEmpty(keys)) {
			return this;
		}

		final String key = StringUtils.join(keys, this.defaultSimpleparator);

		this.model.put(key, value);

		return this;
	}

	@Override
	public ModelBuilder putExtend(final Object value, String keyPrefixName, String keySuffixName, final String... keyBaseNames) {
		if (ArrayUtils.isEmpty(keyBaseNames)) {
			return this;
		}

		keyPrefixName = StringUtils.defaultIfBlank(keyPrefixName, this.defaultKeyPrefixName);

		keySuffixName = StringUtils.defaultIfBlank(keySuffixName, this.defaultKeySuffixName);

		for (final String keyBaseName : keyBaseNames) {
			this.putTrue(keyPrefixName, keyBaseName);

			this.put(value, keyPrefixName, keyBaseName, keySuffixName);
		}

		return this;
	}

	@Override
	public ModelBuilder putExtend(final String keyPrefixName, final Map<String, Object> kvMap, final String keySuffixName) {
		if (MapUtils.isEmpty(kvMap)) {
			return this;
		}

		for (final Entry<String, Object> entry : kvMap.entrySet()) {
			this.putExtend(entry.getValue(), keyPrefixName, keySuffixName, entry.getKey());
		}

		return this;
	}

	@Override
	public ModelBuilder putObjectField(final ModelArgs modelArgs) {
		if (modelArgs == null) {
			return this;
		}

		if (modelArgs.getC() == null) {
			if (modelArgs.getO() == null) {
				return this;
			}

			modelArgs.setC(modelArgs.getO().getClass());
		}

		ReflectionUtils.doWithFields(modelArgs.getC(), new FieldCallback() {
			@Override
			public void doWith(final Field field) throws IllegalArgumentException, IllegalAccessException {
				final String fieldName = field.getName();

				if (modelArgs.getO() == null) {
					DefaultModelBuilder.this.putTrueExtend(modelArgs.getKeyPrefixName(), fieldName);

					return;
				}

				final Object value = FieldUtils.readField(field, modelArgs.getO(), true);

				if (BooleanUtils.isTrue(modelArgs.getSkipNullValue())) {
					if (value == null) {
						return;
					}

					if ((value instanceof String) && StringUtils.isBlank(String.valueOf(value))) {
						return;
					}
				}

				DefaultModelBuilder.this.putExtend(value, modelArgs.getKeyPrefixName(), modelArgs.getKeySuffixName(), fieldName);
			}
		}, new FieldFilter() {
			@Override
			public boolean matches(final Field field) {
				if (ReflectionUtils.isPublicStaticFinal(field)) {
					return false;
				}

				final String fieldName = field.getName();

				if (ArrayUtils.contains(modelArgs.getIgnoreProperties(), fieldName)) {
					return false;
				}

				if (ArrayUtils.isNotEmpty(modelArgs.getUseProperties())) {
					return ArrayUtils.contains(modelArgs.getUseProperties(), fieldName);
				}

				if (CollectionUtils.isNotEmpty(modelArgs.getIgnoreAnnotationClassList())) {
					for (final Class<? extends Annotation> ignoreAnnotationClass : modelArgs.getIgnoreAnnotationClassList()) {
						if (field.isAnnotationPresent(ignoreAnnotationClass)) {
							return false;
						}
					}
				}

				if (CollectionUtils.isEmpty(modelArgs.getUseAnnotationClassList())) {
					return true;
				}

				for (final Class<? extends Annotation> useAnnotationClass : modelArgs.getUseAnnotationClassList()) {
					if (field.isAnnotationPresent(useAnnotationClass)) {
						return true;
					}
				}

				return false;
			}
		});

		return this;
	}

	@Override
	public ModelBuilder putTrue(final String... keys) {
		this.put(Boolean.TRUE.toString(), keys);

		return this;
	}

	@Override
	public ModelBuilder putTrueExtend(String keyPrefixName, final String... keyBaseNames) {
		if (ArrayUtils.isEmpty(keyBaseNames)) {
			return this;
		}

		keyPrefixName = StringUtils.defaultIfBlank(keyPrefixName, this.defaultKeyPrefixName);

		for (final String keyBaseName : keyBaseNames) {
			this.putTrue(keyPrefixName, keyBaseName);
		}

		return this;
	}

	@Override
	public ModelBuilder remove(final String... keys) {
		if (ArrayUtils.isEmpty(keys)) {
			return this;
		}

		final String key = StringUtils.join(keys, this.defaultSimpleparator);

		this.model.remove(key);

		return this;
	}

	@Override
	public ModelBuilder removeExtend(String keyPrefixName, String keySuffixName, final String... keyBaseNames) {
		if (ArrayUtils.isEmpty(keyBaseNames)) {
			return this;
		}

		keyPrefixName = StringUtils.defaultIfBlank(keyPrefixName, this.defaultKeyPrefixName);

		keySuffixName = StringUtils.defaultIfBlank(keySuffixName, this.defaultKeySuffixName);

		for (final String keyBaseName : keyBaseNames) {
			this.remove(keyPrefixName, keyBaseName);

			this.remove(keyPrefixName, keyBaseName, keySuffixName);
		}

		return this;
	}

	@Override
	public ModelBuilder setDefaultKeyPrefixName(final String defaultKeyPrefixName) {
		this.defaultKeyPrefixName = StringUtils.defaultIfBlank(defaultKeyPrefixName, this.defaultKeyPrefixName);

		return this;
	}

	@Override
	public ModelBuilder setDefaultKeySuffixName(final String defaultKeySuffixName) {
		this.defaultKeySuffixName = StringUtils.defaultIfBlank(defaultKeySuffixName, this.defaultKeySuffixName);

		return this;
	}

	@Override
	public ModelBuilder setDefaultSimpleparator(final String defaultSimpleparator) {
		this.defaultSimpleparator = StringUtils.defaultIfBlank(defaultSimpleparator, this.defaultSimpleparator);

		return this;
	}
}
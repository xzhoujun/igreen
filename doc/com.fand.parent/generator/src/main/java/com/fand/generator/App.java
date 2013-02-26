package com.fand.generator;

import java.util.Map;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.util.CollectionUtils;

/**
 * Hello world!
 */
public class App {
	public static void main(final String[] args) throws Exception {
		ApplicationContext applicationContext;

		if (ArrayUtils.isNotEmpty(args)) {
			applicationContext = new FileSystemXmlApplicationContext(args);
		} else {
			applicationContext = new ClassPathXmlApplicationContext("classpath*:**/applicationContext-*.xml");
		}

		final Map<String, PoMapperFactory> poMapperFactoryMap = applicationContext.getBeansOfType(PoMapperFactory.class);

		if (CollectionUtils.isEmpty(poMapperFactoryMap)) {
			return;
		}

		for (final PoMapperFactory poMapperFactory : poMapperFactoryMap.values()) {
			poMapperFactory.run();
		}
	}
}
package com.fand.generator.template;

import java.util.Map;

import com.fand.generator.mapper.PoMapper;

public interface Template {
	public void run(Map<String, PoMapper> poMapperMap) throws Exception;
}
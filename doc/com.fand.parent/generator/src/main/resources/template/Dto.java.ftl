<#include "macro_.ftl">
package ${packageCode}.${moduleMapperKey}.dto;

import ${packageCode}.${moduleMapperKey}.po.${poMapper.code};

/**
 * <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
 *
 * @author ${author!'yaoht'}
 * 
 */
public class ${poMapper.code}Dto extends ${poMapper.code} {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = ${serialVersionUID!'1'}L;
}
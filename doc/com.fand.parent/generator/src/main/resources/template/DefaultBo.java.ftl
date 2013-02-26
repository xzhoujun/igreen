<#include "macro_.ftl">
package ${packageCode}.${moduleMapperKey}.bo;

import com.fand.extend.bo.DefaultSimpleBo;
import ${packageCode}.${moduleMapperKey}.bo.${poMapper.code}Bo;
import ${packageCode}.${moduleMapperKey}.dao.${poMapper.code}Dao;

/**
 * <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
 *
 * @author ${author!'yaoht'}
 * 
 */
public class Default${poMapper.code}Bo extends DefaultSimpleBo<${poMapper.code}Dao> implements ${poMapper.code}Bo {
}
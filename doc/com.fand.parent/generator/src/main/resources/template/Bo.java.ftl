<#include "macro_.ftl">
package ${packageCode}.${moduleMapperKey}.bo;

import com.fand.ext.bo.SimpleBo;

/**
 * <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
 *
 * @author ${author!'yaoht'}
 * 
 */
public interface ${poMapper.code}Bo extends SimpleBo {
}
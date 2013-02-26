<#include "macro_.ftl">
package ${packageCode}.${moduleMapperKey}.dao;

import com.fand.extend.dao.SimpleDao;

/**
 * <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
 *
 * @author ${author!'yaoht'}
 * 
 */
public interface ${poMapper.code}Dao extends SimpleDao {
}
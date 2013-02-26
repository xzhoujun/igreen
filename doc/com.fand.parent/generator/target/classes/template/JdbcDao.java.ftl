<#include "macro_.ftl">
package ${packageCode}.${moduleMapperKey}.dao;

import com.fand.extend.dao.JdbcSimpleDao;
import ${packageCode}.${moduleMapperKey}.dao.${poMapper.code}Dao;

/**
 * <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
 *
 * @author ${author!'yaoht'}
 * 
 */
public class Jdbc${poMapper.code}Dao extends JdbcSimpleDao implements ${poMapper.code}Dao {
}
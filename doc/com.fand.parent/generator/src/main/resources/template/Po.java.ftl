<#include "macro_.ftl">
package ${packageCode}.${moduleMapperKey}.po;

<#list poMapper.fieldMapperMap?values as fieldMapper>
	<#if fieldMapper.typeCode == 'Date'>
import java.util.Date;

		<#break>
	</#if>
</#list>
<#list poMapper.fieldMapperMap?values as fieldMapper>
	<#if fieldMapper.pkName! != ''>
import javax.persistence.Id;

		<#break>
	</#if>
</#list>
/**
 * <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
 * 
 * @author ${author!'yaoht'}
 * 
 */
public class ${poMapper.code} implements java.io.Serializable {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = ${serialVersionUID!'1'}L;
<#list poMapper.fieldMapperMap?values as fieldMapper>

	/**
    * <@defaultIfBlank str="${fieldMapper.remarks!}" defaultSt="${fieldMapper.code!}"/>
	 */
	public static final String _${fieldMapper.code} = "${fieldMapper.code}";
</#list>
<#list poMapper.fieldMapperMap?values as fieldMapper>

	/**
    * <@defaultIfBlank str="${fieldMapper.remarks!}" defaultSt="${fieldMapper.code!}"/>
    */
<#if fieldMapper.pkName! != ''>
	@Id
</#if>
	${fieldMapper.typeCode!'String'} ${fieldMapper.code};
</#list>
<#list poMapper.fieldMapperMap?values as fieldMapper>

	/**
     * 获取
     *
	 * @return <@defaultIfBlank str="${fieldMapper.remarks!}" defaultSt="${fieldMapper.code!}"/>
	 */
	public ${fieldMapper.typeCode!'String'} get${fieldMapper.code?cap_first}() {
		return this.${fieldMapper.code};
	}
</#list> 
<#list poMapper.fieldMapperMap?values as fieldMapper>

	/**
	 * 设置
     *
	 * @param ${fieldMapper.code}
	 *            <@defaultIfBlank str="${fieldMapper.remarks!}" defaultSt="${fieldMapper.code!}"/>
	 */
	public ${poMapper.code} set${fieldMapper.code?cap_first}(${fieldMapper.typeCode!'String'} ${fieldMapper.code}) {
		this.${fieldMapper.code} = ${fieldMapper.code};
		
		return this;
	}
</#list> 
}
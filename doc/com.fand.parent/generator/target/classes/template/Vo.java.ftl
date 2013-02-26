<#include "macro_.ftl">
package ${packageCode}.${moduleMapperKey}.vo;

<#list entityList as entity>
import ${packageCode}.${moduleMapperKey}.dto.${entity}Dto;
</#list>
/**
 * ${businessMapper.name!businessCode}
 *
 * @author ${author!'yaoht'}
 */
public class ${businessCode!}Vo implements java.io.Serializable {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = ${serialVersionUID!'1'}L;
	
<#list poMapperList as poMapper>
	/**
	 * <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 */
	private ${poMapper.code}Dto ${poMapper.code?uncap_first}Dto;

</#list>
	/**
	 * 构造
	 */
	public ${businessCode!}Vo() {
<#list poMapperList as poMapper>
		this.${poMapper.code?uncap_first}Dto = new ${poMapper.code}Dto();
</#list>
	}
<#list poMapperList as poMapper>

	/**
     * 获取
     *
	 * @return <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 */
	public ${poMapper.code?cap_first}Dto get${poMapper.code?cap_first}Dto() {
		return this.${poMapper.code?uncap_first}Dto;
	}

</#list>
<#list poMapperList as poMapper>

	/**
	 * 设置
     *
	 * @param ${poMapper.code?uncap_first}Dto
	 *            <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/>
	 */
	public void set${poMapper.code?cap_first}Dto(${poMapper.code?cap_first}Dto ${poMapper.code?uncap_first}Dto) {
		this.${poMapper.code?uncap_first}Dto = ${poMapper.code?uncap_first}Dto;
	}
</#list>
}
SELECT
<${r"#"}assign prefixName=' '>
<#list poMapper.fieldMapperMap?values as fieldMapper>
<${r"#"}if (find__${fieldMapper.code}??)>
${r"$"}{prefixName} ${fieldMapper.columnName} ${fieldMapper.code}
	<${r"#"}assign prefixName=','>
</${r"#"}if>
</#list>
<${r"#"}if prefixName == ' '>
<#assign prefixName=' '>
<#list poMapper.fieldMapperMap?values as fieldMapper>
${prefixName} ${fieldMapper.columnName} ${fieldMapper.code}
	<#assign prefixName=','>
</#list>
</${r"#"}if>
FROM ${poMapper.tableName}
<${r"#"}include "where_.ftl">
<${r"#"}if (prefixName!) == 'WHERE' && (find__all??)>
WHERE 1 = 2
</${r"#"}if>
<${r"#"}assign prefixName='ORDER BY'>
<#list poMapper.fieldMapperMap?values as fieldMapper>
<${r"#"}if (order__by__${fieldMapper.code}??)>
${r"$"}{prefixName} ${fieldMapper.columnName} ${r"$"}{order__by__${fieldMapper.code}_value}
	<${r"#"}assign prefixName=','>
</${r"#"}if>
</#list>
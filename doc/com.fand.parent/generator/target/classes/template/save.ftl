UPDATE ${poMapper.tableName}
<${r"#"}assign prefixName='SET'>
<#list poMapper.fieldMapperMap?values as fieldMapper>
<${r"#"}if (save__${fieldMapper.code}??)>
	<${r"#"}if (save__${fieldMapper.code}__value??)>
${r"${prefixName}"} ${fieldMapper.columnName} = :save__${fieldMapper.code}__value
	<${r"#"}else>
${r"${prefixName}"} ${fieldMapper.columnName} = NULL
	</${r"#"}if>
	<${r"#"}assign prefixName=','>
</${r"#"}if>
</#list>
<${r"#"}include "where_.ftl">
<${r"#"}if (prefixName!) == 'WHERE' && (save__all??)>
WHERE 1 = 2
</${r"#"}if>
<${r"#"}assign prefixName='WHERE'>
<#list poMapper.fieldMapperMap?values as fieldMapper>
<${r"#"}if (where__and__eq__${fieldMapper.code}??)>
	<${r"#"}if (where__and__eq__${fieldMapper.code}__value??)>
${r"${prefixName}"} ${fieldMapper.columnName} = :where__and__eq__${fieldMapper.code}__value
	<${r"#"}else>
${r"${prefixName}"} ${fieldMapper.columnName} IS NULL
	</${r"#"}if>
	<${r"#"}assign prefixName='AND'>
</${r"#"}if>
</#list>
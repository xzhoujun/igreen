SELECT
<${r"#"}switch (read__field__id!)>
<#list poMapper.fieldMapperMap?values as fieldMapper>
	<${r"#"}case "${fieldMapper.code}">
${fieldMapper.columnName} ${fieldMapper.code}
	<${r"#"}break>
</#list>
	<${r"#"}default>
COUNT(*) count
</${r"#"}switch>
FROM ${poMapper.tableName}
<${r"#"}include "where_.ftl">
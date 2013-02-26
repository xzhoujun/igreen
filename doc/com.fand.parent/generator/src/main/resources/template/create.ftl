INSERT
INTO
  ${poMapper.tableName}
  (
<${r"#"}assign prefixName=' '>
<#list poMapper.fieldMapperMap?values as fieldMapper>
<${r"#"}if (create__${fieldMapper.code}??) && (create__${fieldMapper.code}__value??)>
  ${r"$"}{prefixName} ${fieldMapper.columnName}
	<${r"#"}assign prefixName=','>
</${r"#"}if>
</#list>
  )
  VALUES
  (
<${r"#"}assign prefixName=' '>
<#list poMapper.fieldMapperMap?values as fieldMapper>
<${r"#"}if (create__${fieldMapper.code}??) && (create__${fieldMapper.code}__value??)>
  ${r"$"}{prefixName} :create__${fieldMapper.code}__value
	<${r"#"}assign prefixName=','>
</${r"#"}if>
</#list>
  )
DELETE
FROM ${poMapper.tableName}
<${r"#"}include "where_.ftl">
<${r"#"}if (prefixName!) == 'WHERE' && (remove__all??)>
WHERE 1 = 2
</${r"#"}if>
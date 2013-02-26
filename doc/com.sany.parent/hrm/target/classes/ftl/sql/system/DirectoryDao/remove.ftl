DELETE
FROM FD_DIRECTORY
<#include "where_.ftl">
<#if (prefixName!) == 'WHERE' && (remove__all??)>
WHERE 1 = 2
</#if>
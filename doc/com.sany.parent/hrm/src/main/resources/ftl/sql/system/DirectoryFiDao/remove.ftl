DELETE
FROM FD_DIRECTORY_FI
<#include "where_.ftl">
<#if (prefixName!) == 'WHERE' && (remove__all??)>
WHERE 1 = 2
</#if>
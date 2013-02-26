DELETE
FROM FD_DIRECTORY_IN
<#include "where_.ftl">
<#if (prefixName!) == 'WHERE' && (remove__all??)>
WHERE 1 = 2
</#if>
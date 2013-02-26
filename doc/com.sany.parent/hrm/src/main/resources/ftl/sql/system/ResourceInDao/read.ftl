SELECT
<#switch (read__field__id!)>
	<#case "parentNa">
PARENT_NA_ parentNa
	<#break>
	<#case "levelNu">
LEVEL_NU_ levelNu
	<#break>
	<#case "endTi">
END_TI_ endTi
	<#break>
	<#case "orderNu">
ORDER_NU_ orderNu
	<#break>
	<#case "code">
CODE_ code
	<#break>
	<#case "codePa">
CODE_PA_ codePa
	<#break>
	<#case "id">
ID_ id
	<#break>
	<#case "parentId">
PARENT_ID_ parentId
	<#break>
	<#case "resourceId">
RESOURCE_ID_ resourceId
	<#break>
	<#case "idPa">
ID_PA_ idPa
	<#break>
	<#case "name">
NAME_ name
	<#break>
	<#case "namePa">
NAME_PA_ namePa
	<#break>
	<#case "childNu">
CHILD_NU_ childNu
	<#break>
	<#case "parentCo">
PARENT_CO_ parentCo
	<#break>
	<#case "beginTi">
BEGIN_TI_ beginTi
	<#break>
	<#case "versionNu">
VERSION_NU_ versionNu
	<#break>
	<#default>
COUNT(*) count
</#switch>
FROM FD_RESOURCE_IN
<#include "where_.ftl">
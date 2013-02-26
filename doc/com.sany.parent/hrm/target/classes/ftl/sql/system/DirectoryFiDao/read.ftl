SELECT
<#switch (read__field__id!)>
	<#case "doubleVa">
DOUBLE_VA_ doubleVa
	<#break>
	<#case "endTi">
END_TI_ endTi
	<#break>
	<#case "directoryId">
DIRECTORY_ID_ directoryId
	<#break>
	<#case "orderNu">
ORDER_NU_ orderNu
	<#break>
	<#case "code">
CODE_ code
	<#break>
	<#case "createTi">
CREATE_TI_ createTi
	<#break>
	<#case "stringVa">
STRING_VA_ stringVa
	<#break>
	<#case "id">
ID_ id
	<#break>
	<#case "dateVa">
DATE_VA_ dateVa
	<#break>
	<#case "modifyTi">
MODIFY_TI_ modifyTi
	<#break>
	<#case "createPeId">
CREATE_PE_ID_ createPeId
	<#break>
	<#case "name">
NAME_ name
	<#break>
	<#case "longVa">
LONG_VA_ longVa
	<#break>
	<#case "typeId">
TYPE_ID_ typeId
	<#break>
	<#case "modifyPeId">
MODIFY_PE_ID_ modifyPeId
	<#break>
	<#case "beginTi">
BEGIN_TI_ beginTi
	<#break>
	<#case "textVa">
TEXT_VA_ textVa
	<#break>
	<#case "versionNu">
VERSION_NU_ versionNu
	<#break>
	<#default>
COUNT(*) count
</#switch>
FROM FD_DIRECTORY_FI
<#include "where_.ftl">
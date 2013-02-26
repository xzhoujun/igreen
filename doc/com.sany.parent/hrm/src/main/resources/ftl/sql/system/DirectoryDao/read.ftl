SELECT
<#switch (read__field__id!)>
	<#case "id">
ID_ id
	<#break>
	<#case "endTi">
END_TI_ endTi
	<#break>
	<#case "modifyTi">
MODIFY_TI_ modifyTi
	<#break>
	<#case "directoryId">
DIRECTORY_ID_ directoryId
	<#break>
	<#case "name">
NAME_ name
	<#break>
	<#case "createPeId">
CREATE_PE_ID_ createPeId
	<#break>
	<#case "orderNu">
ORDER_NU_ orderNu
	<#break>
	<#case "partitionId">
PARTITION_ID_ partitionId
	<#break>
	<#case "code">
CODE_ code
	<#break>
	<#case "createTi">
CREATE_TI_ createTi
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
	<#case "versionNu">
VERSION_NU_ versionNu
	<#break>
	<#default>
COUNT(*) count
</#switch>
FROM FD_DIRECTORY
<#include "where_.ftl">
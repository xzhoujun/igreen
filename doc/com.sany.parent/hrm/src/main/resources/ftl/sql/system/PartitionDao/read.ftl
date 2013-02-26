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
	<#case "name">
NAME_ name
	<#break>
	<#case "createPeId">
CREATE_PE_ID_ createPeId
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
FROM FD_PARTITION
<#include "where_.ftl">
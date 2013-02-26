SELECT
<#assign prefixName=' '>
<#if (find__parentNa??)>
${prefixName} PARENT_NA_ parentNa
	<#assign prefixName=','>
</#if>
<#if (find__levelNu??)>
${prefixName} LEVEL_NU_ levelNu
	<#assign prefixName=','>
</#if>
<#if (find__endTi??)>
${prefixName} END_TI_ endTi
	<#assign prefixName=','>
</#if>
<#if (find__directoryId??)>
${prefixName} DIRECTORY_ID_ directoryId
	<#assign prefixName=','>
</#if>
<#if (find__orderNu??)>
${prefixName} ORDER_NU_ orderNu
	<#assign prefixName=','>
</#if>
<#if (find__code??)>
${prefixName} CODE_ code
	<#assign prefixName=','>
</#if>
<#if (find__codePa??)>
${prefixName} CODE_PA_ codePa
	<#assign prefixName=','>
</#if>
<#if (find__id??)>
${prefixName} ID_ id
	<#assign prefixName=','>
</#if>
<#if (find__parentId??)>
${prefixName} PARENT_ID_ parentId
	<#assign prefixName=','>
</#if>
<#if (find__idPa??)>
${prefixName} ID_PA_ idPa
	<#assign prefixName=','>
</#if>
<#if (find__name??)>
${prefixName} NAME_ name
	<#assign prefixName=','>
</#if>
<#if (find__namePa??)>
${prefixName} NAME_PA_ namePa
	<#assign prefixName=','>
</#if>
<#if (find__childNu??)>
${prefixName} CHILD_NU_ childNu
	<#assign prefixName=','>
</#if>
<#if (find__parentCo??)>
${prefixName} PARENT_CO_ parentCo
	<#assign prefixName=','>
</#if>
<#if (find__beginTi??)>
${prefixName} BEGIN_TI_ beginTi
	<#assign prefixName=','>
</#if>
<#if (find__versionNu??)>
${prefixName} VERSION_NU_ versionNu
	<#assign prefixName=','>
</#if>
<#if prefixName == ' '>
  PARENT_NA_ parentNa
, LEVEL_NU_ levelNu
, END_TI_ endTi
, DIRECTORY_ID_ directoryId
, ORDER_NU_ orderNu
, CODE_ code
, CODE_PA_ codePa
, ID_ id
, PARENT_ID_ parentId
, ID_PA_ idPa
, NAME_ name
, NAME_PA_ namePa
, CHILD_NU_ childNu
, PARENT_CO_ parentCo
, BEGIN_TI_ beginTi
, VERSION_NU_ versionNu
</#if>
FROM FD_DIRECTORY_IN
<#include "where_.ftl">
<#if (prefixName!) == 'WHERE' && (find__all??)>
WHERE 1 = 2
</#if>
<#assign prefixName='ORDER BY'>
<#if (order__by__parentNa??)>
${prefixName} PARENT_NA_ ${order__by__parentNa_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__levelNu??)>
${prefixName} LEVEL_NU_ ${order__by__levelNu_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__endTi??)>
${prefixName} END_TI_ ${order__by__endTi_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__directoryId??)>
${prefixName} DIRECTORY_ID_ ${order__by__directoryId_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__orderNu??)>
${prefixName} ORDER_NU_ ${order__by__orderNu_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__code??)>
${prefixName} CODE_ ${order__by__code_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__codePa??)>
${prefixName} CODE_PA_ ${order__by__codePa_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__id??)>
${prefixName} ID_ ${order__by__id_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__parentId??)>
${prefixName} PARENT_ID_ ${order__by__parentId_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__idPa??)>
${prefixName} ID_PA_ ${order__by__idPa_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__name??)>
${prefixName} NAME_ ${order__by__name_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__namePa??)>
${prefixName} NAME_PA_ ${order__by__namePa_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__childNu??)>
${prefixName} CHILD_NU_ ${order__by__childNu_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__parentCo??)>
${prefixName} PARENT_CO_ ${order__by__parentCo_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__beginTi??)>
${prefixName} BEGIN_TI_ ${order__by__beginTi_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__versionNu??)>
${prefixName} VERSION_NU_ ${order__by__versionNu_value}
	<#assign prefixName=','>
</#if>

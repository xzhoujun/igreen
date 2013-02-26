SELECT
<#assign prefixName=' '>
<#if (get__parentNa??)>
${prefixName} PARENT_NA_ parentNa
	<#assign prefixName=','>
</#if>
<#if (get__levelNu??)>
${prefixName} LEVEL_NU_ levelNu
	<#assign prefixName=','>
</#if>
<#if (get__endTi??)>
${prefixName} END_TI_ endTi
	<#assign prefixName=','>
</#if>
<#if (get__directoryId??)>
${prefixName} DIRECTORY_ID_ directoryId
	<#assign prefixName=','>
</#if>
<#if (get__orderNu??)>
${prefixName} ORDER_NU_ orderNu
	<#assign prefixName=','>
</#if>
<#if (get__code??)>
${prefixName} CODE_ code
	<#assign prefixName=','>
</#if>
<#if (get__codePa??)>
${prefixName} CODE_PA_ codePa
	<#assign prefixName=','>
</#if>
<#if (get__id??)>
${prefixName} ID_ id
	<#assign prefixName=','>
</#if>
<#if (get__parentId??)>
${prefixName} PARENT_ID_ parentId
	<#assign prefixName=','>
</#if>
<#if (get__idPa??)>
${prefixName} ID_PA_ idPa
	<#assign prefixName=','>
</#if>
<#if (get__name??)>
${prefixName} NAME_ name
	<#assign prefixName=','>
</#if>
<#if (get__namePa??)>
${prefixName} NAME_PA_ namePa
	<#assign prefixName=','>
</#if>
<#if (get__childNu??)>
${prefixName} CHILD_NU_ childNu
	<#assign prefixName=','>
</#if>
<#if (get__parentCo??)>
${prefixName} PARENT_CO_ parentCo
	<#assign prefixName=','>
</#if>
<#if (get__beginTi??)>
${prefixName} BEGIN_TI_ beginTi
	<#assign prefixName=','>
</#if>
<#if (get__versionNu??)>
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
<#if (prefixName!) == 'WHERE' && (get__all??)>
WHERE 1 = 2
</#if>
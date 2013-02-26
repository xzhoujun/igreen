SELECT
<#assign prefixName=' '>
<#if (find__id??)>
${prefixName} ID_ id
	<#assign prefixName=','>
</#if>
<#if (find__endTi??)>
${prefixName} END_TI_ endTi
	<#assign prefixName=','>
</#if>
<#if (find__modifyTi??)>
${prefixName} MODIFY_TI_ modifyTi
	<#assign prefixName=','>
</#if>
<#if (find__name??)>
${prefixName} NAME_ name
	<#assign prefixName=','>
</#if>
<#if (find__createPeId??)>
${prefixName} CREATE_PE_ID_ createPeId
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
<#if (find__createTi??)>
${prefixName} CREATE_TI_ createTi
	<#assign prefixName=','>
</#if>
<#if (find__modifyPeId??)>
${prefixName} MODIFY_PE_ID_ modifyPeId
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
  ID_ id
, END_TI_ endTi
, MODIFY_TI_ modifyTi
, NAME_ name
, CREATE_PE_ID_ createPeId
, ORDER_NU_ orderNu
, CODE_ code
, CREATE_TI_ createTi
, MODIFY_PE_ID_ modifyPeId
, BEGIN_TI_ beginTi
, VERSION_NU_ versionNu
</#if>
FROM FD_PARTITION
<#include "where_.ftl">
<#if (prefixName!) == 'WHERE' && (find__all??)>
WHERE 1 = 2
</#if>
<#assign prefixName='ORDER BY'>
<#if (order__by__id??)>
${prefixName} ID_ ${order__by__id_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__endTi??)>
${prefixName} END_TI_ ${order__by__endTi_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__modifyTi??)>
${prefixName} MODIFY_TI_ ${order__by__modifyTi_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__name??)>
${prefixName} NAME_ ${order__by__name_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__createPeId??)>
${prefixName} CREATE_PE_ID_ ${order__by__createPeId_value}
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
<#if (order__by__createTi??)>
${prefixName} CREATE_TI_ ${order__by__createTi_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__modifyPeId??)>
${prefixName} MODIFY_PE_ID_ ${order__by__modifyPeId_value}
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

SELECT
<#assign prefixName=' '>
<#if (get__id??)>
${prefixName} ID_ id
	<#assign prefixName=','>
</#if>
<#if (get__endTi??)>
${prefixName} END_TI_ endTi
	<#assign prefixName=','>
</#if>
<#if (get__modifyTi??)>
${prefixName} MODIFY_TI_ modifyTi
	<#assign prefixName=','>
</#if>
<#if (get__name??)>
${prefixName} NAME_ name
	<#assign prefixName=','>
</#if>
<#if (get__createPeId??)>
${prefixName} CREATE_PE_ID_ createPeId
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
<#if (get__createTi??)>
${prefixName} CREATE_TI_ createTi
	<#assign prefixName=','>
</#if>
<#if (get__modifyPeId??)>
${prefixName} MODIFY_PE_ID_ modifyPeId
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
<#if (prefixName!) == 'WHERE' && (get__all??)>
WHERE 1 = 2
</#if>
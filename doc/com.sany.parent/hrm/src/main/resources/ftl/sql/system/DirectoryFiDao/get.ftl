SELECT
<#assign prefixName=' '>
<#if (get__doubleVa??)>
${prefixName} DOUBLE_VA_ doubleVa
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
<#if (get__createTi??)>
${prefixName} CREATE_TI_ createTi
	<#assign prefixName=','>
</#if>
<#if (get__stringVa??)>
${prefixName} STRING_VA_ stringVa
	<#assign prefixName=','>
</#if>
<#if (get__id??)>
${prefixName} ID_ id
	<#assign prefixName=','>
</#if>
<#if (get__dateVa??)>
${prefixName} DATE_VA_ dateVa
	<#assign prefixName=','>
</#if>
<#if (get__modifyTi??)>
${prefixName} MODIFY_TI_ modifyTi
	<#assign prefixName=','>
</#if>
<#if (get__createPeId??)>
${prefixName} CREATE_PE_ID_ createPeId
	<#assign prefixName=','>
</#if>
<#if (get__name??)>
${prefixName} NAME_ name
	<#assign prefixName=','>
</#if>
<#if (get__longVa??)>
${prefixName} LONG_VA_ longVa
	<#assign prefixName=','>
</#if>
<#if (get__typeId??)>
${prefixName} TYPE_ID_ typeId
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
<#if (get__textVa??)>
${prefixName} TEXT_VA_ textVa
	<#assign prefixName=','>
</#if>
<#if (get__versionNu??)>
${prefixName} VERSION_NU_ versionNu
	<#assign prefixName=','>
</#if>
<#if prefixName == ' '>
  DOUBLE_VA_ doubleVa
, END_TI_ endTi
, DIRECTORY_ID_ directoryId
, ORDER_NU_ orderNu
, CODE_ code
, CREATE_TI_ createTi
, STRING_VA_ stringVa
, ID_ id
, DATE_VA_ dateVa
, MODIFY_TI_ modifyTi
, CREATE_PE_ID_ createPeId
, NAME_ name
, LONG_VA_ longVa
, TYPE_ID_ typeId
, MODIFY_PE_ID_ modifyPeId
, BEGIN_TI_ beginTi
, TEXT_VA_ textVa
, VERSION_NU_ versionNu
</#if>
FROM FD_DIRECTORY_FI
<#include "where_.ftl">
<#if (prefixName!) == 'WHERE' && (get__all??)>
WHERE 1 = 2
</#if>
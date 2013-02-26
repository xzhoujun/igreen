SELECT
<#assign prefixName=' '>
<#if (find__doubleVa??)>
${prefixName} DOUBLE_VA_ doubleVa
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
<#if (find__createTi??)>
${prefixName} CREATE_TI_ createTi
	<#assign prefixName=','>
</#if>
<#if (find__stringVa??)>
${prefixName} STRING_VA_ stringVa
	<#assign prefixName=','>
</#if>
<#if (find__id??)>
${prefixName} ID_ id
	<#assign prefixName=','>
</#if>
<#if (find__dateVa??)>
${prefixName} DATE_VA_ dateVa
	<#assign prefixName=','>
</#if>
<#if (find__modifyTi??)>
${prefixName} MODIFY_TI_ modifyTi
	<#assign prefixName=','>
</#if>
<#if (find__createPeId??)>
${prefixName} CREATE_PE_ID_ createPeId
	<#assign prefixName=','>
</#if>
<#if (find__name??)>
${prefixName} NAME_ name
	<#assign prefixName=','>
</#if>
<#if (find__longVa??)>
${prefixName} LONG_VA_ longVa
	<#assign prefixName=','>
</#if>
<#if (find__typeId??)>
${prefixName} TYPE_ID_ typeId
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
<#if (find__textVa??)>
${prefixName} TEXT_VA_ textVa
	<#assign prefixName=','>
</#if>
<#if (find__versionNu??)>
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
<#if (prefixName!) == 'WHERE' && (find__all??)>
WHERE 1 = 2
</#if>
<#assign prefixName='ORDER BY'>
<#if (order__by__doubleVa??)>
${prefixName} DOUBLE_VA_ ${order__by__doubleVa_value}
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
<#if (order__by__createTi??)>
${prefixName} CREATE_TI_ ${order__by__createTi_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__stringVa??)>
${prefixName} STRING_VA_ ${order__by__stringVa_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__id??)>
${prefixName} ID_ ${order__by__id_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__dateVa??)>
${prefixName} DATE_VA_ ${order__by__dateVa_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__modifyTi??)>
${prefixName} MODIFY_TI_ ${order__by__modifyTi_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__createPeId??)>
${prefixName} CREATE_PE_ID_ ${order__by__createPeId_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__name??)>
${prefixName} NAME_ ${order__by__name_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__longVa??)>
${prefixName} LONG_VA_ ${order__by__longVa_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__typeId??)>
${prefixName} TYPE_ID_ ${order__by__typeId_value}
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
<#if (order__by__textVa??)>
${prefixName} TEXT_VA_ ${order__by__textVa_value}
	<#assign prefixName=','>
</#if>
<#if (order__by__versionNu??)>
${prefixName} VERSION_NU_ ${order__by__versionNu_value}
	<#assign prefixName=','>
</#if>

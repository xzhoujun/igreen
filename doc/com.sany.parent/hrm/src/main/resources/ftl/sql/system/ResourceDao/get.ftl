SELECT
<#assign prefixName=' '>
<#if (get__id??)>
${prefixName} ID_ id
	<#assign prefixName=','>
</#if>
<#if (get__resourceId??)>
${prefixName} RESOURCE_ID_ resourceId
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
<#if (get__directoryId??)>
${prefixName} DIRECTORY_ID_ directoryId
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
<#if (get__partitionId??)>
${prefixName} PARTITION_ID_ partitionId
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
<#if (get__versionNu??)>
${prefixName} VERSION_NU_ versionNu
	<#assign prefixName=','>
</#if>
<#if prefixName == ' '>
  ID_ id
, RESOURCE_ID_ resourceId
, END_TI_ endTi
, MODIFY_TI_ modifyTi
, DIRECTORY_ID_ directoryId
, NAME_ name
, CREATE_PE_ID_ createPeId
, ORDER_NU_ orderNu
, PARTITION_ID_ partitionId
, CODE_ code
, CREATE_TI_ createTi
, TYPE_ID_ typeId
, MODIFY_PE_ID_ modifyPeId
, BEGIN_TI_ beginTi
, VERSION_NU_ versionNu
</#if>
FROM FD_RESOURCE
<#include "where_.ftl">
<#if (prefixName!) == 'WHERE' && (get__all??)>
WHERE 1 = 2
</#if>
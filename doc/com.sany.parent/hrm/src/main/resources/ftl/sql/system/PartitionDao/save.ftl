UPDATE FD_PARTITION
<#assign prefixName='SET'>
<#if (save__id??)>
	<#if (save__id__value??)>
${prefixName} ID_ = :save__id__value
	<#else>
${prefixName} ID_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__endTi??)>
	<#if (save__endTi__value??)>
${prefixName} END_TI_ = :save__endTi__value
	<#else>
${prefixName} END_TI_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__modifyTi??)>
	<#if (save__modifyTi__value??)>
${prefixName} MODIFY_TI_ = :save__modifyTi__value
	<#else>
${prefixName} MODIFY_TI_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__name??)>
	<#if (save__name__value??)>
${prefixName} NAME_ = :save__name__value
	<#else>
${prefixName} NAME_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__createPeId??)>
	<#if (save__createPeId__value??)>
${prefixName} CREATE_PE_ID_ = :save__createPeId__value
	<#else>
${prefixName} CREATE_PE_ID_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__orderNu??)>
	<#if (save__orderNu__value??)>
${prefixName} ORDER_NU_ = :save__orderNu__value
	<#else>
${prefixName} ORDER_NU_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__code??)>
	<#if (save__code__value??)>
${prefixName} CODE_ = :save__code__value
	<#else>
${prefixName} CODE_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__createTi??)>
	<#if (save__createTi__value??)>
${prefixName} CREATE_TI_ = :save__createTi__value
	<#else>
${prefixName} CREATE_TI_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__modifyPeId??)>
	<#if (save__modifyPeId__value??)>
${prefixName} MODIFY_PE_ID_ = :save__modifyPeId__value
	<#else>
${prefixName} MODIFY_PE_ID_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__beginTi??)>
	<#if (save__beginTi__value??)>
${prefixName} BEGIN_TI_ = :save__beginTi__value
	<#else>
${prefixName} BEGIN_TI_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__versionNu??)>
	<#if (save__versionNu__value??)>
${prefixName} VERSION_NU_ = :save__versionNu__value
	<#else>
${prefixName} VERSION_NU_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#include "where_.ftl">
<#if (prefixName!) == 'WHERE' && (save__all??)>
WHERE 1 = 2
</#if>
UPDATE FD_DIRECTORY_IN
<#assign prefixName='SET'>
<#if (save__parentNa??)>
	<#if (save__parentNa__value??)>
${prefixName} PARENT_NA_ = :save__parentNa__value
	<#else>
${prefixName} PARENT_NA_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__levelNu??)>
	<#if (save__levelNu__value??)>
${prefixName} LEVEL_NU_ = :save__levelNu__value
	<#else>
${prefixName} LEVEL_NU_ = NULL
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
<#if (save__directoryId??)>
	<#if (save__directoryId__value??)>
${prefixName} DIRECTORY_ID_ = :save__directoryId__value
	<#else>
${prefixName} DIRECTORY_ID_ = NULL
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
<#if (save__codePa??)>
	<#if (save__codePa__value??)>
${prefixName} CODE_PA_ = :save__codePa__value
	<#else>
${prefixName} CODE_PA_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__id??)>
	<#if (save__id__value??)>
${prefixName} ID_ = :save__id__value
	<#else>
${prefixName} ID_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__parentId??)>
	<#if (save__parentId__value??)>
${prefixName} PARENT_ID_ = :save__parentId__value
	<#else>
${prefixName} PARENT_ID_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__idPa??)>
	<#if (save__idPa__value??)>
${prefixName} ID_PA_ = :save__idPa__value
	<#else>
${prefixName} ID_PA_ = NULL
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
<#if (save__namePa??)>
	<#if (save__namePa__value??)>
${prefixName} NAME_PA_ = :save__namePa__value
	<#else>
${prefixName} NAME_PA_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__childNu??)>
	<#if (save__childNu__value??)>
${prefixName} CHILD_NU_ = :save__childNu__value
	<#else>
${prefixName} CHILD_NU_ = NULL
	</#if>
	<#assign prefixName=','>
</#if>
<#if (save__parentCo??)>
	<#if (save__parentCo__value??)>
${prefixName} PARENT_CO_ = :save__parentCo__value
	<#else>
${prefixName} PARENT_CO_ = NULL
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
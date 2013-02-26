<#assign prefixName='WHERE'>
<#if (where__and__eq__parentNa??)>
	<#if (where__and__eq__parentNa__value??)>
${prefixName} PARENT_NA_ = :where__and__eq__parentNa__value
	<#else>
${prefixName} PARENT_NA_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__levelNu??)>
	<#if (where__and__eq__levelNu__value??)>
${prefixName} LEVEL_NU_ = :where__and__eq__levelNu__value
	<#else>
${prefixName} LEVEL_NU_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__endTi??)>
	<#if (where__and__eq__endTi__value??)>
${prefixName} END_TI_ = :where__and__eq__endTi__value
	<#else>
${prefixName} END_TI_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__orderNu??)>
	<#if (where__and__eq__orderNu__value??)>
${prefixName} ORDER_NU_ = :where__and__eq__orderNu__value
	<#else>
${prefixName} ORDER_NU_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__code??)>
	<#if (where__and__eq__code__value??)>
${prefixName} CODE_ = :where__and__eq__code__value
	<#else>
${prefixName} CODE_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__codePa??)>
	<#if (where__and__eq__codePa__value??)>
${prefixName} CODE_PA_ = :where__and__eq__codePa__value
	<#else>
${prefixName} CODE_PA_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__id??)>
	<#if (where__and__eq__id__value??)>
${prefixName} ID_ = :where__and__eq__id__value
	<#else>
${prefixName} ID_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__parentId??)>
	<#if (where__and__eq__parentId__value??)>
${prefixName} PARENT_ID_ = :where__and__eq__parentId__value
	<#else>
${prefixName} PARENT_ID_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__resourceId??)>
	<#if (where__and__eq__resourceId__value??)>
${prefixName} RESOURCE_ID_ = :where__and__eq__resourceId__value
	<#else>
${prefixName} RESOURCE_ID_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__idPa??)>
	<#if (where__and__eq__idPa__value??)>
${prefixName} ID_PA_ = :where__and__eq__idPa__value
	<#else>
${prefixName} ID_PA_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__name??)>
	<#if (where__and__eq__name__value??)>
${prefixName} NAME_ = :where__and__eq__name__value
	<#else>
${prefixName} NAME_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__namePa??)>
	<#if (where__and__eq__namePa__value??)>
${prefixName} NAME_PA_ = :where__and__eq__namePa__value
	<#else>
${prefixName} NAME_PA_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__childNu??)>
	<#if (where__and__eq__childNu__value??)>
${prefixName} CHILD_NU_ = :where__and__eq__childNu__value
	<#else>
${prefixName} CHILD_NU_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__parentCo??)>
	<#if (where__and__eq__parentCo__value??)>
${prefixName} PARENT_CO_ = :where__and__eq__parentCo__value
	<#else>
${prefixName} PARENT_CO_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__beginTi??)>
	<#if (where__and__eq__beginTi__value??)>
${prefixName} BEGIN_TI_ = :where__and__eq__beginTi__value
	<#else>
${prefixName} BEGIN_TI_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>
<#if (where__and__eq__versionNu??)>
	<#if (where__and__eq__versionNu__value??)>
${prefixName} VERSION_NU_ = :where__and__eq__versionNu__value
	<#else>
${prefixName} VERSION_NU_ IS NULL
	</#if>
	<#assign prefixName='AND'>
</#if>

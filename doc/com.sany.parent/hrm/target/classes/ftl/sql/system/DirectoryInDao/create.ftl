INSERT
INTO
  FD_DIRECTORY_IN
  (
<#assign prefixName=' '>
<#if (create__parentNa??) && (create__parentNa__value??)>
  ${prefixName} PARENT_NA_
	<#assign prefixName=','>
</#if>
<#if (create__levelNu??) && (create__levelNu__value??)>
  ${prefixName} LEVEL_NU_
	<#assign prefixName=','>
</#if>
<#if (create__endTi??) && (create__endTi__value??)>
  ${prefixName} END_TI_
	<#assign prefixName=','>
</#if>
<#if (create__directoryId??) && (create__directoryId__value??)>
  ${prefixName} DIRECTORY_ID_
	<#assign prefixName=','>
</#if>
<#if (create__orderNu??) && (create__orderNu__value??)>
  ${prefixName} ORDER_NU_
	<#assign prefixName=','>
</#if>
<#if (create__code??) && (create__code__value??)>
  ${prefixName} CODE_
	<#assign prefixName=','>
</#if>
<#if (create__codePa??) && (create__codePa__value??)>
  ${prefixName} CODE_PA_
	<#assign prefixName=','>
</#if>
<#if (create__id??) && (create__id__value??)>
  ${prefixName} ID_
	<#assign prefixName=','>
</#if>
<#if (create__parentId??) && (create__parentId__value??)>
  ${prefixName} PARENT_ID_
	<#assign prefixName=','>
</#if>
<#if (create__idPa??) && (create__idPa__value??)>
  ${prefixName} ID_PA_
	<#assign prefixName=','>
</#if>
<#if (create__name??) && (create__name__value??)>
  ${prefixName} NAME_
	<#assign prefixName=','>
</#if>
<#if (create__namePa??) && (create__namePa__value??)>
  ${prefixName} NAME_PA_
	<#assign prefixName=','>
</#if>
<#if (create__childNu??) && (create__childNu__value??)>
  ${prefixName} CHILD_NU_
	<#assign prefixName=','>
</#if>
<#if (create__parentCo??) && (create__parentCo__value??)>
  ${prefixName} PARENT_CO_
	<#assign prefixName=','>
</#if>
<#if (create__beginTi??) && (create__beginTi__value??)>
  ${prefixName} BEGIN_TI_
	<#assign prefixName=','>
</#if>
<#if (create__versionNu??) && (create__versionNu__value??)>
  ${prefixName} VERSION_NU_
	<#assign prefixName=','>
</#if>
  )
  VALUES
  (
<#assign prefixName=' '>
<#if (create__parentNa??) && (create__parentNa__value??)>
  ${prefixName} :create__parentNa__value
	<#assign prefixName=','>
</#if>
<#if (create__levelNu??) && (create__levelNu__value??)>
  ${prefixName} :create__levelNu__value
	<#assign prefixName=','>
</#if>
<#if (create__endTi??) && (create__endTi__value??)>
  ${prefixName} :create__endTi__value
	<#assign prefixName=','>
</#if>
<#if (create__directoryId??) && (create__directoryId__value??)>
  ${prefixName} :create__directoryId__value
	<#assign prefixName=','>
</#if>
<#if (create__orderNu??) && (create__orderNu__value??)>
  ${prefixName} :create__orderNu__value
	<#assign prefixName=','>
</#if>
<#if (create__code??) && (create__code__value??)>
  ${prefixName} :create__code__value
	<#assign prefixName=','>
</#if>
<#if (create__codePa??) && (create__codePa__value??)>
  ${prefixName} :create__codePa__value
	<#assign prefixName=','>
</#if>
<#if (create__id??) && (create__id__value??)>
  ${prefixName} :create__id__value
	<#assign prefixName=','>
</#if>
<#if (create__parentId??) && (create__parentId__value??)>
  ${prefixName} :create__parentId__value
	<#assign prefixName=','>
</#if>
<#if (create__idPa??) && (create__idPa__value??)>
  ${prefixName} :create__idPa__value
	<#assign prefixName=','>
</#if>
<#if (create__name??) && (create__name__value??)>
  ${prefixName} :create__name__value
	<#assign prefixName=','>
</#if>
<#if (create__namePa??) && (create__namePa__value??)>
  ${prefixName} :create__namePa__value
	<#assign prefixName=','>
</#if>
<#if (create__childNu??) && (create__childNu__value??)>
  ${prefixName} :create__childNu__value
	<#assign prefixName=','>
</#if>
<#if (create__parentCo??) && (create__parentCo__value??)>
  ${prefixName} :create__parentCo__value
	<#assign prefixName=','>
</#if>
<#if (create__beginTi??) && (create__beginTi__value??)>
  ${prefixName} :create__beginTi__value
	<#assign prefixName=','>
</#if>
<#if (create__versionNu??) && (create__versionNu__value??)>
  ${prefixName} :create__versionNu__value
	<#assign prefixName=','>
</#if>
  )
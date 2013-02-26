<#include "macro_.ftl">
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:aop="http://www.springframework.org/schema/aop" xmlns:tx="http://www.springframework.org/schema/tx"
	xmlns:tool="http://www.springframework.org/schema/tool"
	xsi:schemaLocation="
	http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
	http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-3.0.xsd
	http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-3.0.xsd
	http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx-3.0.xsd
	http://www.springframework.org/schema/tool http://www.springframework.org/schema/tool/spring-tool-3.0.xsd"
	default-lazy-init="false">
<#list poMapperList as poMapper>
	<!-- <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/> -->
	<bean id="${packageCode}.${moduleMapperKey}.dao.${poMapper.code}Dao.templateSupport"
		parent="templateSupportTemplate">
		<property name="filenameFormate" value="/sql/${moduleMapperKey}/${poMapper.code}Dao/${r"${fileBaseName}"}.ftl" />
	</bean>

	<!-- <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/> -->
	<bean id="${packageCode}.${moduleMapperKey}.dao.${poMapper.code}Dao" class="${packageCode}.${moduleMapperKey}.dao.Jdbc${poMapper.code}Dao"
		parent="daoTemplate">
		<property name="templateSupport" ref="${packageCode}.${moduleMapperKey}.dao.${poMapper.code}Dao.templateSupport" />
	</bean>

</#list>
	<!-- ${businessMapper.name!businessCode} -->
	<bean id="${packageCode}.${moduleMapperKey}.dao.${businessCode}Dao.templateSupport"
		parent="templateSupportTemplate">
		<property name="filenameFormate" value="/sql/${moduleMapperKey}/${businessCode}Dao/${r"${fileBaseName}"}.ftl" />
	</bean>

	<!-- ${businessMapper.name!businessCode} -->
	<bean id="${packageCode}.${moduleMapperKey}.dao.${businessCode}Dao" class="${packageCode}.${moduleMapperKey}.dao.Jdbc${businessCode}Dao"
		parent="daoTemplate">
		<property name="templateSupport" ref="${packageCode}.${moduleMapperKey}.dao.${businessCode}Dao.templateSupport" />
	</bean>

	<!-- ${businessMapper.name!businessCode} -->
	<bean id="${packageCode}.${moduleMapperKey}.service.${businessCode}Service"
		class="${packageCode}.${moduleMapperKey}.service.Default${businessCode}Service">
<#list poMapperList as poMapper>
		<!-- <@defaultIfBlank str="${poMapper.remarks!}" defaultSt="${poMapper.code!}"/> -->
		<property name="${poMapper.code?uncap_first}Dao" ref="${packageCode}.${moduleMapperKey}.dao.${poMapper.code}Dao" />
			
</#list>
		<!-- ${businessMapper.name!businessCode} -->
		<property name="dao" ref="${packageCode}.${moduleMapperKey}.dao.${businessCode}Dao" />
	</bean>
</beans>
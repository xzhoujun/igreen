<#assign StringUtils = statics["org.apache.commons.lang.StringUtils"]>

<#macro defaultIfBlank str="" defaultSt="">${StringUtils.contains(str, '?')? string(defaultSt, str!defaultSt)}</#macro>
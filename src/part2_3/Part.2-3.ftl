<#noparse>
  ${sampleBean}
  <#if 1=1>output</#if>
</#noparse> 


<#assign x = "    moo  \n\n   ">
(<#compress>
  1 2  3   4    5
  ${x}
  test only

  I said, test only

</#compress>)


<#assign x = "<test>">
<#macro m1>
  m1: ${x}
</#macro>
<#escape x as x?html>
  <#macro m2>m2: ${x}</#macro>
  ${x}
  <@m1/>
</#escape>
${x}
<@m2/>  
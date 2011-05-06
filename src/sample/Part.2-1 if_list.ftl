<#if x == 1>
  x is 1
<#elseif x == 2>
  x is 2
<#else>
  x is not 1 nor 2
</#if>

<#if (x > 1)>
  x is 1
<#else>
  x is not 1
</#if>  

<#if check>
  check is true.
</#if>

<#if SampleBean.checkResult(x,2)>
  result is true.
<#else>
  result is false.
</#if>

switchサンプル
<#switch x>
  <#case 1>
    x=1
    <#break>
  <#case 2>
    x=2
    <#break>
  <#default>
    x is not 1 or 2
</#switch>

listサンプル
<#list sblist as sbean>
  <#if 0 = sbean_index>SampleBeanリスト出力開始</#if>
    key${sbean_index}=${sbean.key}
    val${sbean_index}=${sbean.value}
  <#if (1 < sblist?size)>break!<#break></#if>
  <#if !sbean_has_next>出力終了。合計${sblist?size}件}</#if>
</#list>
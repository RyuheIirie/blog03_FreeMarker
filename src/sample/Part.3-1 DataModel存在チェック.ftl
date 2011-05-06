<h1>Welcome ${usr!"Anonymous"}!</h1> 

<#assign "ret" = usr??>
<#if ret><h1>Welcome ${usr}!</h1></#if>

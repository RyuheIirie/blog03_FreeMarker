<#-- 
<#if usr??>The average of 3 and 5 is: ${usr.avg(3, 6)}</#if>
The average of 3 and 5 is: ${usr.avg(3, 6)}

<#if usr.sampleBoolean(3, 6)>GOGO</#if> -->

<#-- <#if usr??>The average of 3 and 5 is: ${usr.sampleIntArray(3, 6)}</#if> -->
<#-- <#if usr??>The average of 3 and 5 is: ${usr.sampleBoolean(3, 6)}</#if> -->
<#-- The average of 3 and 6 is: ${usr.sampleCalendar(2011, 5, 1)?date} -->

The average of 3 and 6 is: ${usr.sampleBigDecimal(3, 6)}
The average of 3 and 6 is: ${usr.sampleBigInteger(3, 6)}
The average of 3 and 6 is: ${usr.sampleByte(3, 6)}
The average of 3 and 6 is: ${usr.sampleDate(2011, 5, 1)?date}
The average of 3 and 6 is: ${usr.sampleDouble(3, 6)}
The average of 3 and 6 is: ${usr.sampleLong(3, 6)}
The average of 3 and 6 is: ${usr.sampleShort(3, 6)}

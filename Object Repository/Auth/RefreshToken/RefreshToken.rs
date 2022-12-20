<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>RefreshToken</name>
   <tag></tag>
   <elementGuidId>76382253-13a8-4e1c-b05d-f690aec9e03f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;refresh_token\&quot;: \&quot;eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjcmVhdGVkX2F0IjoiMjAyMi0xMi0xOVQyMzo0NDoxNy4zNTAzOTQ1OSswODowMCIsImRhdGEiOnsibmFtZSI6IkRJR08gQVBQIiwiZW1haWwiOiJjYXBzdG9uZWtlbDVAZ21haWwuY29tIiwibW9iaWxlX251bWJlciI6Iis2MjgyMzQ1Njc4OTEiLCJyb2xlIjp7ImlkIjoyLCJuYW1lIjoidXNlciIsImNyZWF0ZWRfYXQiOiIyMDIyLTEyLTE4VDE0OjM5OjExKzA4OjAwIiwidXBkYXRlZF9hdCI6IjIwMjItMTItMThUMTQ6Mzk6MTErMDg6MDAifSwidXNlcl9jb2luIjp7ImlkIjowLCJhbW91bnQiOjB9LCJjcmVkaXQiOnsiaWQiOjAsImFtb3VudCI6MH19LCJzdWIiOiJiYmZmMjg1OC1hOGRjLTQxNTEtYWE2Ni00NWIwZDJhZmFhZTYifQ.tCqjF03qdFijmle52DQ3u6LIpvg0jGuOLbTE_Jl_NIc\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>28d577b3-4ca7-4b20-a61a-59fbf943a6f7</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.4.1</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.baseURL}/auth/token/refresh</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>

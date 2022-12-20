<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>RefreshToken.02</name>
   <tag></tag>
   <elementGuidId>c9fcf3e3-3ed1-4037-a45e-39c63d1ff5e3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;refresh_token\&quot;: \&quot;eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjcmVhdGVkX2F0IjoiMjAyMi0xMi0xMFQwMjozOTo0My44NTM4ODAxNjMrMDg6MDAiLCJkYXRhIjp7Im5hbWUiOiJzYXJhaCIsImVtYWlsIjoiY2Fwc3RvbmVrZWw1QGdtYWlsLmNvbSIsIm1vYmlsZV9udW1iZXIiOiIwODc3MDE1Mzg2OTAiLCJyb2xlIjp7ImlkIjoyLCJuYW1lIjoiY3VzdG9tZXIiLCJjcmVhdGVkX2F0IjoiMjAyMi0xMi0wMlQxNjoxOToxOCswODowMCIsInVwZGF0ZWRfYXQiOiIyMDIyLTEyLTAyVDE2OjE5OjE4KzA4OjAwIn19LCJzdWIiOiIwZWJiZTUzMC0zZmExLTQzOTUtOTQzNS03MmM2MThiOGZjYmYifQ.iaj76deAyyNNGN6bsyvZ-6xXlQfJVG6l6GIZrzjcafA\&quot;\n}&quot;,
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
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>http://goapi.kuroyamii.works/auth/token/refresh</restUrl>
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

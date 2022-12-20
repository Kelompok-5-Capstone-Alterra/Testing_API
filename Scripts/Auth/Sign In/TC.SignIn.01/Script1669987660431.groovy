import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import groovy.json.JsonSlurper as JsonSlurper

response = WS.sendRequest(findTestObject('Auth/Sign In/SignIn'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Auth/Sign In/SignIn.02'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode405)

response = WS.sendRequest(findTestObject('Auth/Sign In/SignIn.03'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode404)

response = WS.sendRequest(findTestObject('Auth/Sign In/SignIn.04'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)

response = WS.sendRequest(findTestObject('Auth/Sign In/SignIn.05'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)

response = WS.sendRequest(findTestObject('Auth/Sign In/SignIn.06'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode401)

response = WS.sendRequest(findTestObject('Auth/Sign In/SignIn.07'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode401)

response = WS.sendRequest(findTestObject('Auth/Sign In/SignIn.08'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode401)

response = WS.sendRequest(findTestObject('Auth/Sign In/SignIn.09'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode401)

response = WS.sendRequest(findTestObject('Auth/Sign In/SignIn.10'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode400)


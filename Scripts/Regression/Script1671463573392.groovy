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

response = WS.sendRequest(findTestObject('Auth/Sign Up/SignUp'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode201)

response = WS.sendRequest(findTestObject('Auth/ValidateOTP/ValidateOTP'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Auth/ResendOTP/ResendOTP'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode201)

response = WS.sendRequest(findTestObject('Auth/RefreshToken/RefreshToken'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Auth/Sign In/SignIn'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Auth/ForgotPass/ForgotPass'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Auth/NewPass/NewPass'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Categories/CreateCategories/CreateCategories'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode201)

response = WS.sendRequest(findTestObject('Categories/GetCategories/GetCategories'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Categories/GetCategoriesByID/GetCategoriesByID'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Categories/UpdateCategories/UpdateCategories'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Categories/DeleteCategories/DeleteCategories'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('FAQ/CreateFAQ/CreateFAQ'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode201)

response = WS.sendRequest(findTestObject('FAQ/Get_FAQ/GetFAQ'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('FAQ/GetFAQByID/GetFAQByID'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('FAQ/UpdateFAQ/UpdateFAQ'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('FAQ/DeleteFAQ/DeleteFAQ'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Product/GetProduct/GetAllProduct'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Product/GetProductByID/GetProductByID'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Product/UpdateProduct/UpdateProduct'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Product/CreateProduct/CreateProduct'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode201)

response = WS.sendRequest(findTestObject('Product/DeleteProduct/DeleteProduct'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Redeem/PostRedeem/PostRedeem'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Redeem/GetRedeem/GetRedeem'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Redeem/GetAllRedeemByID/GetAllRedeemByID'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Redeem/GetAdminRedeem/GetAdminRedeem'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Redeem/GetAllRedeem/GetAllRedeem'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Redeem/UpdateRedeem/UpdateRedeem'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Redeem/GetRedeemByID/GetRedeemByID'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Redeem/DeleteRedeem/DeleteRedeem'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Rewards/GetAllReward/GetAllRewards'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Rewards/CreateReward/CreateReward'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode201)

response = WS.sendRequest(findTestObject('Rewards/GetRewardsByID/GetRewardsByID'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Rewards/UpdateReward/UpdateReward'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Rewards/DeleteReward/DeleteReward'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Users/GetUser/GetUser'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Users/UpdateAdmin/UpdateAdmin'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Users/UpdateUser/UpdateUser'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Users/ChangePassword/ChangePass'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Users/GetAdmin/GetAdminByID/GetAdminByID'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Users/GetAdmin/GetAdminData/GetAdmin'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Users/DeleteUser/DeleteUserByID'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Payment/PaymentDana'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Payment/PaymentOVO'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)

response = WS.sendRequest(findTestObject('Payment/PaymentShopeepay'))

WS.verifyResponseStatusCode(response, GlobalVariable.statusCode200)


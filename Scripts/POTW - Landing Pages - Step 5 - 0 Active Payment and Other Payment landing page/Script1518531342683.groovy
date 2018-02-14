import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://labs.schoolcomms.com/payments/login')

WebUI.setText(findTestObject('Page_Login  Schoolcomms (1)/input_Username'), 'Hillier77')

WebUI.setText(findTestObject('Page_Login  Schoolcomms (1)/input_memorabledata'), 'Abigail2014')

WebUI.setText(findTestObject('Page_Login  Schoolcomms (1)/input_password'), 'Isabel2011')

WebUI.click(findTestObject('Page_Login  Schoolcomms (1)/button_LOG IN'))

url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://labs.schoolcomms.com/payments/future')

WebUI.takeScreenshot('C:\\Windows\\Temp\\KatalonCaptures\\Future_Payment_Landing_Page.png')

WebUI.navigateToUrl('https://login.schoolgateway.com/0/auth/login')

WebUI.setText(findTestObject('Page_School Gateway Login/input_email'), 'ahillier77@gmail.com')

WebUI.setText(findTestObject('Page_School Gateway Login/input_pin'), '5505')

WebUI.click(findTestObject('Page_School Gateway Login/input_loginButton'))

WebUI.click(findTestObject('Page_Main Menu  School Gateway/div_menuOption'))

WebUI.takeScreenshot('C:\\Windows\\Temp\\KatalonCaptures\\SchoolGateway_No_Payment_Showing.png')

WebUI.closeBrowser()


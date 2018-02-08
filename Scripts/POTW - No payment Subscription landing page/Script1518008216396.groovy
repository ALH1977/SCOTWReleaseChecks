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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://labs.schoolcomms.com/payments/login')

WebUI.setText(findTestObject('Page_Login  Schoolcomms (1)/input_Username'), 'SCATNPMUA')

WebUI.setText(findTestObject('Page_Login  Schoolcomms (1)/input_memorabledata'), 'Summer2018')

WebUI.setText(findTestObject('Page_Login  Schoolcomms (1)/input_password'), 'Summer2019')

WebUI.click(findTestObject('Page_Login  Schoolcomms (1)/button_LOG IN'))

url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://labs.schoolcomms.com/payments/')

WebUI.takeScreenshot('/Users/AndyHillier/Desktop/Katalon/Test Screenshots/POTW - No Payment Subscription/No_Payment_Subscription.png')

WebUI.click(findTestObject('Page_Payments  Schoolcomms (1)/div_menu-toggle'))

WebUI.click(findTestObject('Page_Payments  Schoolcomms (1)/li_Clubs'))

WebUI.takeScreenshot('/Users/AndyHillier/Desktop/Katalon/Test Screenshots/POTW - No Payment Subscription/Club_Page_Confirmation.png')

WebUI.closeBrowser()


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

WebUI.openBrowser('https://labs.schoolcomms.com/payments')

WebUI.setText(findTestObject('Page_Login  Schoolcomms/input_Username'), GlobalVariable.Username)

WebUI.setText(findTestObject('Page_Login  Schoolcomms/input_memorabledata'), GlobalVariable.Memorable_Data)

WebUI.setText(findTestObject('Page_Login  Schoolcomms/input_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Page_Login  Schoolcomms/button_LOG IN'))

WebUI.click(findTestObject('Page_Active Payments  Schoolcomms/div_SupportJamieGA'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Active Payments  Schoolcomms/li_Log out'))

WebUI.verifyElementAttributeValue(findTestObject('Page_Login  Schoolcomms/input_Username'), 'Value', '', 0)

WebUI.setText(findTestObject('Page_Login  Schoolcomms/input_Username'), GlobalVariable.Username)

WebUI.setText(findTestObject('Page_Login  Schoolcomms/input_memorabledata'), GlobalVariable.Memorable_Data)

WebUI.setText(findTestObject('Page_Login  Schoolcomms/input_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Page_Login  Schoolcomms/i_fa fa-square-o'))

WebUI.click(findTestObject('Page_Login  Schoolcomms/button_LOG IN'))

WebUI.click(findTestObject('Page_Active Payments  Schoolcomms/div_SupportJamieGA'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Active Payments  Schoolcomms/li_Log out'))

WebUI.verifyElementAttributeValue(findTestObject('Page_Login  Schoolcomms/input_Username'), 'Value', GlobalVariable.Username, 0)


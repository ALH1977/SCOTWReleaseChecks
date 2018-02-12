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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://labs.schoolcomms.com/payments')

WebUI.setText(findTestObject('Page_Login  Schoolcomms/input_Username'), GlobalVariable.Username)

WebUI.setText(findTestObject('Page_Login  Schoolcomms/input_memorabledata'), GlobalVariable.Memorable_Data)

WebUI.setText(findTestObject('Page_Login  Schoolcomms/input_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Page_Login  Schoolcomms/button_LOG IN'))

WebUI.click(findTestObject('Page_Active Payments  Schoolcomms (1)/div_Create Payment Request'))

WebUI.setText(findTestObject('Page_Create Payment Request  School/input_DisplayName'), 'Automated PR Test')

WebUI.click(findTestObject('Page_Create Payment Request  School/div_Select payment type'))

WebUI.click(findTestObject('Page_Create Payment Request  School/div_Flexible amount can be pai'))

WebUI.setText(findTestObject('Page_Create Payment Request  School/input_VisibleTo'), '25/07/2027')

WebUI.setText(findTestObject('Page_Create Payment Request  School/input_VisibleFrom'), '09/02/2017')

WebUI.sendKeys(findTestObject('Page_Create Payment Request  School/input_VisibleFrom'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Page_Create Payment Request  School/input_Instalments0.DueDate'), '25/07/2027')

WebUI.setText(findTestObject('Page_Create Payment Request  School/input_Instalments0.AmountForma'), '0.5')

WebUI.click(findTestObject('Page_Create Payment Request  School/div_Chris Aaron'))

WebUI.click(findTestObject('Page_Create Payment Request  School/div_Emmanuel Adebayi'))

WebUI.click(findTestObject('Page_Create Payment Request  School/button_Add'))

WebUI.click(findTestObject('Page_Create Payment Request  School/li_Save                There a'))

WebUI.verifyElementVisible(findTestObject('Page_Active Payments  Schoolcomms (1)/span_The payment request has b'), FailureHandling.STOP_ON_FAILURE)


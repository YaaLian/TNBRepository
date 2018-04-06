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

WebUI.navigateToUrl('http://223.27.128.248:2503/TNB/Login.aspx')

WebUI.setText(findTestObject('Page_Tenaga Nasional Berhad/input_ucloginUserName'), 'tnb')

WebUI.setText(findTestObject('Page_Tenaga Nasional Berhad/input_ucloginPassword'), '!Qazzse4')

WebUI.click(findTestObject('Page_Tenaga Nasional Berhad/input_Log In'))

WebUI.click(findTestObject('Page_Tenaga Nasional Berhad/div_'))

WebUI.setText(findTestObject('Page_Tenaga Nasional Berhad/input_ucloginUserName'), 'superadmin')

WebUI.setText(findTestObject('Page_Tenaga Nasional Berhad/input_ucloginPassword'), '!Qazzse4')

WebUI.click(findTestObject('Page_Tenaga Nasional Berhad/input_Log In'))

WebUI.click(findTestObject('Page_Tenaga Nasional Berhad/a_SMR Log'))

WebUI.closeBrowser()


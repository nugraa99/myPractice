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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/lctr_introduction/a_Signup  Login'))

WebUI.setText(findTestObject('lctr_login/field_email'), 'mypractice123@gmail.com')

WebUI.setText(findTestObject('lctr_login/field_password'), 'belajar12345')

WebUI.click(findTestObject('lctr_login/btn_login'), FailureHandling.STOP_ON_FAILURE)

iklan = WebUI.verifyElementVisible(findTestObject('Object Repository/lctr_product/adds'))

//if (iklan == true) {
//	WebUI.clickOffset(null, 0, 0)
//}

WebUI.click(findTestObject('Object Repository/lctr_introduction/a_Products'))

WebUI.verifyElementVisible(findTestObject('Object Repository/lctr_product/verify_logoSpecialOffer'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/lctr_product/scroll_element'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()


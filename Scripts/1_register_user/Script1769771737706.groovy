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
import org.apache.commons.lang.RandomStringUtils // import random generate

WebUI.openBrowser('')

WebUI.navigateToUrl('https://automationexercise.com/')

//WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)'

WebUI.click(findTestObject('Object Repository/locator_introduction/a_Signup  Login'))

GlobalVariable.username = "user_" + System.currentTimeMillis() //melakukan generate random dan di simpan kedalam global variable
//String username = "user_" + System.currentTimeMillis()
WebUI.setText(findTestObject('locator_register/name'), GlobalVariable.username)
println("Generated username : " + GlobalVariable.username)

GlobalVariable.email = "practice_" + System.currentTimeMillis() + "@mailinator.com"  //melakukan generate random dan di simpan kedalam global variable
//String email = "test_" + System.currentTimeMillis() + "@mailinator.com"
WebUI.setText(findTestObject('locator_register/email'), GlobalVariable.email)
println("Generated email : " + GlobalVariable.email)

WebUI.click(findTestObject('Object Repository/locator_register/sign_up'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/locator_register/h2_enter_account_information'))

WebUI.click(findTestObject('Object Repository/locator_register/title'), FailureHandling.STOP_ON_FAILURE)

GlobalVariable.password = "pw_" + System.currentTimeMillis()  //melakukan generate random dan di simpan kedalam global variable
//String email = "test_" + System.currentTimeMillis() + "@mailinator.com"
WebUI.setText(findTestObject('Object Repository/locator_register/password'), GlobalVariable.password)
println("Generated password : " + GlobalVariable.password)

////Date of birth
//WebUI.click(findTestObject('Object Repository/locator_register/birth_day'))
//WebUI.click(findTestObject('Object Repository/locator_register/date_2'))
//WebUI.click(findTestObject('Object Repository/locator_register/birth_month'))
//WebUI.click(findTestObject('Object Repository/locator_register/months_august'))
//WebUI.click(findTestObject('Object Repository/locator_register/birth_year'))
//WebUI.click(findTestObject('Object Repository/locator_register/years_2004'))

//Generate random first name
def firstnames = ["zio", "fahri", "adam",  "rizky", "alex", "kurniawan", "agus"]  // menampilkan list array nama nama
def randomfirstname = new Random()
String firstname = firstnames[randomfirstname.nextInt(firstnames.size())]
GlobalVariable.firstname = firstname // menyimpan nama pertama ke global variable
println ("nama pertama : " + firstname)
WebUI.setText(findTestObject("Object Repository/locator_register/firstName"), firstname)

//Generate random last name
def lastnames = ["kunyuk", "tiputipu", "gokil",  "insinyur", "bhizer", "alamak", "walawe"] // menampilkan list array nama nama
def randomlastname = new Random()
String lastname = lastnames[randomlastname.nextInt(lastnames.size())]
GlobalVariable.lastname = lastname // menyimpan nama terakhir ke global variable
println ("nama terakhir : " + lastname)
WebUI.setText(findTestObject("Object Repository/locator_register/lastaName"), lastname)

//WebUI.closeBrowser()


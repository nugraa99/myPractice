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

GlobalVariable.email = "practice_" + System.currentTimeMillis() + "@mail.com"  //melakukan generate random dan di simpan kedalam global variable
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
def firstnames = ["zio", "fahri", "adam",  "rizky", "alex", "kurniawan", "agus"]  // menampilkan list array first name
def randomfirstname = new Random() // function acak untuk mengambil value
String firstname = firstnames[randomfirstname.nextInt(firstnames.size())] // proses pengacakan
GlobalVariable.firstname = firstname // menyimpan value ke global variable
println ("nama pertama : " + firstname)
WebUI.setText(findTestObject("Object Repository/locator_register/firstName"), firstname)

//Generate random last name
def lastnames = ["kunyuk", "tiputipu", "gokil",  "insinyur", "bhizer", "alamak", "walawe"] // menampilkan list array last name
def randomlastname = new Random() // function acak untuk mengambil value
String lastname = lastnames[randomlastname.nextInt(lastnames.size())] // proses pengacakan
GlobalVariable.lastname = lastname // menyimpan value ke global variable
println ("nama terakhir : " + lastname)
WebUI.setText(findTestObject("Object Repository/locator_register/lastaName"), lastname)

//Generate random company
def companys = ["arkadia company", "tirta company", "walk company",  "indiana oil company"] // menampilkan list array nama nama perusahaan
def comp = new Random() // function acak untuk mengambil value
String company = companys[comp.nextInt(companys.size())] // proses pengacakan
GlobalVariable.company = company // menyimpan value ke global variable
println ("nama perusahaan : " + company)
WebUI.setText(findTestObject("Object Repository/locator_register/company"), company)

//Generate random addres 1
def address1 = ["jalan nangroe", "jalan buah", "jalan asam",  "jalan arahan"] // menampilkan list array nama nama address 1
def add = new Random() // function acak untuk mengambil value
String alamat1 = address1[add.nextInt(address1.size())] // proses pengacakan
GlobalVariable.address1 = alamat1 // menyimpan value ke global variable
println ("tinggal di : " + alamat1)
WebUI.setText(findTestObject("Object Repository/locator_register/address1"), alamat1)

WebUI.delay(5)
WebUI.closeBrowser()


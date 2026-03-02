import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

//WebUI.openBrowser('')

//WebUI.navigateToUrl('https://automationexercise.com/')

//WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)'

WebUI.click(findTestObject('Object Repository/lctr_introduction/a_Signup  Login'))

GlobalVariable.username = ('user_' + System.currentTimeMillis( //melakukan generate random dan di simpan kedalam global variable
    ))

//String username = "user_" + System.currentTimeMillis()
WebUI.setText(findTestObject('lctr_register/name'), GlobalVariable.username)

println('Generated username : ' + GlobalVariable.username)

GlobalVariable.email = (('practice_' + System.currentTimeMillis()) + '@mail.com') //melakukan generate random dan di simpan kedalam global variable

//String email = "test_" + System.currentTimeMillis() + "@mailinator.com"
WebUI.setText(findTestObject('lctr_register/email'), GlobalVariable.email)

println('Generated email : ' + GlobalVariable.email)

WebUI.click(findTestObject('Object Repository/lctr_register/sign_up'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/lctr_register/h2_enter_account_information'))

WebUI.click(findTestObject('Object Repository/lctr_register/title'), FailureHandling.STOP_ON_FAILURE)

GlobalVariable.password = ('pw_' + System.currentTimeMillis())//melakukan generate random dan di simpan kedalam global variable

//String email = "test_" + System.currentTimeMillis() + "@mailinator.com"
WebUI.setText(findTestObject('Object Repository/lctr_register/password'), GlobalVariable.password)

println('Generated password : ' + GlobalVariable.password)

////Date of birth
WebUI.click(findTestObject('Object Repository/lctr_register/birth_day'))

WebUI.click(findTestObject('Object Repository/lctr_register/date_2'))

WebUI.click(findTestObject('Object Repository/lctr_register/birth_month'))

WebUI.click(findTestObject('Object Repository/lctr_register/months_august'))

WebUI.click(findTestObject('Object Repository/lctr_register/birth_year'))

WebUI.click(findTestObject('Object Repository/lctr_register/years_2004'))

//Generate random first name
def firstnames = ['zio', 'fahri', 'adam', 'rizky', 'alex', 'kurniawan', 'agus' ]// menampilkan list array first name

def randomfirstname = new Random( // function acak untuk mengambil value
)

String firstname = firstnames[randomfirstname.nextInt(firstnames.size())] // proses pengacakan

GlobalVariable.firstname = firstname // menyimpan value ke global variable

println('nama pertama : ' + firstname)

WebUI.setText(findTestObject('Object Repository/lctr_register/firstName'), firstname)

//Generate random last name
def lastnames = ['kunyuk', 'tiputipu', 'gokil', 'insinyur', 'bhizer', 'alamak', 'walawe']// menampilkan list array last name

def randomlastname = new Random()// function acak untuk mengambil value

String lastname = lastnames[randomlastname.nextInt(lastnames.size()) // proses pengacakan
]

GlobalVariable.lastname = lastname // menyimpan value ke global variable

println('nama terakhir : ' + lastname)

WebUI.setText(findTestObject('Object Repository/lctr_register/lastaName'), lastname)

//Generate random company
def companys = ['arkadia company', 'tirta company', 'walk company', 'indiana oil company' // menampilkan list array nama nama perusahaan
]

def comp = new Random( // function acak untuk mengambil value
)

String company = companys[comp.nextInt(companys.size()) // proses pengacakan
]

GlobalVariable.company = company // menyimpan value ke global variable

println('nama perusahaan : ' + company)

WebUI.setText(findTestObject('Object Repository/lctr_register/company'), company)

//Generate random addres 1
def address1 = ['jalan nangroe', 'jalan buah', 'jalan asam', 'jalan arahan' // menampilkan list array nama nama address 1
]

def add = new Random( // function acak untuk mengambil value
)

String alamat1 = address1[add.nextInt(address1.size()) // proses pengacakan
]

GlobalVariable.address1 = alamat1 // menyimpan value ke global variable

println('tinggal di : ' + alamat1)

WebUI.setText(findTestObject('Object Repository/lctr_register/address1'), alamat1)

//Generate random addres 2
def address2 = ['BLOK A, NO.18', 'BLOK XII, NO.41', 'BLOK 20, NO.1', 'BLOK NANGKA, NO.32' // menampilkan list array nama nama address 2
]

def add2 = new Random( // function acak untuk mengambil value
)

String alamat2 = address2[add2.nextInt(address2.size()) // proses pengacakan
]

GlobalVariable.address2 = alamat2 // menyimpan value ke global variable

println('tinggal di : ' + alamat2)

WebUI.setText(findTestObject('Object Repository/lctr_register/address2'), alamat2)

WebUI.click(findTestObject('Object Repository/lctr_register/country'))

WebUI.click(findTestObject('Object Repository/lctr_register/new zealand'))

WebUI.click(findTestObject('Object Repository/lctr_register/country'))

WebUI.verifyElementVisible(findTestObject('Object Repository/lctr_register/state'), FailureHandling.STOP_ON_FAILURE)

//Generate random state
def stats = ['INDONESIA', 'MALAYSIA', 'BRUNEI', 'SINGAPORE', 'JAPAN' // menampilkan list array nama nama state
]

def stt = new Random( // function acak untuk mengambil value
)

String negara = stats[stt.nextInt(stats.size()) // proses pengacakan
]

GlobalVariable.state = negara // menyimpan value ke global variable

println('tinggal di negara : ' + negara)

WebUI.setText(findTestObject('Object Repository/lctr_register/state'), negara)

//Generate random city
def city = ['JAKARTA', 'BOGOR', 'BEKASI', 'TANGGERANG', 'DEPOK' // menampilkan list array nama nama city
]

def citys = new Random( // function acak untuk mengambil value
)

String kota = city[citys.nextInt(city.size()) // proses pengacakan
]

GlobalVariable.city = kota // menyimpan value ke global variable

println('tinggal di kota : ' + kota)

WebUI.setText(findTestObject('Object Repository/lctr_register/city'), kota)

//Generate random zipcode
def zip = ['11351', '23034', '39102', '41203', '51026' // menampilkan list array kode pos
]

def zipc = new Random( // function acak untuk mengambil value
)

String kodepos = zip[zipc.nextInt(zip.size()) // proses pengacakan
]

GlobalVariable.zipcode = kodepos // menyimpan value ke global variable

println('kode pos : ' + kodepos)

WebUI.setText(findTestObject('Object Repository/lctr_register/zipcode'), kodepos)

//Generate random mobile number
def nohp = ['08710923820', '08519021242', '08391801021', '0891002018', '0851342712' // menampilkan list array nomor telfon
]

def numbphone = new Random( // function acak untuk mengambil value
)

String nomortelp = nohp[numbphone.nextInt(nohp.size()) // proses pengacakan
]

GlobalVariable.mobile_number = nomortelp // menyimpan value ke global variable

println('nomor telfon : ' + nomortelp)

WebUI.setText(findTestObject('Object Repository/lctr_register/mobile_number'), nomortelp)

WebUI.click(findTestObject('Object Repository/lctr_register/btn_create_account'))

WebUI.verifyTextPresent('Congratulations! Your new account has been successfully created!', false)

WebUI.click(findTestObject('Object Repository/lctr_register/btn_continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/lctr_register/verify_homepage'), 5)

WebUI.delay(5)


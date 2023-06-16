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

WebUI.navigateToUrl('https://www.flipkart.com/')

WebUI.maximizeWindow()

String Title= WebUI.getWindowTitle(FailureHandling.STOP_ON_FAILURE)

println("Title of the page: " + Title)

WebUI.click(findTestObject('Object Repository/Flipkart/closepopup'))

WebUI.click(findTestObject('Object Repository/Flipkart/SearchMobile'))

WebUI.setText(findTestObject('Object Repository/Flipkart/SearchMobile'),"mobile")

WebUI.sendKeys(findTestObject('Object Repository/Flipkart/SearchMobile'),Keys.chord(Keys.ENTER))

WebUI.check(findTestObject('Object Repository/Flipkart/checkbox'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Flipkart/Item'))

WebUI.switchToWindowIndex(1)

price= WebUI.getText(findTestObject('Object Repository/Flipkart/getPrice'))

println("Price of Item: "+price)

WebUI.click(findTestObject('Object Repository/Flipkart/addToCart'))

WebUI.click(findTestObject('Object Repository/Flipkart/placeorder'))

//WebUI.click(findTestObject('Object Repository/Flipkart/Page_Mobile- Buy Products Online at Best Pr_8706e1/svg'))
//
//WebUI.click(findTestObject('Object Repository/Flipkart/Page_Mobile- Buy Products Online at Best Pr_8706e1/div_Brand__24_Dny'))
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Flipkart/Page_Mobile- Buy Products Online at Best Pr_8706e1/select_1000015000200003000030000'), 
//    '30000', true)
//
//WebUI.click(findTestObject('Object Repository/Flipkart/Page_Mobile- Buy Products Online at Best Pr_8706e1/div_Newest First__24_Dny'))
//
//WebUI.click(findTestObject('Object Repository/Flipkart/Page_Mobile- Buy Products Online at Best Pr_8706e1/div_SAMSUNG Galaxy F04 (Opal Green, 64 GB)'))

WebUI.closeBrowser()


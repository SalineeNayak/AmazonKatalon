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

WebUI.openBrowser("")

WebUI.navigateToUrl("https://www.amazon.in/", FailureHandling.STOP_ON_FAILURE)

String Title= WebUI.getWindowTitle(FailureHandling.STOP_ON_FAILURE)

println("Title of the page: " + Title)

WebUI.click(findTestObject('Object Repository/AmazonLocators/Singin_Button'))

WebUI.setText(findTestObject('Object Repository/AmazonLocators/userName'), "Salineenayakwork@gmail.com", FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AmazonLocators/ContinueButton'))

WebUI.setEncryptedText(findTestObject('Object Repository/AmazonLocators/password'), "vshmLYV0ToJUwW6s7TkGWw==", FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AmazonLocators/passwordSignin'))

emailerror= WebUI.getText(findTestObject('Object Repository/AmazonLocators/EmailError'))

println("Account verification: "+emailerror )

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser("")

WebUI.navigateToUrl("https://www.amazon.in/", FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/AmazonLocators/allMenu'))

WebUI.scrollToElement(findTestObject('Object Repository/AmazonLocators/scrollTOsignin') , 0)

WebUI.click(findTestObject('Object Repository/AmazonLocators/close'))

WebUI.click(findTestObject('Object Repository/AmazonLocators/searchBar') , FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/AmazonLocators/searchBar') , "pen")

WebUI.sendKeys(findTestObject('Object Repository/AmazonLocators/searchBar'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotChecked(findTestObject('Object Repository/AmazonLocators/checkbox'), 2)

WebUI.click(findTestObject('Object Repository/AmazonLocators/checkbox'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Object Repository/AmazonLocators/selectOnePen') , 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AmazonLocators/selectOnePen'))

WebUI.switchToWindowIndex(1)

WebUI.delay(30)

WebUI.verifyElementPresent(findTestObject('Object Repository/AmazonLocators/addToCart'), 5)

WebUI.click(findTestObject('Object Repository/AmazonLocators/addToCart'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/AmazonLocators/ProceedToCheckout') , 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AmazonLocators/ProceedToCheckout'))

WebUI.delay(10)

WebUI.closeBrowser()









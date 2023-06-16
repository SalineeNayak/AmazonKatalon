import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.aspectj.lang.annotation.After
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AmazonAutomationBDD {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User opens the Amazon website")
	def openAmazonWebsite() {
		WebUI.openBrowser("")
		WebUI.navigateToUrl("https://www.amazon.in/", FailureHandling.STOP_ON_FAILURE)
	}

	@When('User clicks on the "Sign In" button')
	def clickSignInButton() {
		WebUI.click(findTestObject('Object Repository/AmazonLocators/Singin_Button'))
	}


	@And('User enters the username ')
	def enterUsername(String username) {
		WebUI.setText(findTestObject('Object Repository/AmazonLocators/userName'), username, FailureHandling.STOP_ON_FAILURE)
	}

	@And('User clicks on the "Continue" button')
	def clickContinueButton() {
		WebUI.click(findTestObject('Object Repository/AmazonLocators/ContinueButton'))
	}

	@And('User enters the encrypted password')
	def enterEncryptedPassword(String encryptedPassword) {
		WebUI.setEncryptedText(findTestObject('Object Repository/AmazonLocators/password'), encryptedPassword, FailureHandling.STOP_ON_FAILURE)
	}

	@And('User clicks on the "Sign In" button')
	def clickSignIn() {
		WebUI.click(findTestObject('Object Repository/AmazonLocators/passwordSignin'))
	}

	@Then('User should navigate to homepage')
	def homepage() {
		String Title= WebUI.getWindowTitle(FailureHandling.STOP_ON_FAILURE)
		println("Title of the page: " + Title)
	}


	@When('User maximizes the window')
	def maximizeWindow() {
		WebUI.maximizeWindow()
	}

	@And('User clicks on the "All" menu')
	def clickAllMenu() {
		WebUI.click(findTestObject('Object Repository/AmazonLocators/allMenu'))
	}

	@And('User scrolls to the "Sign In" element')
	def scrollToSignInElement() {
		WebUI.scrollToElement(findTestObject('Object Repository/AmazonLocators/scrollTOsignin'), 0)
	}

	@And('User closes the "Sign In" popup')
	def closeSignInPopup() {
		WebUI.click(findTestObject('Object Repository/AmazonLocators/close'))
	}

	@And('User enters "pen" in the search bar')
	def enterSearchKeyword() {
		WebUI.click(findTestObject('Object Repository/AmazonLocators/searchBar'), FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/AmazonLocators/searchBar'), 'pen')
	}

	@And('User presses Enter to perform the search')
	def performSearch() {
		WebUI.sendKeys(findTestObject('Object Repository/AmazonLocators/searchBar'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)
	}

	@And('User verifies that the checkbox is not checked')
	def verifyCheckboxNotChecked() {
		WebUI.verifyElementNotChecked(findTestObject('Object Repository/AmazonLocators/checkbox'), 2)
	}

	@And('User clicks on the checkbox')
	def clickCheckbox() {
		WebUI.click(findTestObject('Object Repository/AmazonLocators/checkbox'))
	}

	@And('User waits for a pen item to be visible')
	def waitForPenItem() {
		WebUI.waitForElementVisible(findTestObject('Object Repository/AmazonLocators/selectOnePen'), 5, FailureHandling.STOP_ON_FAILURE)
	}

	@And('User clicks on the pen item')
	def clickPenItem() {
		WebUI.click(findTestObject('Object Repository/AmazonLocators/selectOnePen'))
	}

	@And('User switches to the new window')
	def switchToNewWindow() {
		WebUI.switchToWindowIndex(1)
	}

	@And('User waits for the "Add to Cart" button to be present')
	def waitForAddToCartButton() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/AmazonLocators/addToCart'), 5)
	}

	@And('User clicks on the "Add to Cart" button')
	def clickAddToCartButton() {
		WebUI.click(findTestObject('Object Repository/AmazonLocators/addToCart'))
	}

	@And('User waits for the "Proceed to Checkout" button to be visible')
	def waitForProceedToCheckoutButton() {
		WebUI.waitForElementVisible(findTestObject('Object Repository/AmazonLocators/ProceedToCheckout'), 10, FailureHandling.STOP_ON_FAILURE)
	}

	@And('User clicks on the "Proceed to Checkout" button')
	def clickProceedToCheckoutButton() {
		WebUI.click(findTestObject('Object Repository/AmazonLocators/ProceedToCheckout'))
	}

	@Then('User should proceed to the checkout process')
	def verifyCheckoutProcess() {
		String Title= WebUI.getWindowTitle(FailureHandling.STOP_ON_FAILURE)
		println("Title of the page: " + Title)
		WebUI.closeBrowser()
	}
}
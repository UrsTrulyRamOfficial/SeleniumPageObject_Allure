/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/

package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.enums.WaitStrategy;
import com.qa.objects.BillingAddress;
import com.qa.objects.User;

public class CheckoutPage extends BasePage {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	public CheckoutPage load() {
		load("checkout");
		return this;
	};

	private final By firstNameFld = By.id("billing_first_name");
	private final By lastNameFld = By.id("billing_last_name");
	private final By addressLineOneFld = By.id("billing_address_1");
	private final By billingCityFld = By.id("billing_city");
	private final By billingPostCodeFld = By.id("billing_postcode");
	private final By billingEmailFld = By.id("billing_email");
	private final By placeOrderBtn = By.xpath("//button[normalize-space()='Place order']");
	private final By successNotice = By.xpath("//p[contains(@class,'woocommerce-thankyou-order-received')]");

	private final By clickHereToLoginLink = By.xpath("//a[@class='showlogin']");
	private final By usernameFld = By.id("username");
	private final By passwordFld = By.id("password");
	private final By loginBtn = By.xpath("//button[@name='login']");
	private final By overlay = By.cssSelector(".blockUI.blockOverlay");
	private final By countryDropDown = By.id("billing_country");
	private final By stateDropDown = By.id("billing_state");
	private final By directBankTransferRadioBtn = By.id("payment_method_bacs");

	private final By alternateCountryDropDown = By.id("select2-billing_country-container");
	private final By alternateStateDropDown = By.id("select2-billing_state-container");

	private final By productName = By.cssSelector("td[class='product-name']");

	/* Builder Pattern - used for Method Chaining */
	/* Structural Page Object */
	/* 1 method will do 1 operation --> sendKeys() */
	public CheckoutPage enterFirstName(String firstName) {
		clearAndSendKeys(firstNameFld, firstName, WaitStrategy.PRESENCE, "First Name Field");
		return this;
	}

	public CheckoutPage selectCountry(String countryName) {
		click(alternateCountryDropDown, WaitStrategy.CLICKABLE, "Alternate Country DropDown");
		WebElement e = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='" + countryName + "']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
		e.click();
		System.out.println("Country selected from Dropdown: " + countryName);
		return this;
	}

	public CheckoutPage selectState(String stateName) {
		click(alternateStateDropDown, WaitStrategy.CLICKABLE, "Alternate State DropDown");
		WebElement e = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='" + stateName + "']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
		e.click();
		System.out.println("Country selected from Dropdown: " + stateName);
		return this;
	}

	public CheckoutPage enterLastName(String lastName) {

		clearAndSendKeys(lastNameFld, lastName, WaitStrategy.PRESENCE, "Last Name Field");

		return this;
	}

	public CheckoutPage enteraddressLineOne(String addressLineOne) {
		
		clearAndSendKeys(addressLineOneFld, addressLineOne, WaitStrategy.PRESENCE, "Address Line One Field");

		return this;
	}

	public CheckoutPage enterCity(String city) {
		
		clearAndSendKeys(billingCityFld, city, WaitStrategy.PRESENCE, "Billing City Field");
		
		return this;
	}

	public CheckoutPage enterPostCode(String postCode) {

		clearAndSendKeys(billingPostCodeFld, postCode, WaitStrategy.PRESENCE, "Billing Post Code Field");

		return this;
	}

	public CheckoutPage enterEmail(String email) {

		clearAndSendKeys(billingEmailFld, email, WaitStrategy.PRESENCE, "Billing Email Field");

		return this;
	}

	public CheckoutPage placeOrder() {
		waitForOverlaysToDisappear(overlay);
		// driver.findElement(placeOrderBtn).click();
		// wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn)).click();
		click(placeOrderBtn, WaitStrategy.CLICKABLE, "Place order button");
		return this;
	}

	public String getNotice() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(successNotice)).getText();

	}

	public CheckoutPage clickHereToLoginLink() {
		// driver.findElement(clickHereToLoginLink).click();
		// wait.until(ExpectedConditions.elementToBeClickable(clickHereToLoginLink)).click();
		click(clickHereToLoginLink, WaitStrategy.CLICKABLE, "Click Here To Login Link");
		return this;
	}

	public CheckoutPage enterUsername(String username) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(usernameFld)).sendKeys(username);
		return this;
	}

	public CheckoutPage enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(passwordFld)).sendKeys(password);
		return this;
	}

	public CheckoutPage clickLoginBtn() {
		click(loginBtn, WaitStrategy.CLICKABLE, "Login button");
		return this;
	}

	/* Functional Page Object */
	public CheckoutPage login(String username, String password) {
		/* Builder Pattern - Method chaining */
		return enterUsername(username).enterPassword(password).clickLoginBtn();
	}

	private CheckoutPage waitForLoginBtnToDisapper() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loginBtn));
		return this;
	}

	public CheckoutPage login(User user) {
		/* Builder Pattern - Method chaining */
		return enterUsername(user.getUsername()).enterPassword(user.getPassword()).clickLoginBtn()
				.waitForLoginBtnToDisapper();
	}

	public CheckoutPage setBillingAddress(BillingAddress billingAddress) {
		return enterFirstName(billingAddress.getFirstName()).enterLastName(billingAddress.getLastName())
				.selectCountry(billingAddress.getCountry()).enteraddressLineOne(billingAddress.getAddressLineOne())
				.enterCity(billingAddress.getCity()).selectState(billingAddress.getState())
				.enterPostCode(billingAddress.getPostalCode()).enterEmail(billingAddress.getEmail());

	}

	public CheckoutPage selectDirectBankTransfer() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(directBankTransferRadioBtn));
		if (!element.isSelected()) {
			element.click();
		}
		return this;
	}

	public String getProductName() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(productName)).getText();
	}

}
/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/

package com.qa.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.enums.WaitStrategy;
import com.qa.pages.BasePage;
import com.qa.pages.StorePage;

public class MyHeader extends BasePage {

	public MyHeader(WebDriver driver) {
		super(driver);
	}

	private final By storeMenuLink = By.xpath("//li[@id='menu-item-1227']//a");

	/* Fluent Interface */
	public StorePage navigateToStoreUsingMenu() {
		// driver.findElement(storeMenuLink).click();
		//wait.until(ExpectedConditions.elementToBeClickable(storeMenuLink)).click();
		click(storeMenuLink, WaitStrategy.CLICKABLE, "Store Menu Link");
		return new StorePage(driver);
	}
}

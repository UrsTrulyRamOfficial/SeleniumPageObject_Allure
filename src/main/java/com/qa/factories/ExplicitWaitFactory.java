/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/


package com.qa.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.constants.FrameworkConstants;
import com.qa.driver.DriverManager;
import com.qa.enums.WaitStrategy;

public final class ExplicitWaitFactory {

	private ExplicitWaitFactory() {
	}

	public static WebElement performExplicitWait(WaitStrategy waitStrategy, By by) {

		WebElement element = null;
		if (waitStrategy == WaitStrategy.CLICKABLE) {
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitWait())
					.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if (waitStrategy == WaitStrategy.PRESENCE) {
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitWait())
					.until(ExpectedConditions.presenceOfElementLocated(by));
		} 
		else if (waitStrategy == WaitStrategy.VISIBLE) {
			element = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitWait())
					.until(ExpectedConditions.visibilityOfElementLocated(by));
		} 
		else if (waitStrategy == WaitStrategy.NONE) {
			System.out.println("Not Waiting for anything");
			element = DriverManager.getDriver().findElement(by);
		}
		return element;

		// wait.until(d -> d.findElement(link_logout).isEnabled());// Java 8 way
	}
}

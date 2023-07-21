/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/

package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.components.MyHeader;
import com.qa.components.ProductThumbnail;

public class HomePage extends BasePage {

	private MyHeader myHeader;
	private ProductThumbnail productThumbnail;

	public HomePage(WebDriver driver) {
		super(driver);
		myHeader = new MyHeader(driver);
		productThumbnail = new ProductThumbnail(driver);
	}

	public MyHeader getMyHeader() {
		return myHeader;
	}

	public ProductThumbnail getProductThumbnail() {
		return productThumbnail;
	}

	public HomePage load() {
		load("");
		wait.until(ExpectedConditions.titleContains("AskOmDch"));
		return this;
	}

}

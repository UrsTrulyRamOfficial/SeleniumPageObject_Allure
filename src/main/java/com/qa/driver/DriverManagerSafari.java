/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/


package com.qa.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManagerSafari implements DriverManager_OC {

	@Override
	public WebDriver createDriver() {
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		return driver;
	}

}

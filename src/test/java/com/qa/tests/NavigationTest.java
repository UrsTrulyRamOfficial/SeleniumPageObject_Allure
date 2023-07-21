/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/

package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.annotations.FrameworkAnnotation;
import com.qa.base.BaseTest;
import com.qa.enums.AuthorType;
import com.qa.enums.CategoryType;
import com.qa.pages.HomePage;
import com.qa.pages.StorePage;

public class NavigationTest extends BaseTest {

	@FrameworkAnnotation(author = { AuthorType.ABHI, 
			AuthorType.KRISH }, 
			category = { CategoryType.BVT,
			CategoryType.REGRESSION })
	@Test(groups = { "BVT", "REGRESSION" })
	public void navigateFromHomeToStoreUsingMainMenu() {

		StorePage storePage = new HomePage(getDriver()).load().getMyHeader().navigateToStoreUsingMenu();

		Assert.assertEquals(storePage.getTitle(), "Store");
	}
}

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
import com.qa.pages.StorePage;

public class SearchTest extends BaseTest {

	@FrameworkAnnotation(author = { AuthorType.RAMESH, 
			AuthorType.ARYA }, 
			category = { CategoryType.SANITY,
			CategoryType.BVT,
			CategoryType.REGRESSION })
	@Test(groups = { "SANITY", "BVT", "REGRESSION" })
	public void searchWithPartialMatch() {

		String searchFor = "Blue";
		StorePage storePage = 
				new StorePage(getDriver()).
					load().
					enterTextInSearchField(searchFor).
					clickSearchBtn();

		Assert.assertEquals(storePage.getTitle(), "Search results: “" + searchFor + "”");

	}

}

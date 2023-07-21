/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/

package com.qa.tests;

import io.qameta.allure.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.annotations.FrameworkAnnotation;
import com.qa.base.BaseTest;
import com.qa.enums.AuthorType;
import com.qa.enums.CategoryType;
import com.qa.objects.Product;
import com.qa.pages.CartPage;
import com.qa.pages.HomePage;
import com.qa.pages.StorePage;

import java.io.IOException;

@Epic("Epic - AddtoCart")
@Feature("Feature - Product AddToCart")
public class AddToCartTest extends BaseTest {

	
	@Story("Story - User should be able to add the Product into Cart")
	@Link("https://example.org")
	@Link(name = "allure", type = "mylink")
	@Issue("12345")
	//@TmsLink -> Test Management System (Manual test cases are written)
	@TmsLink("test-1")
	@Description("addToCartFromStorePage - This description is coming from Allure Annotation")
	@FrameworkAnnotation(author = { AuthorType.RAMESH, AuthorType.ARYA}, category = { CategoryType.SANITY,CategoryType.REGRESSION })
	@Test(groups = {"SANITY","REGRESSION"}, description = "addToCartFromStorePage - This description is coming from TestNG annotation property")
	public void addToCartFromStorePage() throws IOException {

		Product product = new Product(1215);
		CartPage cartPage  = 
				new StorePage(getDriver()).
					load().
					getProductThumbnail().
					clickaddToCartBtn(product.getName()).
					clickViewCartLink();

		
		Assert.assertEquals(cartPage.getProductName(), product.getName()+"FAIL");
	}
	
	@FrameworkAnnotation(author = { AuthorType.RAMESH, AuthorType.ARYA}, category = { CategoryType.SANITY,CategoryType.REGRESSION })
	//@Test(dataProvider = "getFeaturedProducts",dataProviderClass = MyDataProvider.class)
	public void addToCartFeaturedProducts(Product product) throws IOException {
		System.out.println("------------------------------------Product: "+product);
		CartPage cartPage=new HomePage(getDriver()).
				load().
				//clickaddToCartBtn("Blue Shoes").
				//clickaddToCartBtn(product.getName()).
				getProductThumbnail().
				clickaddToCartBtn(product.getName()).
				clickViewCartLink();
		Assert.assertEquals(cartPage.getProductName(), product.getName());
	}

}

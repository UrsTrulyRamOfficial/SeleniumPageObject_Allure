/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/

package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.annotations.FrameworkAnnotation;
import com.qa.api.actions.CartApi;
import com.qa.api.actions.SignUpApi;
import com.qa.base.BaseTest;
import com.qa.enums.AuthorType;
import com.qa.enums.CategoryType;
import com.qa.objects.Product;
import com.qa.objects.User;
import com.qa.pages.CheckoutPage;
import com.qa.utils.FakerUtils;

import java.io.IOException;

public class LoginTest extends BaseTest {

	@FrameworkAnnotation(author = { AuthorType.RAMESH, AuthorType.KRISH}, 
			category = { CategoryType.SANITY,CategoryType.SMOKE,CategoryType.REGRESSION })
	@Test(groups = {"SANITY","SMOKE","REGRESSION"})
	public void loginDuringCheckout_ATOMIC_TEST() throws IOException, InterruptedException {

		/* Do this using RestAssured library - WebService part */
		User user = getUser();

		SignUpApi signUpApi = new SignUpApi();
		signUpApi.register(user);
		System.out.println("REGISTER Cookies: " + signUpApi.getCookies());

		CartApi cartApi = new CartApi();
		Product product = new Product(1215);
		cartApi.addToCart(product.getId(), 1);

		/* Do this using WebDriver library - UI part */
		CheckoutPage checkoutPage = new CheckoutPage(getDriver()).load();
		Thread.sleep(5000);

		/* We can only inject the Cookies after loading the URL into Browser */
		injectCookiesToBrowser(cartApi.getCookies());

		checkoutPage.load();
		Thread.sleep(5000);
		checkoutPage.
			clickHereToLoginLink().
			login(user);
		Thread.sleep(5000);
		Assert.assertTrue(checkoutPage.getProductName().contains(product.getName()));

	}

	private User getUser() {
		String username = "demoUser" + new FakerUtils().generateRandomNumber();
		String password = "demoPwd";
		String email = username + "@gmail.com";
		User user = new User().setUsername(username).setEmail(email).setPassword(password);
		return user;
	}

}

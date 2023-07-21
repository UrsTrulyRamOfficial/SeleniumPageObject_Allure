/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/

package com.qa.api.actions;

import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.qa.api.ApiRequest;
import com.qa.constants.FrameworkConstants;
import com.qa.objects.User;
import com.qa.utils.VerificationManager;

import java.util.HashMap;

public class SignUpApi {

	private Cookies cookies;

	public Cookies getCookies() {
		return cookies;
	}

	public void setCookies(Cookies cookies) {
		this.cookies = cookies;
	}

	private String fetchRegisterNonceValueUsingJSoup() {
		Response response = getAccount();
		Document doc = Jsoup.parse(response.body().prettyPrint());
		/*
		 * <input type="hidden" id="woocommerce-register-nonce" name=
		 * "woocommerce-register-nonce" value="656055dd4d"/>
		 */
		Element element = doc.selectFirst("#woocommerce-register-nonce");
		return element.attr("value");
	}

	private Response getAccount() {
		Cookies cookies = new Cookies();

		Response response = ApiRequest.get("account", cookies);

		VerificationManager.validateResponse(response.getStatusCode(), 200,
				FrameworkConstants.ASSERTION_FOR_RESPONSE_STATUS_CODE
						+ " -  <b> <u>Fetch the account details </b> </u>");

		// ExtentLogger.pass(MarkupHelper.createCodeBlock(response.asString(),
		// CodeLanguage.JSON));
		// ExtentLogger.pass(response.asString());
		return response;
	}

	public Response register(User user) {
		Cookies cookies = new Cookies();

		Header header = new Header("content-type", "application/x-www-form-urlencoded");
		Headers headers = new Headers(header);

		HashMap<String, Object> formParams = new HashMap<>();
		formParams.put("username", user.getUsername());
		formParams.put("email", user.getEmail());
		formParams.put("password", user.getPassword());
		formParams.put("woocommerce-register-nonce", fetchRegisterNonceValueUsingJSoup());
		formParams.put("register", "Register");

		Response response = ApiRequest.post("/account", headers, formParams, cookies);

		VerificationManager.validateResponse(response.getStatusCode(), 302,
				FrameworkConstants.ASSERTION_FOR_RESPONSE_STATUS_CODE + " - <b> <u> Register the account </u> </b>");

		this.cookies = response.getDetailedCookies();
		return response;
	}
}

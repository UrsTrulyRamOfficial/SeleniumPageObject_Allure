/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/

package com.qa.utils;

import io.restassured.http.Cookies;
import org.openqa.selenium.Cookie;

import java.util.ArrayList;
import java.util.List;

public class CookieUtils {

	public List<Cookie> convertRestAssuredCookiesToSeleniumCookies(Cookies cookies) {
		
		List<io.restassured.http.Cookie> restAssuredCookies=new ArrayList<>();
		restAssuredCookies=cookies.asList();
		
		List<Cookie> seleniumCookies=new ArrayList<>();
		
		for(io.restassured.http.Cookie restAssuredCookie: restAssuredCookies) {
			seleniumCookies.add(
					new Cookie(
							restAssuredCookie.getName(), 
							restAssuredCookie.getValue(),
							restAssuredCookie.getDomain(),
							restAssuredCookie.getPath(),
							restAssuredCookie.getExpiryDate(),
							restAssuredCookie.isSecured(),
							restAssuredCookie.isHttpOnly()
								
							/*Present in Selenium 4.x*/
							//restAssuredCookie.getSameSite()
							));
		}
		
		return seleniumCookies;
	}
}

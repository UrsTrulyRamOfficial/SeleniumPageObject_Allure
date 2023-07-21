/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/

package com.qa.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {

	private ExtentManager() {
	}

	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

	public static ExtentTest getExtentTest() {
		return extentTest.get();
	}

	static void setExtentTest(ExtentTest test) {
		extentTest.set(test);
	}

	static void unload() {
		extentTest.remove();
	}

}

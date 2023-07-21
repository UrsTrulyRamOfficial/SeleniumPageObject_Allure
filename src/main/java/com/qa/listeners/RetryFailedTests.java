/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/

package com.qa.listeners;

import static com.qa.constants.FrameworkConstants.YES;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.qa.utils.ConfigLoader;

public class RetryFailedTests implements IRetryAnalyzer {

	private int count = 0;
	private int retries = 1;

	@Override
	public boolean retry(ITestResult result) {

		boolean value = false;
		if (ConfigLoader.getInstance().getRetryFailedTests().equalsIgnoreCase(YES)) {
			if (count < retries) {
				count++;
				return true;
			}
		}
		return value;
	}
}

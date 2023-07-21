/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/

package com.qa.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.Markup;
import com.qa.utils.ConfigLoader;
import com.qa.utils.ScreenshotUtils;

import static com.qa.constants.FrameworkConstants.YES;

public final class ExtentLogger {

	private ExtentLogger() {
	}

	public static void pass(String message) {
		ExtentManager.getExtentTest().pass(message);
	}

	public static void pass(Markup message) {
		ExtentManager.getExtentTest().pass(message);
	}

	public static void fail(String message) {
		ExtentManager.getExtentTest().fail(message);
	}

	public static void fail(Markup message) {
		ExtentManager.getExtentTest().fail(message);
	}

	public static void skip(String message) {
		ExtentManager.getExtentTest().skip(message);
	}

	public static void skip(Markup message) {
		ExtentManager.getExtentTest().skip(message);
	}

	public static void info(Markup message) {
		ExtentManager.getExtentTest().info(message);
	}

	public static void info(String message) {
		ExtentManager.getExtentTest().info(message);
	}

	public static void pass(String message, boolean isScreeshotNeeded) {
		if (ConfigLoader.getInstance().getPassedStepsScreenshot().equalsIgnoreCase(YES) && isScreeshotNeeded) {
			ExtentManager.getExtentTest().pass(message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
		} else {
			pass(message);
		}
	}

	public static void pass(Markup message, boolean isScreeshotNeeded) {
		if (ConfigLoader.getInstance().getPassedStepsScreenshot().equalsIgnoreCase(YES) && isScreeshotNeeded) {
			ExtentManager.getExtentTest().pass(
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
			ExtentManager.getExtentTest().pass(message);
		} else {
			pass(message);
		}
	}

	public static void fail(String message, boolean isScreeshotNeeded) {
		if (ConfigLoader.getInstance().getFailedStepsScreenshot().equalsIgnoreCase(YES) && isScreeshotNeeded) {
			ExtentManager.getExtentTest().fail(message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
		} else {
			fail(message);
		}
	}

	public static void fail(Markup message, boolean isScreeshotNeeded) {
		if (ConfigLoader.getInstance().getFailedStepsScreenshot().equalsIgnoreCase(YES) && isScreeshotNeeded) {
			ExtentManager.getExtentTest().fail(
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
			ExtentManager.getExtentTest().fail(message);
		} else {
			fail(message);
		}
	}

	public static void skip(String message, boolean isScreeshotNeeded) {
		if (ConfigLoader.getInstance().getSkippedStepsScreenshot().equalsIgnoreCase(YES) && isScreeshotNeeded) {
			ExtentManager.getExtentTest().skip(message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
		} else {
			skip(message);
		}
	}

	public static void skip(Markup message, boolean isScreeshotNeeded) {
		if (ConfigLoader.getInstance().getSkippedStepsScreenshot().equalsIgnoreCase(YES) && isScreeshotNeeded) {
			ExtentManager.getExtentTest().skip(
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
			ExtentManager.getExtentTest().skip(message);
		} else {
			skip(message);
		}
	}

}

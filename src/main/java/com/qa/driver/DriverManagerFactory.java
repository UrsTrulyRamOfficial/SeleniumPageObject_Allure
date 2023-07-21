/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/


package com.qa.driver;

import com.qa.enums.DriverType;

public class DriverManagerFactory {

	public static DriverManager_OC getManager(DriverType driverType) {

		switch (driverType) {

		case CHROME: {
			return new DriverManagerChrome();
		}
		case FIREFOX: {
			return new DriverManagerFirefox();
		}
		case EDGE: {
			return new DriverManagerEdge();
		}
		case SAFARI: {
			return new DriverManagerSafari();
		}
		case OPERA: {
			return new DriverManagerOpera();
		}
		default:
			throw new IllegalArgumentException("Invalid Driver: " + driverType);
		}
	}

}

/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/


package com.qa.javaMailAPI;

import com.qa.constants.FrameworkConstants;

/**
 * Data for Sending EMail after execution
 */
public class EmailConfig {

	public static final String SERVER = "smtp.gmail.com";
	public static final String PORT = "587";

	public static final String FROM = "abbaismart@gmail.com";
	public static final String PASSWORD = "********";

	/* "**********@gmail.com", *************/
	
	public static final String[] TO = {"abbaismart@gmail.com"};
	public static final String SUBJECT = FrameworkConstants.getProjectName();
}
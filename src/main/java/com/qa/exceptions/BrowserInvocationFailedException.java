/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/


package com.qa.exceptions;

@SuppressWarnings("serial")
public class BrowserInvocationFailedException extends FrameworkException {
	public BrowserInvocationFailedException(String message) {
		super(message);
	}

	public BrowserInvocationFailedException(String message, Throwable cause) {
		super(message, cause);
	}

}

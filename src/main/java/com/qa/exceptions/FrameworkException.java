/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/


package com.qa.exceptions;

/**
 * extends Runtime - because I want to terminate the program when the Exception
 * comes
 */
@SuppressWarnings("serial")
public class FrameworkException extends RuntimeException {

	public FrameworkException(String message) {
		super(message);
	}

	public FrameworkException(String message, Throwable cause) {
		super(message, cause);
	}
}

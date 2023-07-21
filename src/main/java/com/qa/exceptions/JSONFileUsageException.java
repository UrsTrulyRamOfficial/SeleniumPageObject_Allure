/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/


package com.qa.exceptions;

@SuppressWarnings("serial")
public class JSONFileUsageException extends FrameworkException {

	public JSONFileUsageException(String message) {
		super(message);
	}

	public JSONFileUsageException(String message, Throwable cause) {
		super(message, cause);
	}
}

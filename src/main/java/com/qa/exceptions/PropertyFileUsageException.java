/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/


package com.qa.exceptions;

@SuppressWarnings("serial")
public class PropertyFileUsageException extends FrameworkException {

	public PropertyFileUsageException(String message) {
		super(message);
	}

	public PropertyFileUsageException(String message, Throwable cause) {
		super(message, cause);
	}
}

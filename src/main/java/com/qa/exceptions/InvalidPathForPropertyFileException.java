/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/


package com.qa.exceptions;

@SuppressWarnings("serial")
public class InvalidPathForPropertyFileException extends InvalidPathForFilesException {

	public InvalidPathForPropertyFileException(String message) {
		super(message);
	}

	public InvalidPathForPropertyFileException(String message, Throwable cause) {
		super(message, cause);
	}

}

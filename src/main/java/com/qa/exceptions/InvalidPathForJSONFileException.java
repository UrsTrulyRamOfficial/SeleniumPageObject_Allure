/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/


package com.qa.exceptions;

@SuppressWarnings("serial")
public class InvalidPathForJSONFileException extends InvalidPathForFilesException {

	public InvalidPathForJSONFileException(String message) {
		super(message);
	}

	public InvalidPathForJSONFileException(String message, Throwable cause) {
		super(message, cause);
	}

}

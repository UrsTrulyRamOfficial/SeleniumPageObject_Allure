/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/


package com.qa.exceptions;

@SuppressWarnings("serial")
public class InvalidPathForExcelException extends InvalidPathForFilesException {

	public InvalidPathForExcelException(String message) {

		super(message);
	}

	public InvalidPathForExcelException(String message, Throwable cause) {
		super(message, cause);
	}
}

/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/

package com.qa.utils;

import com.github.javafaker.Faker;

public class FakerUtils {

	public Long generateRandomNumber() {
		Faker faker = new Faker();
		return faker.number().randomNumber(10, true);
	}
}

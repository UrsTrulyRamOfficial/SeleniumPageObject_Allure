/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/

package com.qa.dataproviders;


import org.testng.annotations.DataProvider;

import com.qa.objects.Product;
import com.qa.utils.JacksonUtils;

import java.io.IOException;

public class JSONDataProvider {

	@DataProvider(name="getFeaturedProducts",parallel = false)
	public Product[] getFeaturedProducts() throws IOException  {
		return JacksonUtils.deSerializationJSON("products.json", Product[].class);
	}
}

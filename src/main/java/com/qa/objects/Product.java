/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/

package com.qa.objects;

import java.io.IOException;

import com.qa.utils.JacksonUtils;

public class Product {

	private int id;
	private String name;

	public Product() {
	}

	/* Will take the product ID and set */
	public Product(int id) throws IOException {
		Product[] products = JacksonUtils.deSerializationJSON("products.json", Product[].class);
		for (Product product : products) {
			if (product.getId() == id) {
				this.id = id;
				this.name = product.getName();
			}
		}
	}

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

}

package com.tipsontech.composite.components.entities;

import com.tipsontech.composite.components.Item;

//Leaf class: Product
public class Product implements Item {
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return name + ": $" + price;
	}
}

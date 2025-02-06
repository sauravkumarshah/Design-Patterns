package com.tipsontech.composite;

import com.tipsontech.composite.entities.Box;
import com.tipsontech.composite.entities.Product;

public class CompositeDemo {
	
	public static void main(String[] args) {
		// Creating individual products
		Product laptop = new Product("Laptop", 1200.00);
		Product smartphone = new Product("Smartphone", 800.00);
		Product mouse = new Product("Mouse", 50.00);

		// Creating a small box and adding products
		Box smallBox = new Box(5.00);
		smallBox.addItem(mouse);
		smallBox.addItem(smartphone);

		// Creating a big box and adding products & smaller box
		Box bigBox = new Box(10.00);
		bigBox.addItem(laptop);
		bigBox.addItem(smallBox);

		// Displaying total price
		System.out.println("Price of Laptop: $" + laptop.getPrice());
		System.out.println("Price of Small Box: $" + smallBox.getPrice());
		System.out.println("Price of Big Box: $" + bigBox.getPrice());
	}
}

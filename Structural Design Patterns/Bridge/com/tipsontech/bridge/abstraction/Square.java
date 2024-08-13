package com.tipsontech.bridge.abstraction;

import com.tipsontech.bridge.implementation.Color;

//Refined Abstraction 2
public class Square extends Shape {
	public Square(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.print("Drawing Square. ");
		color.applyColor();
	}
}

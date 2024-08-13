package com.tipsontech.bridge.abstraction;

import com.tipsontech.bridge.implementation.Color;

//Refined Abstraction 1
public class Circle extends Shape {
	public Circle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.print("Drawing Circle. ");
		color.applyColor();
	}
}

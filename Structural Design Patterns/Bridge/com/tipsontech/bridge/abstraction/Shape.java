package com.tipsontech.bridge.abstraction;

import com.tipsontech.bridge.implementation.Color;

//Abstraction
public abstract class Shape {
	protected Color color; // Composition: reference to the implementation

	public Shape(Color color) {
		this.color = color;
	}

	public abstract void draw();
}

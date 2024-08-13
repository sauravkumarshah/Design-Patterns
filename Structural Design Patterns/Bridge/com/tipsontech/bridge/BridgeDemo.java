package com.tipsontech.bridge;

import com.tipsontech.bridge.abstraction.Circle;
import com.tipsontech.bridge.abstraction.Shape;
import com.tipsontech.bridge.abstraction.Square;
import com.tipsontech.bridge.implementation.Blue;
import com.tipsontech.bridge.implementation.Red;

public class BridgeDemo {
	public static void main(String[] args) {
		// Create objects from the abstraction and implementation hierarchies
		Shape redCircle = new Circle(new Red());
		Shape blueSquare = new Square(new Blue());

		// Draw shapes with colors
		redCircle.draw(); // Output: Drawing Circle. Applying red color.
		blueSquare.draw(); // Output: Drawing Square. Applying blue color.
	}
}

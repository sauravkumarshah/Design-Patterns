package com.tipsontech.builderpattern;

import com.tipsontech.builderpattern.builder.HouseBuilder;
import com.tipsontech.builderpattern.director.HouseDirector;
import com.tipsontech.builderpattern.product.House;

public class BuilderPatternDemo {
	
	public static void main(String[] args) {
		HouseBuilder builder = new HouseBuilder();
		
		HouseDirector director = new HouseDirector(builder);

		House simpleHouse = director.constructSimpleHouse();		
		System.out.println("Simple House : " + simpleHouse);
		
		House luxuryHouse = director.constructLuxuryHouse();		
		System.out.println("Luxury House : " + luxuryHouse);
	}

}

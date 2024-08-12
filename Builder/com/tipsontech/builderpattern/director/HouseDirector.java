package com.tipsontech.builderpattern.director;

import com.tipsontech.builderpattern.builder.HouseBuilder;
import com.tipsontech.builderpattern.product.House;

public class HouseDirector {
	
	private HouseBuilder builder;

	public HouseDirector(HouseBuilder builder) {
		this.builder = builder;
	}
	
	public House constructSimpleHouse() {
		
		return builder.buildWalls("Wooden Walls")
					  .buildRoof("Wooden Roofs")
					  .buildWindows("Glass Windows")
					  .buildDoor("Wooden Door")
					  .buildFloor("Wooden Floor")
					  .build();
	}
	
	public House constructLuxuryHouse() {
		return builder.buildWalls("Stone Walls")
				      .buildRoof("Slate Roof")
				      .buildWindows("Triple Glazed Windows")
				      .buildDoor("Reinforced Door")
				      .buildFloor("Marble Floor")
				      .buildSwimmingPool("Infinity Pool")
				      .buildGarage("Two-Car garage")
				      .buildGarden("Landscaped Garden")
				      .build();
	}
}	

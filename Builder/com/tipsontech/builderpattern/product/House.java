package com.tipsontech.builderpattern.product;

import com.tipsontech.builderpattern.builder.HouseBuilder;

public class House {
	
	private String walls;
	private String roof;
	private String windows;
	private String door;
	private String floor;
	private String swimmingPool;
	private String garage;
	private String garden;

	public House(HouseBuilder builder) {
		this.walls = builder.walls;
		this.roof = builder.roof;
		this.windows = builder.windows;
		this.door = builder.door;
		this.floor = builder.floor;
		this.swimmingPool = builder.swimmingPool;
		this.garage = builder.garage;
		this.garden = builder.garden;
	}

	@Override
	public String toString() {
		return "House [walls=" + walls + ", roof=" + roof + ", windows=" + windows + ", door=" + door + ", floor="
				+ floor + ", swimmingPool=" + swimmingPool + ", garage=" + garage + ", garden=" + garden + "]";
	}
	
}

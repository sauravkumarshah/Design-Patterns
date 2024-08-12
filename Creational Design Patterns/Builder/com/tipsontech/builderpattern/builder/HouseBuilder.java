package com.tipsontech.builderpattern.builder;

import com.tipsontech.builderpattern.product.House;

public class HouseBuilder {

	public String walls;
	public String roof;
	public String windows;
	public String door;
	public String floor;
	public String swimmingPool;
	public String garage;
	public String garden;

	public HouseBuilder buildWalls(String walls) {
		this.walls = walls;
		return this;
	}

	public HouseBuilder buildRoof(String roof) {
		this.roof = roof;
		return this;
	}

	public HouseBuilder buildWindows(String windows) {
		this.windows = windows;
		return this;
	}

	public HouseBuilder buildDoor(String door) {
		this.door = door;
		return this;
	}

	public HouseBuilder buildFloor(String floor) {
		this.floor = floor;
		return this;
	}

	public HouseBuilder buildSwimmingPool(String swimmingPool) {
		this.swimmingPool = swimmingPool;
		return this;
	}

	public HouseBuilder buildGarage(String garage) {
		this.garage = garage;
		return this;
	}

	public HouseBuilder buildGarden(String garden) {
		this.garden = garden;
		return this;
	}

	public House build() {
		return new House(this);
	}
}
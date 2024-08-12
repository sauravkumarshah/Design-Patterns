package com.tipsontech.furniture.factories;

import com.tipsontech.furniture.chairs.Chair;
import com.tipsontech.furniture.chairs.VictorianChair;
import com.tipsontech.furniture.coffeetables.CoffeeTable;
import com.tipsontech.furniture.coffeetables.VictorianCoffeeTable;
import com.tipsontech.furniture.sofas.Sofa;
import com.tipsontech.furniture.sofas.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory{

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa() {
		return new VictorianSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new VictorianCoffeeTable();
	}

}

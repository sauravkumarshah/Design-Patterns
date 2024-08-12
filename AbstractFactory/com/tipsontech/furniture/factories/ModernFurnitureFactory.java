package com.tipsontech.furniture.factories;

import com.tipsontech.furniture.chairs.Chair;
import com.tipsontech.furniture.chairs.ModernChair;
import com.tipsontech.furniture.coffeetables.CoffeeTable;
import com.tipsontech.furniture.coffeetables.ModernCoffeeTable;
import com.tipsontech.furniture.sofas.ModernSofa;
import com.tipsontech.furniture.sofas.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{

	@Override
	public Chair createChair() {
		return new ModernChair();
	}

	@Override
	public Sofa createSofa() {
		return new ModernSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new ModernCoffeeTable();
	}

}

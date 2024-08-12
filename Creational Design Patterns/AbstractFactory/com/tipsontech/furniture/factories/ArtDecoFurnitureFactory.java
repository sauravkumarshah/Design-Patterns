package com.tipsontech.furniture.factories;

import com.tipsontech.furniture.chairs.ArtDecoChair;
import com.tipsontech.furniture.chairs.Chair;
import com.tipsontech.furniture.coffeetables.ArtDecoCoffeeTable;
import com.tipsontech.furniture.coffeetables.CoffeeTable;
import com.tipsontech.furniture.sofas.ArtDecoSofa;
import com.tipsontech.furniture.sofas.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory{

	@Override
	public Chair createChair() {
		return new ArtDecoChair();
	}

	@Override
	public Sofa createSofa() {
		return new ArtDecoSofa();
	}

	@Override
	public CoffeeTable createCoffeeTable() {
		return new ArtDecoCoffeeTable();
	}

}

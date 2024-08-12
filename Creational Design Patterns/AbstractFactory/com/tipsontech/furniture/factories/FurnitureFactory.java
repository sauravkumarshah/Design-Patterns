package com.tipsontech.furniture.factories;

import com.tipsontech.furniture.chairs.Chair;
import com.tipsontech.furniture.coffeetables.CoffeeTable;
import com.tipsontech.furniture.sofas.Sofa;

public interface FurnitureFactory {
	Chair createChair();
	Sofa createSofa();
	CoffeeTable createCoffeeTable();
}

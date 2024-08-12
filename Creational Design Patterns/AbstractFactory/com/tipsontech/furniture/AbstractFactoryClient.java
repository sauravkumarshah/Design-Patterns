package com.tipsontech.furniture;

import com.tipsontech.furniture.chairs.Chair;
import com.tipsontech.furniture.coffeetables.CoffeeTable;
import com.tipsontech.furniture.factories.ArtDecoFurnitureFactory;
import com.tipsontech.furniture.factories.FurnitureFactory;
import com.tipsontech.furniture.factories.ModernFurnitureFactory;
import com.tipsontech.furniture.factories.VictorianFurnitureFactory;
import com.tipsontech.furniture.sofas.Sofa;

public class AbstractFactoryClient {

	private Chair chair;
	private Sofa sofa;
	private CoffeeTable coffeeTable;

	public AbstractFactoryClient(FurnitureFactory factory) {
		this.chair = factory.createChair();
		this.sofa = factory.createSofa();
		this.coffeeTable = factory.createCoffeeTable();
	}

	public void useFurniture() {
		chair.sitOn();
		sofa.lieOn();
		coffeeTable.placeItemsOn();
	}

	public static void main(String[] args) {
		FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
		AbstractFactoryClient client1 = new AbstractFactoryClient(victorianFactory);
		client1.useFurniture();

		FurnitureFactory modernFactory = new ModernFurnitureFactory();
		AbstractFactoryClient client2 = new AbstractFactoryClient(modernFactory);
		client2.useFurniture();

		FurnitureFactory artDecoFactory = new ArtDecoFurnitureFactory();
		AbstractFactoryClient client3 = new AbstractFactoryClient(artDecoFactory);
		client3.useFurniture();
	}
}

package com.tipsontech.example.transport;

public class Ship implements Transport{

	@Override
	public void deliver() {
		System.out.println("Delivering by sea in a ship");		
	}

}

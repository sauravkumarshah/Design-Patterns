package com.tipsontech.example.transport;

public class Truck implements Transport{

	@Override
	public void deliver() {
		System.out.println("Delivering by land in a truck.");
	}
}

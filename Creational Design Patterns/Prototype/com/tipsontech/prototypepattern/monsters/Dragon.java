package com.tipsontech.prototypepattern.monsters;

import com.tipsontech.prototypepattern.prototype.Monster;

public class Dragon implements Monster{
	
	private String name;
	private int health;
	private int attackPower;
	private int defense;
	
	public Dragon(String name, int health, int attackPower, int defense) {
		this.name = name;
		this.health = health;
		this.attackPower = attackPower;
		this.defense = defense;
	}
	
	@Override
	public Monster clone() {
		return new Dragon(name, health, attackPower, defense);
	}

	@Override
	public String toString() {
		return "Dragon [name=" + name + ", health=" + health + ", attackPower=" + attackPower + ", defense=" + defense
				+ "]";
	}
	
}

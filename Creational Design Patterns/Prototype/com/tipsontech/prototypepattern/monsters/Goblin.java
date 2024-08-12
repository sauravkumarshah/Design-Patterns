package com.tipsontech.prototypepattern.monsters;

import com.tipsontech.prototypepattern.prototype.Monster;

public class Goblin implements Monster{
	
	private String name;
	private int health;
	private int attackPower;
	private int defense;
	
	public Goblin(String name, int health, int attackPower, int defense) {
		this.name = name;
		this.health = health;
		this.attackPower = attackPower;
		this.defense = defense;
	}
	
	@Override
	public Monster clone() {
		return new Goblin(name, health, attackPower, defense);
	}

	@Override
	public String toString() {
		return "Goblin [name=" + name + ", health=" + health + ", attackPower=" + attackPower + ", defense=" + defense
				+ "]";
	}
	
}

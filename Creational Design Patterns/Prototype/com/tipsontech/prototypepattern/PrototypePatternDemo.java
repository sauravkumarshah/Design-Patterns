package com.tipsontech.prototypepattern;

import com.tipsontech.prototypepattern.monsters.Dragon;
import com.tipsontech.prototypepattern.prototype.Monster;

public class PrototypePatternDemo {
	
	public static void main(String[] args) {

		Dragon originalDragon = new Dragon("Fire Dragon", 300, 50, 30);
		Dragon originalGoblin = new Dragon("Cave Goblin", 100, 20, 10);
		
		Monster clonedDragon = originalDragon.clone();
		Monster clonedGoblin = originalGoblin.clone();

		System.out.println("Original Dragon : " + originalDragon);
		System.out.println("Cloned Dragon : " + clonedDragon);
		
		System.out.println("Original Goblin : " + originalGoblin);
		System.out.println("Cloned Goblin : " + clonedGoblin);
	}
	
}

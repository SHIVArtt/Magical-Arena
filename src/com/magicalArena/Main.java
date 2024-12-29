package com.magicalArena;


//It is the main class which creates two players, initializes a MagicalArena with those players, and starts the fight.
public class Main {
	
	// It is the main method where the program execution starts.
	public static void main(String[] args) {
		
		// Creating two Players by passing health, strength, and attack attributes
		Player playerA = new Player(50, 5, 10);
		Player playerB = new Player(100, 10, 5);

		
		// Create an instance of MagicalArena using the two players created above.
		MagicalArena arena = new MagicalArena(playerA, playerB);
		arena.fight();
		
	}
}

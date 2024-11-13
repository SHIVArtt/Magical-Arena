package com.magicalArena;

public class MagicalArena {
	
	private Player playerA;
	private Player playerB;

	// Constructor to initialize the players
	public MagicalArena(Player playerA, Player playerB) {
		this.playerA = playerA;
		this.playerB = playerB;
	}
	

	// Method to simulate the fight between the two players
	public void fight() {
		
		// Determine initial attacker and defender based on health
		Player attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
		Player defender = attacker == playerA ? playerB : playerA;

		// Run the this loop while both players are alive
		while (playerA.isAlive() && playerB.isAlive()) {
			
			// Roll dice for attack and defense
			int attackRoll = Dice.roll();
			int defenseRoll = Dice.roll();

			//Calculate damage
			int attackDamage= attacker.getAttack()*attackRoll;
			int defenseDamage= defender.getStrength()*defenseRoll;
			
			int damage = Math.max(0,attackDamage-defenseDamage);
			
			// Reduce health of the defender if there is damage
			if (damage > 0) {
				defender.reduceHealth(damage);
			}
			
			// Print status after this round
            System.out.println(attacker + " attacks with roll " + attackRoll + " causing " 
                + attackDamage + " damage. " + defender + " defends with roll " + defenseRoll 
                + " blocking " + defenseDamage + " damage. " + defender + " now has " 
                + defender.getHealth() + " health.");

			// Swap roles for the next round
			Player temp = attacker;
			attacker = defender;
			defender = temp;
		}

		
		// Determine and print the winner
		if (playerA.isAlive()) {
			System.out.println("Player A wins!");
		  } else {
			System.out.println("Player B wins!");
		}
	}
}

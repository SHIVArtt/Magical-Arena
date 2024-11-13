package com.magicalArena;

public class MagicalArenaTest {

	public static void main(String[] args) {
        testFight();
    }

    // Test to start a fight between two players
    public static void testFight() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        MagicalArena arena = new MagicalArena(playerA, playerB);

        // Simulate a fight
        arena.fight();

        // After the fight, we expect player A's health to have decreased
        if (playerA.getHealth() >= 50) {
            System.out.println("testFight failed. Player A's health should be reduced.");
        } else {
            System.out.println("testFight passed!");
        }

        // Also check if player B's health has decreased
        if (playerB.getHealth() >= 100) {
            System.out.println("testFight failed. Player B's health should be reduced.");
        } else {
            System.out.println("testFight passed!");
        }
    }
}

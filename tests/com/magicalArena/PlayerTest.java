package com.magicalArena;

public class PlayerTest {

public static void main(String[] args) {
    	
	//calling methods
        testReduceHealth();
        testIsAlive();
    }

 

    // Test reduceHealth method
    public static void testReduceHealth() {
        Player player = new Player(100, 10, 20);
        
        // Reduce health by 30 and check if health is reduced correctly
        player.reduceHealth(30);
        assert player.getHealth() == 70 : "Health should be reduced by 30, resulting in 70.";
        
        // Reduce health by a large amount (more than current health)
        player.reduceHealth(100);
        assert player.getHealth() == 0 : "Health should not go below 0, expected 0.";
        
        System.out.println("testReduceHealth passed!");
    }

    // Test isAlive method
    public static void testIsAlive() {
        Player player = new Player(100, 10, 20);
        
        // Player should be alive initially
        assert player.isAlive() == true : "Player should be alive with health 100.";
        
        // Reduce health to 0
        player.reduceHealth(100);
        
        // Player should not be alive if health is 0
        assert player.isAlive() == false : "Player should not be alive with health 0.";
        
        System.out.println("testIsAlive passed!");
    }

    
}

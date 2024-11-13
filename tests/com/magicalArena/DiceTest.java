package com.magicalArena;

public class DiceTest {

public static void main(String[]args) {
	
   // Test dice roll 1000 times to ensure it returns a value between 1 and 6
   for (int i = 0; i < 1000; i++) {
       int roll = Dice.roll();
       if (roll < 1 || roll > 6) {
           System.out.println("Dice roll failed! Roll was: " + roll);
           return; // Test failed
       }
   }
   System.out.println("Dice roll passed!");
  

    }
	
}

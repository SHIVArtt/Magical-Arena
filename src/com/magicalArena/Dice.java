package com.magicalArena;

import java.util.Random;

//this class used to roll the dice
public class Dice {

	private static final Random random = new Random();
	
	//it will return the random numbers from 1 to 6
	public static int roll() {
		int result= random.nextInt(6)+1; 
		return result;
	}
}

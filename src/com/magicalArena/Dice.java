package com.magicalArena;

import java.util.Random;

public class Dice {

	private static final Random random = new Random();
	
	public static int roll() {
		int result= random.nextInt(6)+1; //it will return the random numbers from 1 to 6
		return result;
	}
}

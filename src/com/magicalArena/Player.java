package com.magicalArena;

//The Player class represents a player in the Magical Arena game which provides some attributes for each player. 
public class Player {
	
	private int health;
	private int strength;
	private int attack;   

	// Constructor to initialize the player's attributes: health, strength, and attack
	public Player(int health, int strength, int attack) {
		this.health = health;
		this.strength = strength;
		this.attack = attack;
	}

	
    // Below are the getters and setters for the attributes
	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		this.health = health;
	}



	public int getStrength() {
		return strength;
	}



	public void setStrength(int strength) {
		this.strength = strength;
	}



	public int getAttack() {
		return attack;
	}



	public void setAttack(int attack) {
		this.attack = attack;
	}



	// Method to reduce the player's health when they take damage.
	public void reduceHealth(int damage) {
		this.health = Math.max(0,this.health-damage);		// It ensures that health doesn't go below 0
	}

	// Method to check if the player is still alive
	public boolean isAlive() {
		return health > 0;
	}

	
	
}

package com.magicalArena;

public class Player {
	private int health;
	private int strength;
	private int attack;   

	public Player(int health, int strength, int attack) {
		this.health = health;
		this.strength = strength;
		this.attack = attack;
	}

	public int getHealth() {
		return health;
	}
	public int getAttack() {
		return attack;     
	}

	public int getStrength() {
		
		return strength; 
	}

	public void reduceHealth(int damage) {
		this.health = Math.max(0,this.health-damage);		
	}

	public boolean isAlive() {
		return health > 0;
	}
	
}

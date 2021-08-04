package objectmaster;



public class Human {
private int strength = 3;
private int stealth = 3;
private int intelligence = 3;
private int health = 100;
private boolean alive = true;


public int getStrength() {
	return strength;
}
public void setStrength(int strength) {
	this.strength = strength;
}
public int getStealth() {
	return stealth;
}
public void setStealth(int stealth) {
	this.stealth = stealth;
}
public int getIntelligence() {
	return intelligence;
}
public void setIntelligence(int intelligence) {
	this.intelligence = intelligence;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
	if (this.health <= 0) {
		this.alive = false;
	}
}

public void attack(Human human) {
	human.setHealth(human.getHealth() - this.getStrength());
}
public boolean isAlive() {
	return alive;
}
public void setAlive(boolean alive) {
	this.alive = alive;
}


}
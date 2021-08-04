package objectmaster;

public class Wizard extends Human {
public Wizard() {
	super.setHealth(50);
	super.setIntelligence(8);
}
public void heal(Human human) {
	human.setHealth(human.getHealth() + this.getIntelligence());
}
public void fireball(Human human) {
	human.setHealth(human.getHealth() - this.getIntelligence() * 3);
}



}



package objectmaster;

public class Samurai extends Human {
private static int numberOfSamurai = 0;

public Samurai() {
	super.setHealth(200);
	numberOfSamurai++;
}
public void deathBlow(Human human) {
	human.setHealth(0);
}
public void meditate() {
	super.setHealth(this.getHealth() + (this.getHealth() / 2));
}
public static int howMany() {
	return numberOfSamurai;
}
}

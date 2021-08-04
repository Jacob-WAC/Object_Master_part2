package objectmaster;

public class Ninja extends Human {
	public Ninja() {
		super.setStealth(10);
	}
	public void steal(Human human) {
		human.setHealth(human.getHealth() - this.getStealth());
		super.setHealth(this.getHealth() + this.getStealth());
	}
	public void runAway() {
		super.setHealth(this.getHealth() - 10);
	}
}


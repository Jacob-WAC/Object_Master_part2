package objectmaster;

public class HumanTest {
public static void main(String[] args) {
	
	Human will = new Human();
	Wizard ralph = new Wizard();
	Ninja oliver = new Ninja();
	Samurai kevin = new Samurai();
	
	
	
	will.attack(ralph);
	ralph.fireball(will);
	ralph.heal(will);
	oliver.steal(will);
	oliver.runAway();
	kevin.meditate();
	System.out.println(oliver.isAlive());
	
	ralph.fireball(oliver);
	ralph.fireball(oliver);
	ralph.fireball(oliver);
	ralph.fireball(oliver);
	ralph.fireball(oliver);
	
	System.out.println(oliver.isAlive());
	
	System.out.println(oliver.getHealth());
	System.out.println(ralph.getHealth());
	System.out.println(will.getHealth());
	System.out.println(kevin.getHealth());
	System.out.println(will.isAlive());
	kevin.deathBlow(will);
	System.out.println(will.getHealth());
	System.out.println(will.isAlive());
}
}

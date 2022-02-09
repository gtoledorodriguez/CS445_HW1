package src.java;
public class Bat extends Creature implements Flyer {
	private String movement = "";
	public Bat(String name) {
		super(name);
	}
	
	@Override
	public void eat(Thing aThing) {
		if(aThing instanceof Creature) {
			super.eat(aThing);
		}else if(aThing instanceof Thing){
			System.out.println(this.toString() + " won't eat a " + aThing.toString());
		}
		
	}
	
	@Override
	public void fly() {
		this.movement = this.toString() + " is swooping through the dark.";
		System.out.println(this.movement);
	}

	@Override
	public void move() {
		this.fly();

	}
	public String getMovement() {
		return this.movement;
	}

}
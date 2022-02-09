package src.java;
public class Fly extends Creature implements Flyer {
	private String movement = "";
	public Fly(String name) {
		super(name);
	}
	
	@Override
	public void eat(Thing aThing) {
		if(aThing instanceof Creature) {
			System.out.println(this.toString() + " won't eat a " + aThing.toString());
		}else if(aThing instanceof Thing){
			super.eat(aThing);
		}
		

	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		this.movement = this.toString() + " is buzzing around in flight.";
		System.out.println(this.movement);

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.fly();
	}
	public String getMovement() {
		return this.movement;
	}

}
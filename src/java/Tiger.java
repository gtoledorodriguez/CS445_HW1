package src.java;
public class Tiger extends Creature{
	private String movement = "";
	public Tiger(String name) {
		super(name);
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.movement = this.toString() + " has just pounced.";
		System.out.println(this.movement);
	}
	
	public String getMovement() {
		return this.movement;
	}
}

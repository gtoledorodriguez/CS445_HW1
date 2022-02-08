package src.java;
public class Ant extends Creature{
	private String movement = "";
	public Ant(String name) {
		super(name);
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.movement = this.toString() + " is crawling around.";
		System.out.println(this.movement);
	}
	public String getMovement() {
		return this.movement;
	}


}

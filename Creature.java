
public abstract class Creature extends Thing{
	private String lastThingCreatureAte = "";
	private String answerToWhatDidYouEat = "";
	
	public Creature(String name) {
		super(name);
	}
	
	public void eat(Thing aThing) {
		this.lastThingCreatureAte = aThing.toString(); 	
	}
	
	public String getLastThingCreatureAte() {
		return this.lastThingCreatureAte;
	}
	
	public abstract void move();
	
	public void whatDidYouEat() {
		if(lastThingCreatureAte.equals("")){
			this.answerToWhatDidYouEat = this.toString() + " has had nothing to eat!";
			System.out.println(this.answerToWhatDidYouEat);
		}else {
			this.answerToWhatDidYouEat = this.toString() + " has eaten a " + this.lastThingCreatureAte;
			System.out.println(this.answerToWhatDidYouEat);
		}
	}
	
	public String getAnswerToWhatDidYouEat() {
		return this.answerToWhatDidYouEat;
	}
}

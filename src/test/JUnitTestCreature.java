package src.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.java.*;

class JUnitTestCreature {
	@Test
	void test_toString_on_Thing() {
		String name = "Banana";
		Thing t = new Thing(name);
		assertEquals(name, t.toString());
	}
	@Test
	void test_toString_on_Tiger() {
		String name = "Jorge";
		Tiger t = new Tiger(name);
		assertEquals(name+" "+t.getClass().getSimpleName(), t.toString());
	}
	@Test
	void test_toString_on_Ant() {
		String name = "Joey";
		Ant a = new Ant(name);
		assertEquals(name+" "+a.getClass().getSimpleName(), a.toString());
	}
	@Test
	void test_toString_on_Fly() {
		String name = "Josephine";
		Fly f = new Fly(name);
		assertEquals(name+" "+f.getClass().getSimpleName(), f.toString());
	}
	@Test
	void test_toString_on_Bat() {
		String name = "Joseph";
		Bat b = new Bat(name);
		assertEquals(name+" "+b.getClass().getSimpleName(), b.toString());
	}
	
	
	@Test
	void test_if_Tiger_ate_if_it_was_a_Thing() {
		String name = "Jorge";
		Tiger t = new Tiger(name);
		Thing th = new Thing("Banana");
		t.eat(th);
		t.whatDidYouEat();
		assertEquals(t.toString()+" has eaten a " + t.getLastThingCreatureAte(), t.getAnswerToWhatDidYouEat());
	}
	@Test
	void test_if_Ant_ate_if_it_was_a_Thing() {
		String name = "Joey";
		Ant a = new Ant(name);
		Thing th = new Thing("Banana");
		a.eat(th);
		a.whatDidYouEat();
		assertEquals(a.toString()+" has eaten a " + a.getLastThingCreatureAte(), a.getAnswerToWhatDidYouEat());
	}
	@Test
	void test_if_Fly_ate_if_it_was_a_Thing() {
		String name = "Josephine";
		Fly f = new Fly(name);
		Thing th = new Thing("Banana");
		f.eat(th);
		f.whatDidYouEat();
		assertEquals(f.toString()+" has eaten a " + f.getLastThingCreatureAte(), f.getAnswerToWhatDidYouEat());
	}
	@Test
	void test_if_Bat_ate_if_it_was_a_Thing() {
		String name = "Joseph";
		Bat b = new Bat(name);
		Thing th = new Thing("Banana");
		b.eat(th);
		b.whatDidYouEat();
		assertEquals(b.toString()+" has had nothing to eat!", b.getAnswerToWhatDidYouEat());
	}
	
	@Test
	void test_if_Tiger_ate_if_it_was_a_Creature() {
		String name = "Jorge";
		Tiger t = new Tiger(name);
		Ant th = new Ant("Andy");
		t.eat(th);
		t.whatDidYouEat();
		assertEquals(t.toString()+" has eaten a " + t.getLastThingCreatureAte(), t.getAnswerToWhatDidYouEat());
	}
	@Test
	void test_if_Ant_ate_if_it_was_a_Creature() {
		String name = "Joey";
		Ant a = new Ant(name);
		Fly th = new Fly("Fred");
		a.eat(th);
		a.whatDidYouEat();
		assertEquals(a.toString()+" has eaten a " + a.getLastThingCreatureAte(), a.getAnswerToWhatDidYouEat());
	}
	@Test
	void test_if_Fly_ate_if_it_was_a_Creature() {
		String name = "Josephine";
		Fly f = new Fly(name);
		Bat th = new Bat("Barry");
		f.eat(th);
		f.whatDidYouEat();
		assertEquals(f.toString()+" has had nothing to eat!", f.getAnswerToWhatDidYouEat());
	}
	@Test
	void test_if_Bat_ate_if_it_was_a_Creature() {
		String name = "Joseph";
		Bat b = new Bat(name);
		Tiger th = new Tiger("Tory");
		b.eat(th);
		b.whatDidYouEat();
		assertEquals(b.toString()+" has eaten a " + b.getLastThingCreatureAte(), b.getAnswerToWhatDidYouEat());
	}
	
	@Test
	void test_if_Tiger_moves() {
		String name = "Jorge";
		Tiger t = new Tiger(name);
		t.move();
		assertEquals(t.toString() + " has just pounced.", t.getMovement());
	}
	@Test
	void test_if_Ant_moves() {
		String name = "Joey";
		Ant a = new Ant(name);
		a.move();
		assertEquals(a.toString() + " is crawling around.", a.getMovement());
	}
	@Test
	void test_if_Fly_moves() {
		String name = "Josephine";
		Fly f = new Fly(name);
		f.move();
		assertEquals(f.toString()+ " is buzzing around in flight.", f.getMovement());
	}
	@Test
	void test_if_Bat_moves() {
		String name = "Joseph";
		Bat b = new Bat(name);
		b.move();
		assertEquals(b.toString()+ " is swooping through the dark.", b.getMovement());
	}
}
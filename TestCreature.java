public class TestCreature{
    static int THING_COUNT = 10;
    static int CREATURE_COUNT = 6;

    public static void main(String[] args){
        Thing[] thingArray = new Thing[THING_COUNT];
        
        for(int i=0; i<THING_COUNT;i++){
        	String thingName = "Thing_"+(i);
            thingArray[i] = new Thing(thingName);
        }
        
        Creature[] creatureArray = new Creature[CREATURE_COUNT];
        creatureArray[0] = new Tiger("Creature_0");
        creatureArray[1] = new Ant("Creature_1");
        creatureArray[2] = new Fly("Creature_2");
        creatureArray[3] = new Bat("Creature_3");
        creatureArray[4] = new Ant("Creature_4");
        creatureArray[5] = new Tiger("Creature_5");
        
        System.out.println("Things: ");
        for(int j=0; j<thingArray.length;j++){
            System.out.println(thingArray[j].toString());
        }
        
        System.out.println("\nCreatures:");
        for(int j=0; j<creatureArray.length;j++){
            System.out.println(creatureArray[j].toString());
        }
        
        System.out.println("\nCreatures Ate...");
        if (CREATURE_COUNT <= THING_COUNT){
        	//Test that Creature Eats Things
        	System.out.println("Things:");
        	for(int i=0; i<creatureArray.length;i++){
                creatureArray[i].eat(thingArray[i]);
                creatureArray[i].whatDidYouEat();
            }
        	
        	//Test that Creature Eats Creatures
        	Creature[] creatureToBeEatenArray = new Creature[CREATURE_COUNT];
            creatureToBeEatenArray[0] = new Bat("CreatureToBeEaten_0");
            creatureToBeEatenArray[1] = new Tiger("CreatureToBeEaten_1");
            creatureToBeEatenArray[2] = new Ant("CreatureToBeEaten_2");
            creatureToBeEatenArray[3] = new Fly("CreatureToBeEaten_3");
            creatureToBeEatenArray[4] = new Fly("CreatureToBeEaten_4");
            creatureToBeEatenArray[5] = new Bat("CreatureToBeEaten_5");
            
            System.out.println("\nCreatures:");
        	for(int i=0; i<creatureArray.length;i++){
                creatureArray[i].eat(creatureToBeEatenArray[i]);
                creatureArray[i].whatDidYouEat();
            }
        }
        
        System.out.println("\nCreatures Move:");
        for(int i=0; i<creatureArray.length;i++){
            creatureArray[i].move();
        }
    }

}
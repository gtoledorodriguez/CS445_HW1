package src.java;
public class Thing {
    private String thingName;
    public Thing(String name){
        this.thingName = name;
    }

    public String toString(){
    	String className = getClass().getSimpleName();
    	if(!className.equals("Thing")){
    		return this.thingName + " "+className;
    	}
        return this.thingName;
    }
}

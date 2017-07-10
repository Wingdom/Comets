package comets;

public class Shot extends SpaceObject{

    private int age;
    public Shot(double xPos, double yPos, double xVel, double yVel) {
    	super(xPos, yPos, xVel, yVel, 3);
    	age = 0;
    	
    }
    
    public int getAge(){
    	return age;
    }
    
    public void move(){
    	super.move();
    	age++;
    }
    
    
}
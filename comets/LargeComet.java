package comets;
import java.util.*;

public class LargeComet extends Comet{
	
    public LargeComet(double xPos, double yPos, double xVel, double yVel) {
    	super(xPos, yPos, xVel, yVel, 40);
    }
    
    public java.util.Vector<Comet> explode(){
    	double Vx, Vy;
    	Vector<Comet> comets = new Vector<Comet>();
    	for(int i = 0; i<2; i++)
    	{
    		Vx = (Math.random()*10)-5;
    		Vy = (Math.random()*10)-5;
    		comets.add(new MediumComet(x, y, Vx, Vy));
    	}
    	return comets;
    }
    
    
}
package comets;
import java.util.*;


public class MediumComet extends Comet{

    public MediumComet(double xPos, double yPos, double xVel, double yVel) {
    	super(xPos, yPos, xVel, yVel, 30);
    }
    
     public java.util.Vector<Comet> explode(){
    	double Vx, Vy;
    	Vector<Comet> comets = new Vector<Comet>();
    	for(int i = 0; i<3; i++)
    	{
    		Vx = (Math.random()*10)-5;
    		Vy = (Math.random()*10)-5;
    		comets.add(new SmallComet(x, y, Vx, Vy));
    	}
    	return comets;
    }
    
}
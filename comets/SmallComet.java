package comets;
import java.util.*;

public class SmallComet extends Comet{

    public SmallComet(double xPos, double yPos, double xVel, double yVel) {
        super(xPos, yPos, xVel, yVel, 20);
    }
    
    public java.util.Vector<Comet> explode(){
    	Vector<Comet> comets = new Vector<Comet>();
    	return comets;
    }
    
    
}
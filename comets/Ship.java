package comets;



public class Ship extends SpaceObject{
    private double turningRate = .1;
    private double angle;
    public Ship(double xPos, double yPos, double xVel, double yVel){
    	       super(xPos, yPos, xVel, yVel, 10);
    	       angle = 0;
            }
     public double getAngle(){
     	return angle;
     }
     
     public void rotateLeft(){
     	this.angle -= turningRate;
     }
     
     public void rotateRight(){
     	this.angle += turningRate;
     }
     
     public void accelerate()
     {
     	super.xVel += .1*Math.sin(getAngle());
     	super.yVel += .1*Math.cos(getAngle()); 
     }
     
     public Shot fire(){
     	double vX, vY;
     	vX = 3*Math.sin(getAngle()) + super.xVel;
     	vY = 3*Math.cos(getAngle()) + super.yVel;
     	return new Shot(x, y, vX, vY);
     }
    
    
}
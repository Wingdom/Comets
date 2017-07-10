package comets;

public abstract class SpaceObject extends java.lang.Object {
	 //x is the x position, y is the y position, Xvel is the velocity in the x direction
	//yVel is the velocity in the y direction, Rad is the radius of the object
	//playfieldHeight is the size of the play area in the y direction where playfieldWidth is the x direction
	public static double playfieldHeight;
	public static double playfieldWidth;
	public double x, y;
	public double xVel;
	public double yVel;
	public double rad;
	public SpaceObject(double xPos, double yPos, double xVel, double yVel, double radius){
		x = xPos;
		y= yPos;
		xVel = xVel;
		yVel = yVel;
		rad = radius;
	}
	
	public double getRadius(){
		return rad;
	}
	
	public double getXPosition(){
		return x;
	}
	
	public double getYPosition(){
		return y;
	}
	public void move(){
		x +=  xVel;
		if(x <0)
		{
			x += playfieldWidth;
		}
		else if(x > playfieldWidth)
		{
			x -= playfieldWidth;
		}
		y += yVel; 	
		if(y <0)
		{
			y += playfieldHeight;
		}
		else if(y > 0)
		{
			y -= playfieldHeight;
		}
	}
	
	public boolean overlapping(SpaceObject rhs) {
		if(Math.sqrt(Math.pow(this.x - rhs.x, 2)+Math.pow(this.y-rhs.y, 2)) < this.rad + rhs.rad )
			return true;
		else
			return false;
	}
	
    
}
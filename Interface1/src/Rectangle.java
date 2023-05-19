
public class Rectangle implements Drawable
{
	   private double length;
	   private double breadth;
	   
	public Rectangle(double length, double breadth)
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}	
	public double calculateArea()
	
	{ 	
		double res;
		return res=length*breadth;
	}
}

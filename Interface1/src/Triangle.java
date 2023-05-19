
public class Triangle implements Drawable 
{
	 
	 private double base;
	 private double height;
	public Triangle(double base, double height) 
	{
		super();
		
		this.base = base;
		this.height = height;
	}
  
	public double calculateArea()
	
	{ 	
		double res;
		return res=0.5*(base*height);
	}
}


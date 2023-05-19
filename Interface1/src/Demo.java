
public class Demo
{
	public static void main(String[] args) 
	{
		Circle c=new Circle(7);
		double res=c.calculateArea();
		System.out.println("Area of Circle : "+res);

	    Rectangle r=new Rectangle(70,90);
		double ress=r.calculateArea();
		System.out.println("Area of Rectangle : "+ress);
		

		Triangle t=new Triangle(30,50);
		double resss=t.calculateArea();
		System.out.println("Area of Triangle : "+resss);
	}
	
	

}

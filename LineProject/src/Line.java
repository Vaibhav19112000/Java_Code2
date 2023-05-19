public class Line
{
	Point sp;
	Point ep;
	
	public Line(int x1,int y1,int x2,int y2)
	{
		sp=new Point(x1,y1);
		ep=new Point(x2,y2);
		
	}
	public void display()
	{
	ep.display();
		
	}
	
}

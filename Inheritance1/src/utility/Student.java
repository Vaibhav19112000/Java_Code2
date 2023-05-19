package utility;


public class Student  extends Person
{
	private int rno;
	private float percentage;
	public Student()
	{
		super("NA",22);
		rno=12;
		percentage=88;
	}
	public Student(int age,String name,int rno,float percentage)
	{
		super(name,age);
		this.rno=rno;
		this.percentage=percentage;
		
	}
	public void display()
	{
		System.out.println("Roll no:: "+rno);
		System.out.println("Percentage:: "+percentage);
		super.display();
	}

}

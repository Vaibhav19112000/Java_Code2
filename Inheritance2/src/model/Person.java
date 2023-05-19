package model;

public class Person extends Emp
{
	private String name;
	private int age;
	
	public Person()
	{
		
	}
	public Person(String name,int age,int empid,double salary)
	{
		super(empid,salary);
		this.name=name;
		this.age=age;
		
		
	}
	public void display()
	{
		System.out.println("Name : "+name+"\nAge :" +age);
		super.display();
	}

}

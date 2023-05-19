package model;

public class Emp 
{
	private int empid;
	private double salary;
	
	public Emp()
	{
		
	}
	public Emp(int empid,double salary)
	{
		this.empid=empid;
		this.salary=salary;
		
	}
	public void display()
	{
		System.out.println("Emp id : "+empid);
		System.out.println("Salary : "+salary);
	}
}


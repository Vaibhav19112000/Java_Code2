package model;

public class Customer 
{
	private String emailid;
	private String name;
	
	public Customer()
	{
		
	}
	public Customer(String emailid,String name)
	{
		this.emailid=emailid;
		this.name=name;
	}
	public double giveDiscount(double a)
	{
		return (a*0.05);
		
	}		
	
}

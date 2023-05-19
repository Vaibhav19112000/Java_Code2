package model;
import java.util.*;

public class Customer 
{
	private String emailid;
	private String name;
	private double price;
	
	
	public Customer()
	{
		
		1
		
	}
	public void z()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email ID : ");
		String emailid=sc.next();
		this.emailid=emailid;
		System.out.println("Enter Name : ");
		String name=sc.next();
		this.name=name;
		System.out.println("Enter Price : ");
		double price=sc.nextDouble();
		this.price=price;
		display();
		giveDiscount();
	}
	public void display()
	{
		System.out.println("Email ID : "+emailid+"\nName : "+name);
	}
	public String getEmail()
	{
		return emailid;
	}
	public String getName()
	{
		return name;
	}
	
	public void giveDiscount()
	{
		System.out.println("Sorry no discount for new customer,please register");
	}
}

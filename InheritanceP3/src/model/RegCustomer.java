package model;
import java.util.*;


public class RegCustomer extends Customer
{
	private static int reg_no;
	private static int r;
	private double price;
	private double discount;
	static 
	{
		r=10;
	}
	
	public RegCustomer()
	{
		
	}
	public RegCustomer(int no)
	{
		int reg_no=no;
		
		
			
	}
	public void i()
	{
		if(reg_no==r)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Price : ");
			double price=sc.nextDouble();
			this.price=price;
			display();
			giveDiscount();
		}
		else 
		{
			Customer c=new Customer();
			c.z();
		}
	}
	
	
	public void giveDiscount()
	{
		double x=price*(5/100);
		double y=price-x;
		System.out.println("Discount Price : "+y);
		
	}
	public void display()
	{
		System.out.println("Name : "+getName());
		System.out.println("Email : "+getEmail());
		System.out.println("Register No  : "+reg_no);
		System.out.println("Price : "+price);
		System.out.println("Discount Price : "+discount);
		
		
	}
}

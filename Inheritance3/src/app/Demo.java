package app;
import model.*;
import java .util.*;

public class Demo
{
	public static void main(String[] args) 
	{
		int customer=1;
		int regcustomer=2;
		int x=0;
		Scanner sc=new Scanner(System.in);
		
		
		do {
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: RegCustomer r=new RegCustomer(345);
					double res = r.giveDiscount(8000);
					System.out.println("Discount= " + res);
					System.out.println("want repeat press 1:: ");
					x=sc.nextInt();
					break;
			
			case 2: Customer c=new Customer("ABC@gmail.com","ABC");
					double re=c.giveDiscount(3500);
					System.out.println("Discount= "+re);
					System.out.println("want repeat press 1:: ");
					x=sc.nextInt();
					break;
			default : 		
					System.out.println("Invalid Choice");
					System.out.println(" For repeat press 1:: ");
					x=sc.nextInt();
					
			}
			}while(x==1);
			
		System.out.println("Dhanyawad!!!");
		
		
	}		

}

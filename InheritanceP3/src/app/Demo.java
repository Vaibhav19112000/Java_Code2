package app;
import model.*;
import java.util.*;

public class Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Register Number : ");
		int r=sc.nextInt();
		RegCustomer k=new RegCustomer(r);
		k.i();
		
	}
}

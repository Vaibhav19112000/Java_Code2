import java.util.*;
public class Demo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name=sc.next();
		System.out.println("Enter Country Name : ");
		String country=sc.next();
		Register r=new Register(name,country);
		
		try {
			if (r.validateCountry())
			{
				System.out.println("Registration Successfully Done !!!");
			}
			else
			{
				throw new InvalidCountryException();
			}
		}
		catch (InvalidCountryException a)
		{
			System.out.println(a.getMessage());
		}
		
	}

}

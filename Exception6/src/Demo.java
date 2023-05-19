import java.util.*;
public class Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Stack :");
		int size=sc.nextInt();
		MyStack m=new MyStack(size);
		try {
			m.push(33);
			
			System.out.println(m);
		}
		catch (StackOverflowException e)
		{
		   e.getMessage();
		}
		try {
			m.push(22);
			System.out.println(m);
		}
		catch (StackOverflowException e)
		{
		   e.getMessage();
		}
	}
}



public class Ass1
{
	public static void main(String[] args) {
		try {
			System.out.println("Program Start");
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			float res=num1/num2;
			System.out.println("Result : "+res);
		}
		catch(NumberFormatException|ArrayIndexOutOfBoundsException|ArithmeticException obj)
		{
			obj.printStackTrace();
			System.out.println(obj.getMessage());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		String str="Vaibhav";
		System.out.println("String is "+str);
		System.out.println("Program End");
		}

}

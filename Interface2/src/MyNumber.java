
public class MyNumber implements IntOperations

{
	public boolean isOdd(int num)
	{ 	
		if(num%2!=0)
		{
	    return true;
		}
		else
			return false;
	}
	public boolean isEven(int num)
	{
		if(num%2==0)
		{
		    return true;
		}
		else
			return false;
		
	}
	public boolean isPrime(int num)
	{
		boolean flag=true;
		int i;
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
			}
		}
		if(i==num) 
		{
			return flag;
		}
		return flag;
	
		}
}

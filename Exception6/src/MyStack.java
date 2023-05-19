
public class MyStack 
{
	private int top,size,arr[];
	
	public MyStack(int size)
	{
		this.top=-1;
		this.size=size;
		arr=new int [size];
	}

	public void push(int ele) throws StackOverflowException
	{
		if(top>=size)
			throw new StackOverflowException();
		
		top++;
		arr[top]=ele;
		
	}
	public void pop() throws StackUnderflowException
	
	{
		if(top==-1)
			throw new StackUnderflowException();	
		
		top--;
	}
	public String toString()
	{
		String str=" ";
		for(int a=0;a<arr.length;a++)
		{
			str=str+arr[a];
			
		}
			
		return str;
	}
	
	

}

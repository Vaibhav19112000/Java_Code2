import java.util.*;
public class Demo 
{
	public static void main(String[] args) 
	{
		String str="I LOVE MY INDIA";
		LinkedHashMap<Character,Integer> e=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++)
		{
			e.put(str.charAt(i),i);
		
		}
		System.out.println(e);
		
	}

}

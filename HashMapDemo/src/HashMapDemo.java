import java.util.*;
public class HashMapDemo
{ 
	public static void main(String[] args) {
		
		HashMap <Integer,String> h1=new HashMap<>();
		h1.put(12, "Pune");
		h1.put(49, "Nagpur");
		h1.put(15, "Nashik");
		h1.put(24, "Latur");
		h1.put(14, "Pune");
		
		for(Map.Entry<Integer,String> m:h1.entrySet())
		{
			System.out.println("Key: "+m.getKey());
			
			System.out.println("Value: "+m.getValue());
		}
		
		
	}
	
	
	

}

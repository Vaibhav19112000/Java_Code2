import java.util.*;
public class HashsetDemo 
{
	public static void main(String[] args) 
	{ 
		Student S= new Student();
		HashSet<Student> t= new HashSet<>();
		
		t.add(new Student (101,"Abc",96));
		t.add(new Student (102,"Dbc",92));
		t.add(new Student (101,"Abc",96));
		t.add(new Student (103,"ABc",93));
		t.add(new Student (104,"Bbc",94));
		t.add(new Student (105,"Cbc",95));
		t.add(new Student (106,"ACbc",97));
		System.out.println(t);
		
	}


}

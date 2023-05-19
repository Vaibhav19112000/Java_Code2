import java.util.*;
public class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		
		SortedSet<Student> t=new TreeSet<>();
		t.add(new Student(101,"ABC",89));
		t.add(new Student(104,"DEF",90));	
		t.add(new Student(101,"GHI",91));
		t.add(new Student(109,"JKL",92));
		t.add(new Student(105,"MNO",93));
		t.add(new Student(106,"PQR",94));
		t.add(new Student(107,"STU",95));
		for(Student s:t)
		{
		System.out.println(s);
		}
	}

}

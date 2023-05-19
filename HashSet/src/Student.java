
import java.io.*;
public class Student implements Comparable<Student>
{
	private int rollno;
	private String name;
	private double percentage;
	public Student() {
	
	}
	public Student(int rollno, String name, double percentage) {
		
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.rollno-o.rollno;
	}
	
}

package utility;

public class Person
{
	private String name;
	private int age;
	
	public Person()
	{
		name="NA";
		age=22;
	}
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void display()
	{
		System.out.println("Name :: "+name);
		System.out.println("age :: "+age);
	}

}

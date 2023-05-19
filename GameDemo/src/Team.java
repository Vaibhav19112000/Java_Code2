
public class Team 
{
	private int teamno;
	private String name;
	Player arr[];
	
	public Team()
	{
		teamno=1;
		name="India";
		arr=new Player[1];
	}
	public Team(int teamno,String name,Player a[])
	{
		this.teamno=teamno;
		this.name=name;
	    arr=a;
	}
	public Team(int teamno,String name,Player a,Player b)
	{
		this.teamno=teamno;
		this.name=name;
	    arr=new Player[2];
	    arr[0]=a;
	    arr[1]=b;
	}
	public void display()
	{
		System.out.println("  ****************** ");
		System.out.println(teamno+") "+name+" ");
		System.out.println(" ************* ");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i].display();
		}
	}
}

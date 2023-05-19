
public class TeamDemo 
{
	public static void main(String[] args) 
	{
		Player p1 = new Player(101,"M S Dhoni");
		Player p2 = new Player(102,"Ravindra Jadeja");
		Player p3 = new Player(103,"Ambati Rayadu");
		Player p4 = new Player(104,"Ben Stokes");
		Player p5 = new Player(105,"Deepak Chahar");
		Player p[]=new Player[5];
		
		p[0]=p1;
		p[1]=p2;
		p[2]=p3;
		p[3]=p4;
		p[4]=p5;
		
		Team t= new Team(1,"Chennai Super Kings",p);
		t.display();
		
		Player a1=new Player();
		a1=new Player (106,"Virat Kohli");
		Player a2=new Player();
		a2= new Player (107,"Glenn Maxwell");
		
		
		Team t1= new Team(2,"Royal Challengers Banglore",a1,a2);
		t1.display();
	}
	} 

 public class Player 
 {
 
	 private int no;
	 private String gameName;
	 
	 
	 public Player()
	 {
		 no=0;
		 gameName="NA";
	 }
	 public Player(int no, String gameName)
	 {
		 this.no=no;
		 this.gameName=gameName;
		 
	 }
	 public void display()
	 {
		 System.out.println(no+" "+gameName);
		 
	 }
}

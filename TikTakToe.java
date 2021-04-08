
import java.util.Scanner;
public class TikTakToe {
	public static final int computerChoice=1;
	public static final int userChoice=2;
	public static String userVal=null;
	public static String computerVal=null;
	static String[] board = new String[10];
	 static int user_position=0;
	 static int computer_position=0;
	 static void printBoard(String[] board)
	    {
	        System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
	        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
	        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
	    }
	 static int computer() {
		 int computer=(int)Math.floor(Math.random()*10)%9+1;
		 return computer;	
	 }
	 static int user() { 
		 Scanner sc=new Scanner(System.in);
		  System.out.println("enter the position of user");
		  int user=sc.nextInt();
		 return user;
	 }
	 static void freeSpace() {
		 int count = 0;
		for(int i=1;i<10;i++) {
			if(board[i]==null) {
				System.out.println("free spaces ="+i);
				count=i;
				
			}
			
		}
		 if(count==1) {
				System.out.println("game draw..");
				System.exit(0);
			}
	 }
	  static void input(int check) {
			user_position=user();
			System.out.println("user position= "+user_position);
			computer_position=computer();
			computer_position=play();
			computer_position=defend();
			if(computer_position==0) {
				computer_position=computer();
			}
			 
			System.out.println("computer position= "+computer_position);
			if(user_position<10&&computer_position<100) {
			if(user_position != computer_position) {
				
				if(userVal.equals(board[user_position])) {
					System.out.println("user position value is already filled");
					user_position=user();
					printBoard(board);
				}
				if(computerVal.equals(board[computer_position])) {
					System.out.println("computer position value already filled");
					computer_position=computer();
					printBoard(board);
				}else {
					board[user_position]=userVal;
					board[computer_position]=computerVal;
					printBoard(board);
					freeSpace();
					winner();
				}	
			}
			else {
				
				System.out.println("two player cant have same position");
				user_position=0;
				computer_position=0;
			}
			}
			
			
		  }
	  
	  public static void winner() {
		  
	  if(userVal.equals(board[1])&&userVal.equals(board[2])&&userVal.equals(board[3])||computerVal.equals(board[1])&&computerVal.equals(board[2])&&computerVal.equals(board[3])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  else if(userVal.equals(board[4])&&userVal.equals(board[5])&&userVal.equals(board[6])||computerVal.equals(board[4])&&computerVal.equals(board[5])&&computerVal.equals(board[6])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  else  if(userVal.equals(board[7])&&userVal.equals(board[8])&&userVal.equals(board[9])||computerVal.equals(board[7])&&computerVal.equals(board[8])&&computerVal.equals(board[9])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  else  if(userVal.equals(board[1])&&userVal.equals(board[4])&&userVal.equals(board[7])||computerVal.equals(board[1])&&computerVal.equals(board[4])&&computerVal.equals(board[7])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  else  if(userVal.equals(board[2])&&userVal.equals(board[5])&&userVal.equals(board[8])||computerVal.equals(board[2])&&computerVal.equals(board[5])&&computerVal.equals(board[8])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  else  if(userVal.equals(board[3])&&userVal.equals(board[6])&&userVal.equals(board[9])||computerVal.equals(board[3])&&computerVal.equals(board[6])&&computerVal.equals(board[9])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  else if(userVal.equals(board[1])&&userVal.equals(board[5])&&userVal.equals(board[9])||computerVal.equals(board[1])&&computerVal.equals(board[5])&&computerVal.equals(board[9])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  else if(userVal.equals(board[3])&&userVal.equals(board[5])&&userVal.equals(board[7])||computerVal.equals(board[3])&&computerVal.equals(board[5])&&computerVal.equals(board[7])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  }
	  public static int play() {
		  
		  if(computerVal.equals(board[1])&&computerVal.equals(board[2])) {
			  if(board[3]==null) {
			  computer_position=3; 
			  }
		  }
		  if(computerVal.equals(board[1])&&computerVal.equals(board[3])) {
			  if(board[2]==null) {
				  computer_position=2;   
			  }
		  }
		  if(computerVal.equals(board[3])&&computerVal.equals(board[2])) {
			  if(board[1]==null) {
				  computer_position=1;  
			  }
		  }
		if(computerVal.equals(board[4])&&computerVal.equals(board[5])){
			if(board[6]==null) {
				computer_position=6;  
				  }
		  }
		  if(computerVal.equals(board[4])&&computerVal.equals(board[6])){
				if(board[5]==null) {
					computer_position=5;   
					  }
			  }
		  if(computerVal.equals(board[6])&&computerVal.equals(board[5])){
				if(board[4]==null) {
					computer_position=4;   
					  }
			  }
		if(computerVal.equals(board[7])&&computerVal.equals(board[8])){
			if(board[9]==null) {  
				computer_position=9; 
			}
		  }
		  if(computerVal.equals(board[9])&&computerVal.equals(board[8])){
				if(board[7]==null) {  
					computer_position=7; 
				}
			  }
		  if(computerVal.equals(board[7])&&computerVal.equals(board[9])){
				if(board[8]==null) {  
					computer_position=8; 
				}
			  }
		if(computerVal.equals(board[1])&&computerVal.equals(board[4])){
			if(board[7]==null) {  
				computer_position=7; 
				}
		  }
		  if(computerVal.equals(board[7])&&computerVal.equals(board[4])){
				if(board[1]==null) {  
					computer_position=1; 
					}
			  }
		  if(computerVal.equals(board[1])&&computerVal.equals(board[7])){
				if(board[4]==null) {  
					computer_position=4; 
					}
			  }
		if(computerVal.equals(board[2])&&computerVal.equals(board[5])){
			if(board[8]==null) {  
				computer_position=8; 
				}
		  }
			if(computerVal.equals(board[8])&&computerVal.equals(board[5])){
				if(board[2]==null) {  
					computer_position=2; 
					}
			  }
			if(computerVal.equals(board[2])&&computerVal.equals(board[8])){
				if(board[5]==null) {  
					computer_position=5; 
					}
			  }
		if(computerVal.equals(board[3])&&computerVal.equals(board[6])){
			if(board[9]==null) {  
				computer_position=9; 
				}
		  }
			if(computerVal.equals(board[9])&&computerVal.equals(board[6])){
				if(board[3]==null) {  
					computer_position=3; 
					}
			  }
			if(computerVal.equals(board[3])&&computerVal.equals(board[9])){
				if(board[6]==null) {  
					computer_position=6; 
					}
			  }
		if(computerVal.equals(board[1])&&computerVal.equals(board[5])){
			if(board[9]==null) {  
				computer_position=9; 
				}
		  }
			if(computerVal.equals(board[9])&&computerVal.equals(board[5])){
				if(board[1]==null) {  
					computer_position=1; 
					}
			  }
			if(computerVal.equals(board[1])&&computerVal.equals(board[9])){
				if(board[5]==null) {  
					computer_position=5; 
					}
			  }
		if(computerVal.equals(board[3])&&computerVal.equals(board[5])){
			if(board[7]==null) {  
				computer_position=7; 
				}
		  } 
			if(computerVal.equals(board[7])&&computerVal.equals(board[5])){
				if(board[3]==null) {  
					computer_position=3; 
					}
			  } 
			if(computerVal.equals(board[3])&&computerVal.equals(board[7])){
				if(board[5]==null) {  
					computer_position=5; 
					}
			  } 
			return computer_position;
	  }
	  public static int defend() {
		  if(userVal.equals(board[1])&&userVal.equals(board[2])) {
			  if(board[3]==null) {
				  computer_position=3;   
			  }
		  }
		  if(userVal.equals(board[1])&&userVal.equals(board[3])) {
			  if(board[2]==null) {
				  computer_position=2;   
			  }
		  }
		  if(userVal.equals(board[3])&&userVal.equals(board[2])) {
			  if(board[1]==null) {
				  computer_position=1;  
			  }
		  }
		if(userVal.equals(board[4])&&userVal.equals(board[5])){
			if(board[6]==null) {
				computer_position=6;   
				  }
		  }
		  if(userVal.equals(board[4])&&userVal.equals(board[6])){
				if(board[5]==null) {
					computer_position=5;  
					  }
			  }
		  if(userVal.equals(board[6])&&userVal.equals(board[5])){
				if(board[4]==null) {
					computer_position=4;   
					  }
			  }
		if(userVal.equals(board[7])&&userVal.equals(board[8])){
			if(board[9]==null) {  
				computer_position=9; 
			}
		  }
		  if(userVal.equals(board[9])&&userVal.equals(board[8])){
				if(board[7]==null) {  
					computer_position=7; 
				}
			  }
		  if(userVal.equals(board[7])&&userVal.equals(board[9])){
				if(board[8]==null) {  
					computer_position=8; 
				}
			  }
		if(userVal.equals(board[1])&&userVal.equals(board[4])){
			if(board[7]==null) {  
				computer_position=7; 
				}
		  }
		  if(userVal.equals(board[7])&&userVal.equals(board[4])){
				if(board[1]==null) {  
					computer_position=1; 
					}
			  }
		  if(userVal.equals(board[1])&&userVal.equals(board[7])){
				if(board[4]==null) {  
					computer_position=4; 
					}
			  }
		if(userVal.equals(board[2])&&userVal.equals(board[5])){
			if(board[8]==null) {  
				computer_position=8; 
				}
		  }
			if(userVal.equals(board[8])&&userVal.equals(board[5])){
				if(board[2]==null) {  
					computer_position=2; 
					}
			  }
			if(userVal.equals(board[2])&&userVal.equals(board[8])){
				if(board[5]==null) {  
					computer_position=5; 
					}
			  }
		if(userVal.equals(board[3])&&userVal.equals(board[6])){
			if(board[9]==null) {  
				computer_position=9; 
				}
		  }
			if(userVal.equals(board[9])&&userVal.equals(board[6])){
				if(board[3]==null) {  
					computer_position=3; 
					}
			  }
			if(userVal.equals(board[3])&&userVal.equals(board[9])){
				if(board[6]==null) {  
					computer_position=6; 
					}
			  }
		if(userVal.equals(board[1])&&userVal.equals(board[5])){
			if(board[9]==null) {  
				computer_position=9; 
				}
		  }
			if(userVal.equals(board[9])&&userVal.equals(board[5])){
				if(board[1]==null) {  
					computer_position=1; 
					}
			  }
			if(userVal.equals(board[1])&&userVal.equals(board[9])){
				if(board[5]==null) {  
					computer_position=5; 
					}
			  }
		if(userVal.equals(board[3])&&userVal.equals(board[5])){
			if(board[7]==null) {  
				computer_position=7; 
				}
		  } 
			if(userVal.equals(board[7])&&userVal.equals(board[5])){
				if(board[3]==null) {  
					computer_position=3; 
					}
			  } 
			if(userVal.equals(board[3])&&userVal.equals(board[7])){
				if(board[5]==null) {  
					computer_position=5; 
					}
			  } 
			return computer_position;
	  }
	  
	  
	  
	  public static void main(String[]args) {
		  int check =(int)Math.floor(Math.random()*10)%2+1;
		  if(check==userChoice) {
			 userVal="x";
			 computerVal="o";
			  System.out.println("user option = "+userVal);
			  System.out.println("computer option = "+computerVal);
		  }else {
			  userVal="o";
			  computerVal="x";
			  System.out.println("user option = "+userVal);
			  System.out.println("computer option = "+computerVal);

		  }
		  for(int i=0;;i++) {
		  input(check);
		  }
	  }
}


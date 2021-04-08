

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
		for(int i=1;i<10;i++) {
			if(board[i]==null) {
				System.out.println("free spaces ="+i);
				
			}
			
		}
			
		}
	 
	  static void input() {
			user_position=user();
			System.out.println("user"+userVal+" has position= "+user_position);
			
			if(user_position<10&&computer_position<10) {
			if(user_position != computer_position) {
				
				if(userVal.equals(board[user_position])) {
					System.out.println("user position value is already filled");
					user_position=user();
					if(board[user_position]!=null) {
						user_position=user();
					}
					printBoard(board);
				}else {
					board[user_position]=userVal;
					printBoard(board);
					freeSpace();
				}
				
				computer_position=computer();
				if(computer_position==0) {
					computer_position=computer();
				}
				 
				System.out.println("computer "+computerVal+" has position= "+computer_position);
				if(computerVal.equals(board[computer_position])) {
					System.out.println("computer position value already filled");
					computer_position=computer();
					if(board[computer_position]!=null) {
						computer_position=computer();
					}
					printBoard(board);
				}else {
					
					board[computer_position]=computerVal;
					printBoard(board);
					freeSpace();
				}	
			}
			else {
				
				System.out.println("two player cant have same position");
				user_position=0;
				computer_position=0;
			}
			}
			
			
		  }
	  
	 
	  public static void main(String[]args) {
		  
			 userVal="x";
			 computerVal="o";
		
		  
		  for(int i=0;;i++) {
			  input();
			  }
		
	  }
}


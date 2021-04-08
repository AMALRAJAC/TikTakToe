

import java.util.Scanner;
public class TikTakToe {
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
	 
	  static void input() {
		  for(int i=1;user_position<10&&computer_position<10;i++) {
			  
			  Scanner sc= new Scanner(System.in);
			  System.out.println("computer input");
			  computer_position=sc.nextInt();
			  System.out.println("user input");
			  user_position=sc.nextInt();
			  board[user_position]=userVal;
			  board[computer_position]=computerVal;
			  printBoard(board);
		  }
		  
	  }
	  public static void main(String[]args) {
		  
			 userVal="x";
			 computerVal="o";
		
			 printBoard(board);
		  for(int i=0;;i++) {
			  input();
			  }
		
	  }
}


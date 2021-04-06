
import java.util.Scanner;
public class TikTakToe {
	 static void printBoard(char[] board)
	    {
	        System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
	        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
	        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
	    }
	  public static void main(String[]args) {
		  char[] board = new char[10];
		 
		  printBoard(board);
		  input();
	  }
	  static void input() {
		  Scanner sc=new Scanner(System.in);
		  
		  for(int i=0;i<10;i++) {
			  System.out.println("user input ");
			  String user=sc.nextLine();
			  System.out.println("computer input ="+user);
			  if("x".equals(user)) {
				  System.out.println("computer input = o");
			  }
			  else {
				  System.out.println("computer input = x");
			  }
		 
		  }
	  }
}


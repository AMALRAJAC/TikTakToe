
public class TikTakToe {
	 static void printBoard(char[] board)
	    {
	        System.out.println("| " + board[0] + " | "
	                           + board[1] + " | " + board[2]
	                           + " |");
	        System.out.println("| " + board[3] + " | "
	                           + board[4] + " | " + board[5]
	                           + " |");
	        System.out.println("| " + board[6] + " | "
	                           + board[7] + " | " + board[8]
	                           + " |");
	    }
	  public static void main(String[]args) {
		  char[] board = new char[10];
		  printBoard(board);
	  }

}


import java.util.Scanner;
public class TikTakToe {
	static String[] board = new String[10];
	 static int position=0;
	 static int positionc=0;
	 static void printBoard(String[] board)
	    {
	        System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
	        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
	        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
	    }
	  static void input(int check) {
		  Scanner sc=new Scanner(System.in);
		  
		  
		  
		  
		  System.out.println("enter the position of user");
		  position=sc.nextInt();
		  System.out.println("enter the position of computer");
		  positionc=sc.nextInt();
		  showBoard();
		  if(position!=positionc) {
			  
				  if((("o".equals(board[position]))||("x".equals(board[position])))) {
					  System.out.println("given position already filled ....!! play again");
					  System.out.println("enter the position of user");
					  position=sc.nextInt();
					  
				  }
			 
				  else if(("o".equals(board[positionc]))||("x".equals(board[positionc]))){
					  System.out.println("given position already filled ....!! play again");
					  System.out.println("enter the position of computer");
					  positionc=sc.nextInt();
					  
				  }
			  if(check==1) {
			  board[position]="x";
			  board[positionc]="o";
			  printBoard(board);
			  showBoard();
			  }
			  else {
				  board[position]="o";
				  board[positionc]="x";
				  printBoard(board);
				  showBoard();
			  }
			  for(int j=1;j<10;j++) {
				  if(board[j]==null) {
					  System.out.println("avalilabale positions are= "+j);
					  
				  }
			  } 
		  
		  
		  }
		  else {
			  System.out.println("players cant choose same position");
		  }
		  showBoard();
		  
		  }
	  
	  public static void showBoard() {
		  
	  if("x".equals(board[1])&&"x".equals(board[2])&&"x".equals(board[3])||"o".equals(board[1])&&"o".equals(board[2])&&"o".equals(board[3])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  if("x".equals(board[4])&&"x".equals(board[5])&&"x".equals(board[6])||"o".equals(board[4])&&"o".equals(board[5])&&"o".equals(board[6])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  if("x".equals(board[7])&&"x".equals(board[8])&&"x".equals(board[9])||"o".equals(board[7])&&"o".equals(board[8])&&"o".equals(board[9])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  if("x".equals(board[1])&&"x".equals(board[4])&&"x".equals(board[7])||"o".equals(board[1])&&"o".equals(board[4])&&"o".equals(board[7])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  if("x".equals(board[2])&&"x".equals(board[5])&&"x".equals(board[8])||"o".equals(board[2])&&"o".equals(board[5])&&"o".equals(board[8])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  if("x".equals(board[3])&&"x".equals(board[6])&&"x".equals(board[9])||"o".equals(board[3])&&"o".equals(board[6])&&"o".equals(board[9])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  if("x".equals(board[1])&&"x".equals(board[5])&&"x".equals(board[9])||"o".equals(board[1])&&"o".equals(board[5])&&"o".equals(board[9])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  if("x".equals(board[3])&&"x".equals(board[5])&&"x".equals(board[7])||"o".equals(board[3])&&"o".equals(board[5])&&"o".equals(board[7])){
		  System.out.println("player won");
		  System.exit(0);
	  }
	  }
	  public static void main(String[]args) {
		  int check =(int)Math.floor(Math.random()*10)%2;
		  if(check==1) {
			  String user="x";
			  System.out.println("user option = x");
			  System.out.println("computer option = o");
		  }else {
			  String user="o";
			  System.out.println("user option = o");
			  System.out.println("computer option = x");

		  }
		  for(int i=0;i<10;i++) {
		  input(check);
		  }
	  }
}


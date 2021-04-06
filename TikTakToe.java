
public class TikTakToe {
	public static int count=0;
	public static char[] a;
			public static int Board(int row ) {
					for(int i=1; i<=row; i++)   
					{   
						count=count+3;
						for(int j=1; j<=row; j++)   
						{   
							System.out.print(" "); 
							
							}   
						System.out.println("\n");
					}
				return 0;
	}
public static void main(String []args) {
	int row=3;
	Board(row);
}

}

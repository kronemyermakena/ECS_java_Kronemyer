import java.util.Scanner;

	public class CountingMachine2
{
		public static void main(String[] args)
	{
			int yourNumber;
			Scanner keyboard = new Scanner(System.in);
			System.out.println( " What number ? ");
			yourNumber = keyboard.nextInt();
			System.out.print(" here's the list: " );
			
		String message = keyboard.nextLine();
		
		for ( int n = 0; n <= yourNumber ; n = n+1 )
		{
			System.out.println( n + ". " + message);
		}
	
	}
	
}
				
			
 
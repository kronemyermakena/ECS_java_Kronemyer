
import java.util.Random;
import java.util.Scanner;
 
public class HiLow
{
	public static void main ( String[] args )
	{
		Random r = new Random( );
		int choice = 1 + r.nextInt(100), answer;
		Scanner keyboard = new Scanner(System.in);
		String response = "";
		
		
		System.out.println(" I'm thinking of a number between 1-100. Try to guess it! ");
		answer = keyboard.nextInt();
		
			if ( answer > choice )
			
			System.out.println( response + "  too high." );
			
			else if ( answer < choice )
		
				System.out.println( response + " too low." );
			
			else 
				System.out.println( response + " that's it! What are the odds?!" );
		

	}
}
		
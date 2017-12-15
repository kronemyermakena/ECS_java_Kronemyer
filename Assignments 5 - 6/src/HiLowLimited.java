import java.util.Random;
import java.util.Scanner;

public class HiLowLimited
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random( );
		int myNumber = 1 + r.nextInt(100);
		int tries = 0;

		System.out.println(" I'm thinking of a number between 1 and 100 !");
		System.out.print(" What number am I thinking of? ");
		int entry = keyboard.nextInt();
		tries++;

		while ( entry != myNumber && tries < 3 )
		{
			System.out.println(" Wrong number ");
			System.out.print(" Try again! ");
			entry = keyboard.nextInt();
			tries++;
		}

		if ( entry == myNumber )
			System.out.println(" You got it? What are the odds? ");
		else if ( tries >= 3 )
			System.out.println(" You didn't guess it. Try again another time. ");
	}
}

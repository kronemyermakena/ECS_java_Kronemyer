
import java.util.Random;

public class Dice
{
	public static void main ( String[] args )
	{
		Random r = new Random( );
		int roll1 = 1 + r.nextInt(6), roll2 = 1 + r.nextInt(6), total;
		total = roll1 + roll2;
		
		
		System.out.println(" Here comes the dice ! ");
		System.out.println(" the first roll is " + roll1 );
		System.out.println(" The second roll is " + roll2 );
		System.out.println( " Roll 1 + Roll 2 is " + (roll1 + roll2) );
		System.out.println(" So, the total is " + total + "!" );
		

	}
}
		
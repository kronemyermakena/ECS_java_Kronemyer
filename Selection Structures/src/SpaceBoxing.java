
import java.util.Scanner;

	public class SpaceBoxing
{
		public static void main(String[] args)
	{
			Scanner keyboard = new Scanner(System.in);
			
			String planet;
			double p1, p2, p3, p4, p5, p6, weight;
			p1 = 0.78;
			p2 = 0.39;
			p3 = 2.65;
			p4 = 1.17;
			p5 = 1.05;
			p6 = 1.23;
			
			
				System.out.println(" Please enter your current weight " );
				weight = keyboard.nextInt();
				
				System.out.println(" I have information for the following planets: p1. Venus p2. Mars p3. Jupiter p4. Saturn p5. Uranus p6. Neptune " );
				
				System.out.println(" What planet will you be visiting? ");
				planet = keyboard.next();
				
				if(planet.equals("p1"))
				{
					System.out.println( " On planet Venus your weight would be " + ( 0.78 * weight) );
				}
				
				if(planet.equals("p2"))
				{
					System.out.println(" On planet Mars your weight would be " + (0.39 * weight));
				}
				
				if(planet.equals("p3"))
				{
					System.out.println(" On planet Jupiter your weight would be " + (2.65 * weight));
				}
				
				if(planet.equals("p4"))
				{
					System.out.println("On planet Saturn your weight would be " + ( 1.17 * weight));
				}
				
				if(planet.equals("p5"))
				{
					System.out.println("On planet Uranus your weight would be " + ( 1.05 * weight));
				}
				
				if(planet.equals("p6"))
				{
					System.out.println(" On planet Neptune your weight would be " + ( 1.23 * weight));
					
				}
				
				
				}
}
	
 
				
			
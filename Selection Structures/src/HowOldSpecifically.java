
import java.util.Scanner;

	public class HowOldSpecifically
{
		public static void main(String[] args)
	{
			Scanner keyboard = new Scanner(System.in);
			
			String name; 
			int age;
				
				System.out.println("Name: ");
				name = keyboard.next();
				System.out.println("Age: ");
				age = keyboard.nextInt();
			
			
				
					if ( age < 16 )
					{
						System.out.println(" Okay " + name + " You can't drive. ");
						age = keyboard.nextInt(); 
						
					}

					if ( age>=16&&age<17 )
					{
						System.out.println( name + ", You can drive but not vote. ");
						age = keyboard.nextInt(); 
						
					}
	
					if ( age>=18&&age<24 )
					{
						System.out.println( "Alright, " + name + ", You can vote but not rent a car. ");
						age = keyboard.nextInt(); 
						
					}
	
					if ( age > 25 )
					{
						System.out.println(" Well, " + name + ", You can pretty much do whatever you want. ");
						age = keyboard.nextInt(); 
						
					}
					
	
	
	}

}
	
 
				
			

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
						System.out.println(" You can't drive. ");
						age = keyboard.nextInt(); 
						keyboard.close();
					}

					if ( age>=16&&age<17 )
					{
						System.out.println(" You can drive but not vote ");
						age = keyboard.nextInt(); 
						keyboard.close();
					}
	
					if ( age>=18&&age<24 )
					{
						System.out.println(" You can vote but not rent a car. ");
						age = keyboard.nextInt(); 
						keyboard.close();
					}
	
					if ( age > 25 )
					{
						System.out.println(" You can do whatever you want ");
						age = keyboard.nextInt(); 
						keyboard.close();
					}
					
	
	
	}

}
	
 
				
			
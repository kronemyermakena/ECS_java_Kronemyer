
import java.util.Scanner;

	public class UserInputofData
{
		public static void main(String[] args)
	{
			Scanner keyboard = new Scanner(System.in);
			
				String Fname, Lname, login; 
				int age, GPA, ID, grade;
					
					System.out.println("First Name:");System.out.println("Last Name:");System.out.println("Grade (9-12): ");System.out.println("Student ID: ");System.out.println("Login: ");System.out.println("GPA (0.0 - 4.0): ");
					Fname = keyboard.next();Lname = keyboard.next();grade = keyboard.nextInt();ID = keyboard.nextInt();login = keyboard.next();GPA = keyboard.nextInt();
					
					
			
						System.out.println(" Your Informatiom: ");
						System.out.println(" Login: " + login );
						System.out.println(" ID: " + ID );
						System.out.println(" Name: " + Fname+ "," + Lname);
						System.out.println(" GPA: " + GPA );
						System.out.println(" Grade " + grade );
						
						
						
						
						
						
						
						
						
						
						
						keyboard.close();
					
					
			
	}

}
	
 
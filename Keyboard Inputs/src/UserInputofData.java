
import java.util.Scanner;

	public class UserInputofData
{
		public static void main(String[] args)
	{
			Scanner keyboard = new Scanner(System.in);
			
				String Fname, Lname, login; 
				int age, GPA, ID, grade;
					
					System.out.println("First Name: ");
					Fname = keyboard.next();
					System.out.println("Last Name: ");
					Lname = keyboard.next();
					System.out.println("Grade (9-12): ");
					grade = keyboard.nextInt();
					System.out.println("Student ID: ");
					ID = keyboard.nextInt();
					System.out.println("Login: ");
					login = keyboard.next();
					System.out.println("Age: ");
					age = keyboard.nextInt();
					
					keyboard.close();
						
						System.out.println(" Your Informatiom: " );
						System.out.println(" Login: " + login );
						System.out.println(" ID: " + ID );
						System.out.println(" Name: " + Fname+ "," + Lname );
						System.out.println(" Grade " + grade );
						System.out.println(" Age: " + age );
						
	}

}
	
 
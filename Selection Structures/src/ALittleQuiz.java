import java.util.Scanner;

public class ALittleQuiz
{
		public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
			
			
			double A6, A7, A8;
			String A1, A2, A3, A4, A5, answer;
			A1 = "Melbourne";
			A2 = "Anchorage";
			A3 = "Juneau ";
			A4 = "Yes";
			A5 = "No";
			A6 = 5;
			A7 = 11;
			A8= 15;
			
				System.out.println(" Q1 : What is the capital of Alaska? " );
				System.out.println(" Answer choice A: " + A1 + ", Answer choice B: " + A2 + ", Answer choice C: " + A3 );
				System.out.println(" What is the answer? " );
				answer = keyboard.next();
				
				
				if (answer.equals("A1"))
				{
					System.out.println(" Sorry, but " + A1 +  " is not the correct answer. ");
				}
					
				
				if ( answer.equals("A2"));
				{
					System.out.println(" Sorry, but " + A2 + " is not the correct answer. ");
				}
	
				
				if ( answer.equals("A3"));
				{ 
					System.out.println( A3 + " is the capital of Alaska. " );
				}
	
	
					System.out.println(" Q2 : Can you store the value of cat in a variable of type int? " );
					System.out.println(" Answer choice D: " + A4 + " , Answer choice E: " + A5 );
					System.out.println(" What is the answer? ");
					answer = keyboard.next();
					
					
					if(answer.equals("A4"));
					{
						System.out.println(" Sorry, but that's not the correct answer. ");
					}
	
					if(answer.equals("A5"));
					{
						System.out.println(" Cat is a string, and ints can only store numbers. ");
					}
	
					
						System.out.println(" Q3 : What is the result of 9+6/3? ");
						System.out.println(" Answer choice F: " + A6 + ", Answer choice G: " + A7 + " Answer choice H: " + A8 );
						System.out.println(" What is the answer? ");
						answer = keyboard.next();
						
						if(answer.equals("A6"));
						{
							System.out.println(" 5 isn't the corrct answer. ");
						}
						
						if(answer.equals("A7"));
						{
							System.out.println(" The correct answer is 11 ");
						}
						
						if(answer.equals("A8"));
						{
							System.out.println(" Use PEMDAS to help you solve equations. ");
						}
	
	
	
	}

		
}
	
 
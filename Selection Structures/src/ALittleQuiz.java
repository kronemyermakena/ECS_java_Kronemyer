import java.util.Scanner;

public class ALittleQuiz
{
		public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
			
			String A, B, C, D, E, F, G, H, answer;
			A = "Melbourne";
			B = "Anchorage";
			C = "Juneau ";
			D = "Yes";
			E = "No";
			F = "5";
			G = "11";
			H = "15/3";
			
				System.out.println(" Q1 : What is the capital of Alaska? " );
				System.out.println(" Answer choice A: " + A + ", Answer choice B: " + B + ", Answer choice C: " + C );
				System.out.println(" What is the answer? ");
				answer = keyboard.next();
				
				
				if(answer.equals("A"));
				{
					System.out.println(" Sorry, but " + A +  " is not the correct answer. The capital of Alaska is Juneau. ");
				}
					
				
				if(answer.equals("B"));
				{
					System.out.println(" Sorry, but " + B + " is not the correct answer. The capital of Alaska is Juneau. ");
				}
	
				
				if(answer.equals("C"));
				{
					System.out.println(" Yes, " + C + " is the capital of Alaska. " );
				}
	
	
	
	
	
	
	}

		
}
	
 
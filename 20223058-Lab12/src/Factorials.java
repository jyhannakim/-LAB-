// ****************************************************************
// Factorials.java
//
// Reads integers from the user and prints the factorial of each.
//          
// ****************************************************************

import java.util.Scanner;

public class Factorials  {

	public static void main(String[] args) throws IllegalArgumentException {
		char keepGoing = 'y';
		
		Scanner in = new Scanner(System.in);
		
		IllegalArgumentException problem =
		         new IllegalArgumentException("Input value is out of range.");
		
		while (keepGoing == 'y' || keepGoing == 'Y'){
			try {
				System.out.print("Enter an integer: ");
			
				int val = in.nextInt();
			
				if (val < 0 || val >= 17)
					throw problem;
			
				System.out.println("Factorial(" + val + ") = " 
						   + MathUtils.factorial(val));
				
				System.out.print("Another factorial? (y/n) ");
				
				keepGoing = in.next().charAt(0);
				
			} catch (IllegalArgumentException e) {
				System.out.println("Input value is out of range.");
			} 	
				
		}
    }
}

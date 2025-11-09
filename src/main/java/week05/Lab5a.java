/*Program: Lab5a
 * Name: Oliver Rivera
 * Date: October 9, 2023
 * Instructor: Sister Kristi Hays
 * Description: Number Divisible by X
 */

package week05;
import java.util.Scanner;

public class Lab5a {

	public static void main(String[] args) {

		// Use Scanner for getting integer and string input from user
		Scanner nIn = new Scanner(System.in);//Scanner for Numbers
		Scanner sIn = new Scanner(System.in);//Scanner for Strings for Y n N

		//Variables
		boolean valid = false;
		boolean playAgain = false;

		//PRIMARY Do-While Loop
		do {
			//Introduce program to user
			System.out.println("This program will take three numbers and display each one of them \n");

			//Range of int numbers
			int startNumber = 0;
			int endNumber = 0;
			int testNumber = 0;

			String input = "";

			//STARTING NUMBER, NUMERIC INPUT VALIDATION Do-While Loop
			do {
				System.out.println("Please enter the starting number: \n");

				//if block to check for validation
				if(nIn.hasNextInt()) {
					startNumber = nIn.nextInt();
					valid = true;
				}

				else {
					System.out.println("Error! Please enter a whole number: \n");
					valid = false;
					nIn.next();
				}//End of If and Else Statement

			}while(!valid);//END of NUMERIC INPUT VALIDATION Do-While Loop Starting Line: 37


			valid = false;//Resets validation for next number


			//ENDING NUMBER, NUMERIC INPUT VALIDATION Do-While Loop 
			do {
				System.out.println("Please enter your ending number: \n");
				//if block to check for validation
				if(nIn.hasNextInt()) {
					endNumber = nIn.nextInt();
					valid = true;
				}

				else {
					System.out.println("Error! Please enter a whole number: \n");
					valid = false;
					nIn.next();
				}//End of If and Else Statement

			}while(!valid);//END of ENDING NUMBER, NUMERIC INPUT VALIDATION Do-While Loop Starting Line: 58


			valid = false;//Resets validation for next number


			//TESTING NUMBER, NUMERIC INPUT VALIDATION Do-While Loop 
			do {
				System.out.println("Please enter your test number: \n");
				//if block to check for validation
				if(nIn.hasNextInt()) {
					testNumber = nIn.nextInt();
					valid = true;
				}

				else {
					System.out.println("Error! Please enter a whole number: \n");
					valid = false;
					nIn.next();
				}//End of If and Else Statement

			}while(!valid);//END of TESTING NUMBER, NUMERIC INPUT VALIDATION Do-While Loop Starting on Line 79

			System.out.println("Here are the numbers between " + startNumber + " and " 
					+ endNumber + " that are divisible by " + testNumber + ": \n" );

			//FOR LOOP to run each number to make sure they are divisible
			for(int i = startNumber; i <= endNumber; i++) {

				//If statement to decide to print number that are divisible
				if((i % testNumber) == 0) 
					System.out.println(i);

			}//End of FOR LOOP and If Statement Started in Line: 100

			//NON-NUMERIC INPUT VALIDATION Do-while Loop for Play Again feature.
			do {
				valid = false;
				System.out.println(" Would You like to play again? ");
				input = sIn.next();

				//If statement to check for validation
				if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
					valid = true;
				}
				else {
					System.out.println("Error! Please say Y for yes or N for No. ");
					valid = false;
				}//End of  If and Else statement

			}while(!valid);// END of NON-NUMERIC INPUT VALIDATION Do-While Loop Starting Line: 106

			//If block to decide to start the game Again
			if(input.equalsIgnoreCase("Y")) {
				playAgain = true;
				System.out.println("Okay! Have fun. ");
			}

			else if(input.equalsIgnoreCase("N")) {
				playAgain = false;
			}//End of If and Else statement starting at Line: 126

		}while(playAgain);//END of PRIMARY Do-While Loop Starting at line: 25	

		nIn.close();//close the integer scanner
		sIn.close();//close the string scanner
	}//End of Main Method

}//End of Lab5a
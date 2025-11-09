/*Program: Lab6b
 * Name: Oliver Rivera
 * Date: October 18, 2023
 * Instructor: Sister Kristi Hays
 * Description: Numbers to the exponent
 */

package week06;
import java.util.Scanner;

public class Lab6b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nIn = new Scanner(System.in);//Scanner for Numbers
		Scanner sIn = new Scanner(System.in);//Scanner for string Y or N feature

		//Declare Variables
		int base = 0;
		int exp = 0;
		int temp = 0;
		String input = "";
		boolean valid = false;
		boolean playAgain = false;

		//PRIMARY Do-While Loop
		do {
			System.out.println("This program will calculate the exponent to the base");

			//BASE NUMERIC INPUT VALIDATION Do-While Loop 
			do {
				System.out.println(" \n Please enter the base number: ");
				if(nIn.hasNextInt()) {
					base = nIn.nextInt();
					temp = 1;
					valid = true;
				}

				else {
					System.out.println("Error! Please enter a whole number. ");
					valid = false;
					nIn.nextLine();
				}//End of If and else statement
			}while(!valid);//END of BASE NUMERIC INPUT VALIDATION Do-While Loop Starting Line: 32

			valid = false;//Resets validation for next number

			//EXPONENT NUMERIC INPUT VALIDATION Do-While Loop 
			do {
				System.out.println(" \n Please enter the exponent number: ");
				if(nIn.hasNextInt()) {
					exp = nIn.nextInt();
					valid = true;
				}

				else {
					System.out.println("Error! Please enter a whole number. ");
					valid = false;
					nIn.next();
				}//End of If and else statement
			}while(!valid);//END of BASE NUMERIC INPUT VALIDATION Do-While Loop Starting Line: 32


			//FOR Loop CALCULATIONS
			for(int i = 1; i <= exp; i++) {
				temp *= base;
			}

			//Print results
			System.out.println("Results of " + base + " to the power of " + exp + " is " + temp);

			//PLAY AGAIN NON-NUMERIC INPUT VALIDATION
			do {
				System.out.println("Do you wish to play again? ");
				valid = false;
				input = sIn.next();

				//If and else to check for validation 
				if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
					valid = true;
				}

				else {
					System.out.println("Error! Please enter Y for yes and N for no. ");
					valid = false;				
				}//End of if and else statement
			}while(!valid);


			//BEGINING of If block to decide to start over again
			if(input.equalsIgnoreCase("Y")) {
				playAgain = true;
				System.out.println("Okay! Have fun. \n");
			}

			else if(input.equalsIgnoreCase("N")) {
				playAgain = false;
				System.out.println("Thank you. Have a nice day. ");
			}//END of if and else statement Starting Line: 66


		}while(playAgain);//END of PRIMARY Do-While Loop Starting line: 27

		nIn.close();//Closes number scanner
		sIn.close();//Closes String Scanner

	}//End of Main method

}//End of lab6b

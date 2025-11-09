/*Program: Lab5i
 * Name: Oliver Rivera
 * Date: October 12, 2023
 * Instructor: Sister Kristi Hays
 * Description: Number multiplier
 */

package week05;

import java.util.Scanner;

public class Lab5i {

	public static void main(String[] args) {

		Scanner nIn = new Scanner(System.in);//Scanner for Numbers
		Scanner sIn = new Scanner(System.in);//Scanner for string Y or N feature

		//variables
		boolean valid = false;//For Do-While Loops
		boolean goAgain = false;//For the Play Again feature
		String input = "";//For Y or N answer

		//PRIMARY Do-While Loop
		do {
			System.out.println("This program will ask you for three numbers: \n" + "  *A starting number \n" + "  *An ending number \n"
					+ "  *A multiplier \n" + "The program will multiply each number between the starting number and ending number by the multiplier.");

			//define the range of numbers
			int startingNumber = 0;
			int endingNumber = 0;
			int multiplier = 0;
			int result = 0;

			//STARTING NUMBER NUMERIC INPUT VALIDATION Do-While Loop
			do {
				System.out.println(" \n Please enter the starting number: ");
				if(nIn.hasNextInt()) {
					startingNumber = nIn.nextInt();
					valid = true;
				}

				else {
					System.out.println("Invalid response: Please enter a whole number. ");
					valid = false;
					nIn.nextLine();
				}//End of If and else statement

			}while(!valid);//End of STARTING NUMBER NUMERIC INPUT VALIDATION Do-While Loop Starting Line: 39

			valid = false;

			//ENDING NUMBER NUMERIC INPUT VALIDATION Do-While Loop
			do {
				System.out.println("Please enter the ending number: ");
				if(nIn.hasNextInt()) {
					endingNumber = nIn.nextInt();
					valid = true;
				}

				else {
					System.out.println("Invalid response: Please enter a whole number. ");
					valid = false;
					nIn.nextLine();
				}//End of If and else statement

			}while(!valid);//END of ENDING NUMBER NUMERIC INPUT VALIDATION Do-While Loop STarting Line: 57

			valid = false;

			//MULTIPLIER NUMERIC INPUT VALIDATION Do-While Loop
			do {
				System.out.println("Please enter the multiplier: ");
				if(nIn.hasNextInt()) {
					multiplier = nIn.nextInt();
					valid = true;
				}

				else {
					System.out.println("Error ! Please enter a number: ");
					valid = false;
					nIn.nextLine();
				}//End of If and else statement

			}while(!valid);//END of MULTIPLIER NUMERIC INPUT VALIDATION Do-While Loop Starting Line: 75

			//FOR Loop to run each number between month 1 and desired amount given
			for(int i = startingNumber; i <= endingNumber; i++) {

				//calculations
				result = i * multiplier;

				//Display information
				System.out.println("Multipling " + i + " by " + multiplier + " results in: " + result);
			}//End of FOR Loop Starting Line: 91


			//NON-NUMERIC INPUT VALIDATION Do-While Loop for goAgain feature
			do {
				valid = false;
				System.out.println("\n Would you like to play again? ");
				input = sIn.next();

				//If and else statement for validation
				if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
					valid = true;
				}

				else {
					System.out.println("Error! Please enter Y for yes and N for no. ");
					valid = false;				
				}//End of if and else statement
			}while(!valid);//END of NON-NUMERIC INPUT VALIDATION Do-While Loop for goAgain feature Starting Line: 102


			//BEGINING of If block to decide to start over again
			if(input.equalsIgnoreCase("Y")) {
				goAgain = true;
				System.out.println("Okay! Have fun. \n");
			}

			else if(input.equalsIgnoreCase("N")) {
				goAgain = false;
				System.out.println("Thank you. Have a nice day. ");
			}//END of if and else statement Starting Line: 120


		}while(goAgain);//END of PRIMARY Loop Starting Line: 28

		nIn.close();//Closes number scanner
		sIn.close();//Closes the string scanner		

	}//END of Main Method

}//END of Lab5i
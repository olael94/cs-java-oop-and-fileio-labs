/*Program: Lab4c
 * Name: Oliver Rivera
 * Date: October 4, 2023
 * Instructor: Sister Kristi Hays
 * Description: Guessing Game Input Validation
 */

package week04;
import java.util.Scanner;
import java.lang.Math;

public class Lab4c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Use Scanner for getting integer and string input from user
		Scanner integerIn = new Scanner(System.in);
		Scanner stringIn = new Scanner(System.in);

		//Declare Variables
		int userGuess = 0;
		String answerString = "";
		boolean gameONorOFF = true;
		boolean numericValid = true;
		boolean nonnumericValid = true;
		boolean repeatProgram = true;


		//Define the Random Number Range
		int max = 100;
		int min = 1;
		int range = max - min + 1;


		//**BEGINNING of PRIMARY Do while Loop
		do {
			//Introduce program to user
			System.out.println("This program is a Guessing Game. \n" + 
					"The computer will generate a random number between 1 and 100. The user will try to guess the number. \n" +
					"Let's get started! \n" + "\n" + "I'm thinking of a number between 1 and 100. ");

			//Generate Random Number
			int randomNumber = (int)(Math.random() * range) + min;
			//Initialize guessCount
			int guessCount = 0;

			//**BEGINING GAME Do while Loop
			do {

				//**BEGINNING of NUMERIC INPUT VALIDATION Do-While Loop
				do {
					//Get Guess from user
					System.out.println("What is your Guess? ");
					if(integerIn.hasNextInt()) {
						userGuess = integerIn.nextInt();
						numericValid = true;
					}

					//If no integer was input this will prompt the user to do it. 
					else {
						numericValid = false;
						System.out.println("Error! Please enter a whole number: ");
						stringIn.nextLine();
					}

				} while(!numericValid);//END OF NUMERIC INPUT VALIDATION Do-While Loop.


				guessCount++;// This will increase the guess count every time the number is not guessed.

				//If user guess is greater than the random number GAME do while loop will be repeated.
				if (userGuess > randomNumber) {
					gameONorOFF = false;
					System.out.println("Your Guess is too high. Try again. \n");
				}

				//If user guess is lower than the random number GAME do while loop will be repeated.
				else if (userGuess < randomNumber) {
					gameONorOFF = false;
					System.out.println("Your Guess is too low. Try again. \n");
				}

				//If user guess is equal to the random number GAME do while loop will be finished.
				else if (userGuess == randomNumber){
					gameONorOFF = true;
					System.out.println("CORRECT! you guessed it in " + guessCount + " tries! \n");
				}


			}while(!gameONorOFF);//END OF GAME Do/while Loop


			//**BEGINNING of NON-NUMERIC INPUT VALIDATION Do-while Loop
			do {
				//Ask user if he or she would like to play again
				System.out.println("Would you like to play Again: ");
				answerString = stringIn.nextLine();

				//input validation to see if user inputs either "yes" or "no" regardless CASE
				if(answerString.equalsIgnoreCase("Yes") || answerString.equalsIgnoreCase("No")) {
					nonnumericValid = true;
				}

				//If yes or no wasn't input this will prompt the user to do it correctly
				else {
					nonnumericValid = false;
					System.out.println("Error! Please enter yes or no. ");
				}

			}while(!nonnumericValid);//End of Non-numeric input validation do/while Loop			

			//If user input was no to the question: Would you like to play again? The program will exit the loop.
			if (answerString.equalsIgnoreCase("N")){
				repeatProgram = false;
			}

		}while(repeatProgram);//End of Primary do/while not true situation

		integerIn.close();//close the integer scanner
		stringIn.close();//close the string scanner
	}//End of Main Method

}//End of Lab4c
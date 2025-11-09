/*Program: Lab6e
 * Name: Oliver Rivera
 * Date: October 19, 2023
 * Instructor: Sister Kristi Hays
 * Description: To reverse the user input letter by letter
 */

package week06;

import java.util.Scanner;

public class Lab6e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sIn = new Scanner(System.in);//Scanner for string PlayAgain Y or N

		//Declare variables
		boolean valid = false;//Boolean for numbers
		boolean playAgain = false;
		String input = "";

		//Introduce the program
		System.out.println("This program will ask the user to enter something and then print out " + 
				"a reversed version of the user's input ");

		//PRIMARY Do-While Loop
		do {
			//Ask the user the input
			System.out.println("Please enter something: ");
			String userInput = sIn.nextLine();


			//Display information
			System.out.println("\nUsing the for loop: " + "The reverse of " + "'userInput' is: " + thereverseWithForLoop(userInput) );
			System.out.println("Using the for loop: " + "The reverse of " + "'userInput' is: " + thereverseWithWhileLoop(userInput) +"\n");

			//PLAY AGAIN NON-NUMERIC INPUT VALIDATION Do While Loop
			do {
				System.out.println("Do you wish to play again? (Y/N) ");
				valid = false;
				input = sIn.nextLine();

				//If and else to check for validation 
				if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
					valid = true;
				}

				else {
					System.out.println("Error! Please enter Y for yes and N for no. ");
					valid = false;				
				}//End of if and else statement
			}while(!valid);//END of PLAY AGAIN NON-NUMERIC INPUT VALIDATION Starting Line: 39


			//BEGINING of If and else if block to decide to start over again
			if(input.equalsIgnoreCase("Y")) {
				playAgain = true;
				System.out.println("Okay! Have fun. \n");
			}

			else if(input.equalsIgnoreCase("N")) {
				playAgain = false;
				System.out.println("Goodbye. ");
			}//END of if and else statement Starting Line: 57

		}while(playAgain);//End of PRIMARY Do-While Loop Starting Line: 29

		sIn.close();//Closes String Scanner
	}//End of Main Method





	public static String thereverseWithForLoop(String input) {

		StringBuilder reversedFor = new StringBuilder();//This string builder is created to store the reversed version of the input string

		//input.Length will give us the number of character the string is composed of
		//-1 = represent the last character of String inputUser
		//0 =First Character of the String inputUser
		for(int i = input.length() - 1; i>= 0; i--) {
			reversedFor.append(input.charAt(i));//This will append or write next to the reversed character until we get all of the characters reversed from input user
		}//End of For Loop

		return reversedFor.toString();// We are returning the value of reverseFor after all the characters have been reversed
	}//End of thereverseWithForLoop



	public static String thereverseWithWhileLoop(String input) {

		StringBuilder reversedWhile = new StringBuilder();
		int i = input.length() - 1;//-1 represents the last character of the input string

		//Starting form the last  character (-1) to the first character (0) of the userInput  
		while (i >= 0) {
			reversedWhile.append(input.charAt(i));
			i--;
		}//End of While Loop

		return reversedWhile.toString();//We are returning the value of reverseFor after all the characters have been reversed
	}//End of thereverseWithWhileLoop

}//End of Lab6e
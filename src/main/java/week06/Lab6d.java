/*Program: Lab6d
 * Name: Oliver Rivera
 * Date: October 19, 2023
 * Instructor: Sister Kristi Hays
 * Description: To determine the ammount of pennies to accumulate to $1,000,000.00
 */

package week06;
import java.util.Scanner;

public class Lab6d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nIn = new Scanner(System.in);//Scanner for Numbers
		Scanner sIn = new Scanner(System.in);//Scanner for string PlayAgain Y or N

		//Declare variables
		boolean valid = false;//Boolean for numbers
		boolean playAgain = false;
		String input = "";

		//Introduce the program
		System.out.println("This program will ask the user to enter the amount of pennies. \n" + 
				"It will then calculate how many days it will take to become a millionare " +
				"by doubling the amount they have each day. \n");

		//PRIMARY Do-While Loop
		do {
			int numberPennies = 0;

			//NUMBER of PENNIES NUMERIC INPUT VALIDATION Do-While Loop
			do {
				//Ask for the number of pennies
				System.out.println("Please enter the number of pennies you want to start with: ");
				if(nIn.hasNextInt()) {
					numberPennies = nIn.nextInt();
					valid = true;
				}

				else {
					System.out.println("Error! Please use a whole number: ");
					valid = false;
					nIn.nextLine();
				}//End of if and else statement

			}while(!valid);//End of NUMBER of PENNIES NUMERIC INPUT VALIDATION Do-While Loop starting Line: 33


			//Calling the daysToMillion method
			daysToMillion(numberPennies);


			//PLAY AGAIN NON-NUMERIC INPUT VALIDATION
			do {
				System.out.println("Do you wish to play again? (Y/N) ");
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
			}while(!valid);//END of PLAY AGAIN NON-NUMERIC INPUT VALIDATION STarting Line: 53


			//BEGINING of If and else if block to decide to start over again
			if(input.equalsIgnoreCase("Y")) {
				playAgain = true;
				System.out.println("Okay! Have fun. \n");
			}

			else if(input.equalsIgnoreCase("N")) {
				playAgain = false;
				System.out.println("Goodbye. ");
			}//END of if and else statement Starting Line: 73

		}while(playAgain);//Resets the Game PRIMARY Do-While Loop

		nIn.close();//Closes number scanner
		sIn.close();//Closes String Scanner

	}//End of Main method

	//daysToMillion method int a = numberPennies
	public static void daysToMillion(int a) {
		int b = 0;
		int c = a;

		System.out.println("\n Day\t\tPennies\n" + "-------------------------" + "\n" );
		do {
			String formatted = String.format("%9d", c);
			System.out.println(b + "\t\t" + formatted);
			c = c*2;//Everyday multiplying the pennies by 2
			b++;

		}while(c <= 100000000);//100,000,000 pennies in 1Million dollar
		System.out.println(b + "\t\t" + c);
		System.out.println("-------------------------");

		System.out.println("\nBy starting with " + a + " pennies and doubling the amount you have each day, " + 
				"it would \nonly take " + b + " days to become a millionare!!! \n");

	}//End of daysToMillion method

}//End of lab6d
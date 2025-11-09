/*Program: Lab6c
 * Name: Oliver Rivera
 * Date: October 18, 2023
 * Instructor: Sister Kristi Hays
 * Description: To check if number is in between two other numbers
 */

package week06;
import java.util.Scanner;

public class Lab6c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nIn = new Scanner(System.in);//Scanner for Numbers
		Scanner sIn = new Scanner(System.in);//Scanner for string PlayAgain Y or N

		//declare variables
		String input = "";
		boolean valid = false;
		boolean playAgain = false;

		//declare the number range
		int low = 0;
		int high = 0;
		int test = 0;


		//PRIMARY Do-While Loop
		do {

			//LOW NUMBER NUMERIC INPUT VALIDATION Do-While Loop
			do {
				System.out.println("This program will take three numbers and see if the middle of the three numbers " + 
						"resides between the other two numbers. \n");

				//Ask for the first number
				System.out.println("Please enter your low number: ");
				if(nIn.hasNextInt()) {
					low = nIn.nextInt();
					break;
				}

				else {
					System.out.println("Error! Please use a whole number: ");
					nIn.nextLine();
				}//End of if and else statement

			}while(true);

			//TESTED NUMERIC INPUT VALIDATION Do-while Loop
			do {
				System.out.println("Please enter a test number to see if it belongs in between  your low number and your high number: ");
				if(nIn.hasNextInt()) {
					test = nIn.nextInt();
					break;
				}

				else {
					System.out.println("Error! Please use a whole number: ");
					nIn.nextLine();
				}//End of if and else statement
			}while(true);


			//HIGH NUMBER NUMERIC INPUT VALIDATION Do-while Loop
			do {
				System.out.println("Please enter your high number: ");
				if(nIn.hasNextInt()) {
					high = nIn.nextInt();
					break;
				}

				else {
					System.out.println("Error! Please use a whole number: ");
					nIn.nextLine();
				}//End of if and else statement
			}while(true);


			//if and else statement to display results and CALL isBetween
			if(isBetween(low, high, test)) {
				System.out.println(test + " Does lie between the number: " + low + " and " + high + ".");
			}

			else {
				System.out.println(test + " Doesn't lie between the number: " + low + " and " + high + ".");
			}//End of if and else statement


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
			}while(!valid);//END of PLAY AGAIN NON-NUMERIC INPUT VALIDATION


			//BEGINING of If block to decide to start over again
			if(input.equalsIgnoreCase("Y")) {
				playAgain = true;
				System.out.println("Okay! Have fun. \n");
			}

			else if(input.equalsIgnoreCase("N")) {
				playAgain = false;
				System.out.println("Thank you. Have a nice day. ");
			}//END of if and else statement Starting Line: 107

		}while(playAgain);


		nIn.close();//Closes number scanner
		sIn.close();//Closes String Scanner
	}//End of Main method



	//isBetween Method starts equality to main method: int a = low, int b = high, int c = test.
	public static boolean isBetween(int a, int b, int c) {
		if(c < b && c > a) {
			return true;
		}
		else {
			return false;
		}
	}//End of isBetween method


}//End of Lab6a

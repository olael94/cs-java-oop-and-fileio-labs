/*Program: Lab7i
 * Name: Oliver Rivera
 * Date: October 25, 2023
 * Instructor: Sister Kristi Hays
 * Description: T
 */

package week07;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab7i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num = new Scanner(System.in);
		Scanner decimal = new Scanner(System.in);
		Scanner ynScanner = new Scanner(System.in);


		//Play the game until the user says they don't want to play again.
		String playAgain = "Y";
		while (playAgain.equalsIgnoreCase("Y")) {

			//Get an integer from the user
			int intNum = getValidInt(num, "Please enter a whole number: ", "Invalid response. Only whole numbers are acceptable.");// **num** was added as a parameter to be able to close **Scanner num** in the main method
			System.out.printf("The whole number your entered was: %d.\n", intNum);
			System.out.println("\nNow we will test your whole number in a math equation...");
			System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n", intNum, intNum + 10);
			System.out.println();

			//Get a floating-point from the user
			double doubleNum = getValidDouble(decimal, "Please enter a decimal-point number: ", "Invalid response. Only decimal-point numbers are acceptable.");// **decimal** was added as a parameter to be able to close **Scanner decimal** in the main method
			System.out.printf("The float your entered was: %f.\n", doubleNum);
			System.out.println("\nNow we will test your floating-point number in a math equation...");
			System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n", doubleNum, doubleNum + 10);
			System.out.println();

			//Get a 'Y' or 'N' from the user
			playAgain = getValidYN(ynScanner, "Would you like to play again? (Y/N): ", "Invalid response. Please answer with a 'Y' or 'N'");// **ynScanner** was added as a parameter to be able to close **Scanner ynScanner** in the main method
			System.out.println();
		}// end of while (playAgain.equalsIgnoreCase("y"))

		num.close();
		decimal.close();
		ynScanner.close();
	}//End of Main Method




	//getValidInt Method
	public static int getValidInt(Scanner num, String numberQuestion, String numberWarning) {// **num** was added as a parameter to be able to close **Scanner num** in the main method


		//Declare Variables
		int intNum = 0;
		boolean valid = false;

		//NUMERIC INPUT VALIDATION Do-While Loop
		do {
			System.out.println(numberQuestion);

			try {
				intNum = num.nextInt();
				valid = true;
			}
			catch(InputMismatchException e) {
				System.out.println(numberWarning);
				valid = false;
				num.nextLine();
			}//End of Try and Catch

		}while(!valid);//END of NUMERIC INPUT VALIDATION Do-While Loop

		return intNum;
	}//End of getValidInt Method




	//getValidDouble Method
	public static double getValidDouble(Scanner decimal, String decimalQuestion, String decimalWarning ) {// **decimal** was added as a parameter to be able to close **Scanner decimal** in the main method

		//Declare Variables
		double doubleNum = 0.0;
		boolean validDouble = false;

		//DOUBLE INPUT VALIDATION Do-While Loop
		do {
			System.out.println(decimalQuestion);

			try {
				doubleNum = decimal.nextDouble();
				validDouble = true;
			}
			catch(InputMismatchException e) {
				System.out.println(decimalWarning);
				validDouble = false;
				decimal.nextLine();
			}//End of Try and Catch

		}while(!validDouble);//END of DOUBLE INPUT VALIDATION Do-While Loop

		return doubleNum;
	}//End of getValidDouble




	//getValidYN Method
	public static String getValidYN(Scanner ynScanner, String ynQuestion, String ynWarning ) {// **ynScanner** was added as a parameter to be able to close **Scanner ynScanner** in the main method

		String playAgain = "";
		boolean valid = false;

		do {
			System.out.println(ynQuestion);
			valid = false;
			playAgain = ynScanner.nextLine();

			//If and else to check for validation 
			if(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) {
				valid = true;
			}

			else {
				System.out.println(ynWarning);
				valid = false;				
			}//End of if and else statement

		}while(!valid);//END of PLAY AGAIN NON-NUMERIC INPUT VALIDATION Starting Line: 39

		return playAgain;
	}//End of getValidYN Method


}//End of Lab7i

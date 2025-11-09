/*Program: Lab5a
 * Name: Oliver Rivera
 * Date: October 11, 2023
 * Instructor: Sister Kristi Hays
 * Description: Improved Interest Calculator
 */

package week05;
import java.util.Scanner;


public class Lab5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nIn = new Scanner(System.in);//Scanner for Numbers
		Scanner sIn = new Scanner(System.in);//Scanner for string Y or N feature

		//variables
		boolean valid = false;//For Do-While Loops
		boolean goAgain = false;//For the Play Again feature
		String input = "";//For Y or N answer


		//PRIMARY Do-While Loop
		do {
			System.out.println("This program will help you create a savings plan, making a monthly deposit with a specific interest rate" + 
					", and the number of months you plan on saving. \n");

			//define the range of numbers
			double deposit = 0.00;
			double annualRate = 0.00;
			int months = 0;
			double balance = 0.00;

			//DEPOSIT NUMERIC INPUT VALIDATION Do-While Loop
			do {
				System.out.println("Please enter the amount you wish to deposit each month: ");
				if(nIn.hasNextDouble()) {
					deposit = nIn.nextDouble();
					valid = true;
				}

				else {
					System.out.println("Error ! Please enter a number: ");
					valid = false;
					nIn.nextLine();
				}//End of If and else statement

			}while(!valid);//End of DEPOSIT NUMERIC INPUT VALIDATION Do-While Loop Starting Line: 38

			valid = false;

			//NUMERIC INPUT VALIDATION ANNUAL RATE Do-While Loop
			do {
				System.out.println("Please enter your interest rate: ");
				if(nIn.hasNextDouble()) {
					annualRate = nIn.nextDouble();
					valid = true;
				}

				else {
					System.out.println("Error ! Please enter a number: ");
					valid = false;
					nIn.nextLine();
				}//End of If and else statement

			}while(!valid);//End of NUMERIC INPUT VALIDATION ANNUAL RATE Do-While Loop

			valid = false;

			//NUMERIC INPUT VALIDATION MONTHS Do-While Loop
			do {
				System.out.println("Please enter the number of months in which you wish to save: ");
				if(nIn.hasNextInt()) {
					months = nIn.nextInt();
					valid = true;
				}

				else {
					System.out.println("Error ! Please enter a number: ");
					valid = false;
					nIn.nextLine();
				}//End of If and else statement

			}while(!valid);//End of NUMERIC INPUT VALIDATION MONTHS Do-While Loop

			System.out.println("\n The following table will show the balance pertaining" + 
					" to the information you have given \n");

			//creating TABLE HEADER information
			System.out.println("Month\t\tBalance\n");// \t\t = Defining Rows of Table

			double monthlyRate = (annualRate/100.00)/12;//FOrmula to calculate Monthly Interest

			//FOR Loop to run each number between month 1 and desired amount given
			for(int i = 1; i <= months; i++) {

				//calculations
				balance += deposit;
				balance *= (1 + monthlyRate);

				//Display information
				System.out.printf("Month " + i + ":\t");//i = Month Number, \t = defining the end of a column for the table
				System.out.printf("$%,.2f\n", balance);// .2f\n will define number of decimals after point. PRINTF is used for printing percentages.
			}//End of FOR Loop Starting Line: 98

			//Calculating and Printing Interest earned
			double interestEarned = balance - (deposit * months);
			System.out.println("\n Interest Earned: $" + interestEarned);	

			//NON-NUMERIC INPUT VALIDATION Do-While Loop foR goAgain feature
			do {
				valid = false;
				System.out.println("\n Do you wish to perform another calculation?: ");
				input = sIn.next();

				//If and else statement for validation
				if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
					valid = true;
				}

				else {
					System.out.println("Error! Please enter Y for yes and N for no. ");
					valid = false;				
				}//End of if and else statement
			}while(!valid);//END of NON-NUMERIC INPUT VALIDATION Do-While Loop for goAgain feature Starting Line: 105


			//BEGINING of If block to decide to start over again
			if(input.equalsIgnoreCase("Y")) {
				goAgain = true;
				System.out.println("Okay! Have fun. \n");
			}

			else if(input.equalsIgnoreCase("N")) {
				goAgain = false;
				System.out.println("Thank you. Have a nice day. ");
			}//END of if and else statement Starting Line: 122


		}while(goAgain);//END of PRIMARY Loop Starting Line: 27

		nIn.close();//Closes number scanner
		sIn.close();//Closes the string scanner

	}//End of Main Method

}//End of Lab5b

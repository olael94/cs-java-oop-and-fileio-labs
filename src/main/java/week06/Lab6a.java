/*Program: Lab6a
 * Name: Oliver Rivera
 * Date: October 16, 2023
 * Instructor: Sister Kristi Hays
 * Description: The Largest number method
 */

package week06;
import java.util.Scanner;

public class Lab6a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nIn = new Scanner(System.in);//Scanner for Numbers
		Scanner sIn = new Scanner(System.in);//Scanner for string Y or N feature

		//Declare Variables
		String input = "";
		boolean valid = false;//Do-While Loops
		boolean playAgain = false;

		//PRIMARY Do-While Loop
		do {
			System.out.println("This program will ask for three whole numbers " +
					"and determine which one is the largest. \n" );

			//define the range of numbers
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			int largestNum = 0;

			//NUM 1 NUMERIC INPUT VALIDATION Do-While Loop 
			do {
				System.out.println(" \n Please enter the first number: ");
				if(nIn.hasNextInt()) {
					num1 = nIn.nextInt();
					valid = true;
				}

				else {
					System.out.println("Error! Please enter a whole number. ");
					valid = false;
					nIn.nextLine();
				}//End of If and else statement

			}while(!valid);//END of NUM 1 NUMERIC INPUT VALIDATION Do-While Loop Starting Line: 37

			valid = false;//Resets validation for next number 

			//NUM 2 NUMERIC INPUT VALIDATION Do-While Loop 
			do {
				System.out.println(" \n Please enter the second number: ");
				if(nIn.hasNextInt()) {
					num2 = nIn.nextInt();
					valid = true;
				}

				else {
					System.out.println("Error! Please enter a whole number. ");
					valid = false;
					nIn.nextLine();
				}//End of If and else statement

			}while(!valid);//END of NUM 2 NUMERIC INPUT VALIDATION Do-While Loop Starting Line: 55

			valid = false;//Resets validation for next number

			//NUM 3 NUMERIC INPUT VALIDATION Do-While Loop 
			do {
				System.out.println(" \n Please enter the third number: ");
				if(nIn.hasNextInt()) {
					num3 = nIn.nextInt();
					valid = true;
				}

				else {
					System.out.println("Error! Please enter a whole number. ");
					valid = false;
					nIn.nextLine();
				}//End of If and else statement

			}while(!valid);//END of NUM 3 NUMERIC INPUT VALIDATION Do-While Loop Starting Line: 73

			//Passing Numbers to the new largestNum method
			largestNum = largestNumber(num1, num2, num3);

			//print results
			System.out.println("The largest of the three numbers is: " + largestNum + "\n\n");


			//NON-NUMERIC INPUT VALIDATION Do-While Loop for playAgain feature
			do {
				System.out.println("\n Would you like to play again (Y/N)? ");
				valid = false;
				input = sIn.next();

				//If and else statement for validation
				if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
					valid = true;
				}

				else {
					System.out.println("Error! Please enter Y for yes and N for no. ");
					valid = false;				
				}//End of if and else statement
			}while(!valid);//END of NON-NUMERIC INPUT VALIDATION Do-While Loop for goAgain feature Starting Line: 96


			//BEGINING of If block to decide to start over again
			if(input.equalsIgnoreCase("Y")) {
				playAgain = true;
				System.out.println("Okay! Have fun. \n");
			}

			else if(input.equalsIgnoreCase("N")) {
				playAgain = false;
				System.out.println("Thank you. Have a nice day. ");
			}//END of if and else statement Starting Line: 114

		}while(playAgain);//END of PRIMARY Do-while Loop Starting Line: 26

		nIn.close();//Closes number scanner
		sIn.close();//Closes the string scanner		


	}//End of Main Method

	//public static int largestNumber(int i= num1, int j = num2, int k = num3) method
	public static int largestNumber(int i, int j, int k) {
		int l = 0;//Links to int largestNum

		//If, else if , and else statement to determine which is the largest number
		if(i >= j && i >= k)
			l = i;

		else if(j >= i && j >= k)
			l = j;

		else if(k >= i && k >= j)
			l = k;
		else
			System.out.println("Error of some sort");

		return l;

	}//End of largestNumber method

}//End of Lab6a

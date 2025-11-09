/*Program: Lab2c
 * Name: Oliver Rivera
 * Date: September 20, 2023
 * Instructor: Sister Kristi Hays
 * Description: Calculating areas of shapes
 */

package week02;
import java.util.Scanner;

public class Lab2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This will create the scanner for the user input
		Scanner in = new Scanner(System.in);

		//Ask user for amount to be deposited each month
		System.out.println("Please enter the amount to be deposited each month: ");
		float monthlyDeposit = in.nextInt();

		//Ask user for annual interest rate percent
		System.out.println("Please enter the annual interest rate percent: ");
		float annualInterest = in.nextFloat();


		//CALCULATE THE ENDING BALANCE AFTER 6 MONTHS

		//1. Establish Monthly Interest rate
		float monthlyInterest = (annualInterest/100)/12;


		//2. Calculate balance for 1st month
		float firstMonthendb = monthlyDeposit * (1+ monthlyInterest);

		//3. Calculate balance for 2nd month 
		float secondMonthendb = (monthlyDeposit + firstMonthendb) * (1 + monthlyInterest);

		//4. Calculate balance for 3rd month
		float thirdMonthendb = (monthlyDeposit + secondMonthendb) * (1 + monthlyInterest);

		//5. Calculate balance for 4th month
		float fourthMonthendb = (monthlyDeposit + thirdMonthendb) * (1 + monthlyInterest);

		//6. Calculate balance for 5th month
		float fifthMonthendb = (monthlyDeposit + fourthMonthendb) * (1 + monthlyInterest);

		//7. Calculate balance for 6th month
		float sixthMonthendb = (monthlyDeposit + fifthMonthendb) * (1 + monthlyInterest);

		//Print out balance statement
		System.out.println("The ending balance after 6 months is: $" + sixthMonthendb);

		in.close();


	}//End of Main Method

}//End of Lab2c
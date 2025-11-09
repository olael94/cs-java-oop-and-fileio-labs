/*Program: Lab3b
 * Name: Oliver Rivera
 * Date: September 25, 2023
 * Instructor: Sister Kristi Hays
 * Description: Calculating BMI
 */


package week03;
import java.util.Scanner;

public class Lab3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This will create the scanner for the user input
		Scanner in = new Scanner(System.in);

		//Introduce program to user
		System.out.println("In this program we will calculate your BMI (Body Mass Index.) \n" );

		//Ask user for height in inches
		System.out.println("Please enter your height in inches: ");
		int myHeight = in.nextInt();

		//Ask user for Weight in pounds
		System.out.println("Please enter your weight in pounds: ");
		int myWeight = in.nextInt();


		//Converting Pounds to Kilograms & Inches to meters
		double myKg = 0.45359237 * myWeight;

		double myMeters = 0.0254 * myHeight;

		//BMI calculation, Math.pow(base, power) to calculate square root of myKg
		double myBMI = myKg / Math.pow(myMeters, 2);



		//if, else if, and else statement for size table
		if(myBMI < 18.5) {
			System.out.println("Your BMI is: " + myBMI + " Your BMI classification is: Underweight. ");	
		}

		else if (myBMI >= 18.5 && myBMI < 24.9) {
			System.out.println("Your BMI is: " + myBMI + " Your BMI classification is: Normal. ");	
		}

		else if (myBMI >= 25 && myBMI < 29.9) {
			System.out.println("Your BMI is: " + myBMI + " Your BMI classification is: Overweight. ");
		}

		else {
			System.out.println("Your BMI is: " + myBMI + " Your BMI classification is: Obese. ");
		}// end of IF, ELSE IF, AND ELSE Statement
		
		in.close();

	}//End of Main method

}//End of Lab3b
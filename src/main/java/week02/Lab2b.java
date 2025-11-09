/*Program: Lab2b
 * Name: Oliver Rivera
 * Date: September 20, 2023
 * Instructor: Sister Kristi Hays
 * Description: Calculating areas of shapes
 */

package week02;
import java.util.Scanner;

public class Lab2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);//for user input

		//Ask user for width of a square
		System.out.println("Please enter the width of the square: ");
		int sqWidth = in.nextInt();

		//Ask user for the width of the rectangle
		System.out.println("Please enter the width of the rectangle: ");
		int recWidth = in.nextInt();

		//Ask user for the height of the rectangle
		System.out.println("Please enter the height of the rectangle: ");
		int recHeight = in.nextInt();

		//Calculate the Areas of the shapes
		int sqArea = sqWidth * sqWidth; // Area for Square
		int recArea = recWidth * recHeight; //Area of Rectangle

		//Display message of results
		System.out.println("The area of the square with a width of " + sqWidth + " is " + sqArea +".");

		System.out.println("The area of the rectangle with a width of " + recWidth + " and a height of " + recHeight + " is " + recArea +".");

		in.close();

	}//End of Main method

}//End of lab2b
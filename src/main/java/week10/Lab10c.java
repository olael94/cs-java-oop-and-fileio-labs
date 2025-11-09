/* Program: Lab10c
 * Name: Oliver Rivera
 * Date: November 15, 2023
 * Instructor: Sister Kristi Hays
 * Description: Reading Data from Text Files
 */

package week10;

//import java.io.File;
import java.io.InputStream;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

public class Lab10c {

	public static void main(String[] args) {

		//Stating my filePath that I want the scanner to read
		String filePath = "Student Assignment Scores.csv";
		//File inFile = new File(filePath);
		InputStream studentScores = Lab10c.class.getResourceAsStream("/"+ filePath);
		
		// create a file object with try-with-resoruces. scanner automatically closes once the block finishes
		try (Scanner scanner = new Scanner(studentScores)){
			
			// Check if file is empty before reading
			if (!scanner.hasNextLine()) {
	            System.out.println("The file is empty.");
	            return;
	        }

			//create simple header for student missing assignments
			System.out.printf("%-20s%7s\n", "Student", "Assignment with 0");
			System.out.println("-------------------------------------");

			//print out every line in the file
			while (scanner.hasNextLine()) {
				String row = scanner.nextLine();
				String[] student = row.split(","); //

				//loop through every score and print it if it equals 0
				for(int i = 1; i < student.length; i++) {
					if(student[i].equals("0")) {
						System.out.printf("%-30s%s\n", student[0], i);
					} //end of if statement
				}//end of for loop 

			}//end of while loop
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}//end of main method
}

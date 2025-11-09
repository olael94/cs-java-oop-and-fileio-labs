/*
 * Program: Lab10b
 * Name: Oliver Rivera
 * Date: 11/15/2023
 * Instructor: Sister Kristy Hays
 * Description: Format table from imported document.
 */

package week10;

import java.io.InputStream;
import java.util.Scanner;


public class Lab10b {

	public static void main(String[] args) {

		//Stating my filePath that I want the scanner to read
		String filePath = "Student Assignment Scores.csv";
		InputStream studentScores = Lab10b.class.getResourceAsStream("/"+ filePath);		// Load file from the classpath (src/main/resources)
		//File Student_Scores = new File(filePath); Old Implementation
		
		// create a file object. used try-with-resoruces. scanner automatically closes once the block finishes
		try (Scanner scanner = new Scanner(studentScores)){
			
			// Check if file is empty before reading
			if (!scanner.hasNextLine()) {
                System.out.println("The file is empty.");
                return; // Exit program early
            }
			
			//grab the first row and display it as a table header
			String firstRow = scanner.nextLine();
			String header[] = firstRow.split(",");
			System.out.printf("%-30s%7s%7s%7s%7s%7s%7s%n", header[0], header[1], header[2], header[3],header[4], header[5], header[6]);

			System.out.println("------------------------------------------------------------------------");


			//print out every line in the file
			while (scanner.hasNextLine()) {
				String row = scanner.nextLine();
				String[] student = row.split(",");
				System.out.printf("%-30s%7s%7s%7s%7s%7s%7s%n", student[0], student[1], student[2], student[3],student[4], student[5], student[6]);
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
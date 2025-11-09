/* Program: Lab10d
 * Name: Oliver Rivera
 * Date: November 16, 2023
 * Instructor: Sister Kristi Hays
 * Description: Store data input from a file in a nested Array
 */

package week10;

//import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab10d {
	public static void main(String[] args) {

		//Stating my filePath that I want the scanner to read
		String filePath = "Student Test Grades.csv";
		//File Student_Scores = new File(filePath);
		InputStream studentScores = Lab10d.class.getResourceAsStream("/"+ filePath);

		// create a file object with try-with-resources. scanner automatically closes once the block finishes
		try (Scanner scanner = new Scanner(studentScores)){

			if (!scanner.hasNextLine()) {                // empty file guard
				System.out.println("The file is empty.");
				return;
			}

			//Grab the first row and display it as a table header
			String firstRow = scanner.nextLine();
			String header[] = firstRow.split(",");
			System.out.println("------------------------------------------------------------");

			System.out.printf("%-30s%6s%10s%10s%n", header[0], header[1], header[2], header[3]); //"%-30s%7s%7s%7s%n" , header[0], header[1], header[2], header[3]

			System.out.println("------------------------------------------------------------");

			// Create an ArrayList to store String arrays
			ArrayList<String[]> classRoster = new ArrayList<>();

			//Go thru Each line of the file
			while (scanner.hasNextLine()) {
				String row = scanner.nextLine();
				String[] studentData = row.split(",");
				classRoster.add(studentData);
			}


			// Display the data with letter grades
			for (int i = 0; i < classRoster.size(); i++) {
				String[] student = classRoster.get(i);

				// Display student name
				System.out.printf("%-30s", student[0]);

				// Process and display letter grades for each test
				for (int j = 1; j < student.length; j++) {
					int score = Integer.parseInt(student[j].trim());
					String grade = calculateLetterGrade(score);
					System.out.printf("%-10s", grade);
				}

				System.out.println(); // Move to the next line for the next student
			}//END of For Loop
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}//End of Main Method

	// calculateLetterGrade() Method to calculate letter grade based on the percentage
	private static String calculateLetterGrade(int score) {
		if (score > 94) return "A";
		else if (score > 90) return "A-";
		else if (score > 87) return "B+";
		else if (score > 84) return "B";
		else if (score > 80) return "B-";
		else if (score > 77) return "C+";
		else if (score > 74) return "C";
		else if (score > 70) return "C-";
		else if (score > 67) return "D+";
		else if (score > 64) return "D";
		else if (score > 60) return "D-";
		else return "E"; // Default for scores below 60
	}
}

package week07;

import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class usingDateTimeFormatter {

	public static void main(String[] args) {
	
		LocalDateTime myDateTime = LocalDateTime.now();  
		System.out.println("Before formatting: " + myDateTime);  
		DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  

		String formattedDate = myDateTime.format(myFormatter);  
		System.out.println("After formatting: " + formattedDate);

	}

}

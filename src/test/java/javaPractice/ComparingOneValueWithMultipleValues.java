package javaPractice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ComparingOneValueWithMultipleValues {
	public static void main(String[] args) {
		
	
//	String[]a= {"Apple","And","Aorange","Apapaya"};
//	
//	for(int i=0;i<a.length;i++) {
//		if(a[i].contains("A")) {
//			System.out.println(a[i]);
//		}
//		else {
//			System.out.println("error");
//		}
//	}
		
		  LocalDateTime currentDateTime = LocalDateTime.now();
	        
	        // Create a date-time formatter with milliseconds
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	        
	        // Format the date and time as a string
	        String formattedDateTime = currentDateTime.format(formatter);
	        
	        System.out.println("Current Date and Time: " + formattedDateTime);
	    }
	}


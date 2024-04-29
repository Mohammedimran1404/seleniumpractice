package automationTask;


	
import org.openqa.selenium.JavascriptExecutor;

//	import java.net.URL;
//
//	public class URLExample {
//	    public static void main(String[] args) {
//	        try {
//	            // Create a URL object
//	            URL url = new URL("https://www.example.com/page?param1=value1&param2=value2");
//
//	            // Get the query component of the URL
//	            String query = url.getQuery();
//
//	            // Print the query
//	            System.out.println("Query: " + query);
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	    }

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.net.Urls;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ValidateURLParameters {
    public static void main(String[] args) throws InterruptedException {
      
//    		WebDriverManager.edgedriver().setup();
//    		
//    		WebDriver driver =new EdgeDriver();
//    		
//    		driver.get("https://www.amazon.in");
    	//	driver.manage().window().maximize();
    	//String url1=	driver.getCurrentUrl();
//    		
//		URL url;
//		try {
//		//	url = new URL(url1);
//		
//		String query=url.getQuery();
////		JavascriptExecutor js = (JavascriptExecutor) driver;
////        String currentUrl = (String) js.executeScript("return window.location.href");
////      
////        
////		
////        String query = currentUrl.split("\\?")[1];
//		
//
//            Map<String, String> parameters = new HashMap<>();
//            for (String param : query.split("&")) {
//                String[] pair = param.split("=");
//                parameters.put(pair[0], pair[1]);   
//            }
//            if (parameters.containsKey("Home-Kitchen") && parameters.get("Home-Kitchen").equals("true")) {
//
//                System.out.println("Parameter 'Home-Kitchen' is present and set to 'true'");
//            } else {
//                System.out.println("Parameter 'Home-Kitchen' is either not present or not set to 'true'");
//            }
//            
//       
//           
////        }
////    }
////
    }
}



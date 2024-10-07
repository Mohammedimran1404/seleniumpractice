package takescreenshot;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetName {
	public static void main(String[] args) {
		
	
	
//	try {
//        InetAddress localHost = InetAddress.getLocalHost();
//
//        String hostName = localHost.getHostName();
//
//        System.out.println("Local host name: " + hostName);
//    } catch (UnknownHostException e) {
//       
//    }
		
//		
//	        WebDriver driver=null;
//	        WebElement element=null ;
//	        int count = 0; 
//	        boolean value = false;
//	        
//	        while (count < 10 && !value) {
//	            try {
//	                if (element.isDisplayed()) {
//	                	value = true;
//	                }
//	            } catch (Exception e) {
//	            }
//
//	            if (!value) {
//	                try {
//	                    Thread.sleep(3000);
//	                } catch (InterruptedException e) {
//	                    System.out.println("wait"+count);
//	                }
//	            }
//
//	            count++;
//	        }
//
//	        if (!value) {
//	            driver.navigate().refresh();
//	        }
		
		
		 boolean value = false;
		 int count=0;
		 int count2=110;
	        
	        while (count < 10 && !value) {
	        	System.out.println("i am while loop"+ !value);
	            try {
	                if (10==count2) {
	                	value = true;
	                	System.out.println(count2+ "element is displayed"+ value);
	                }
	            } catch (Exception e) {
	            }

	            if (!value) {
	            	System.out.println(!value);
	                try {
	                    Thread.sleep(1000);
	                    System.out.println("wait"+count);
	                    System.out.println(value);
	                } catch (InterruptedException e) {
	                   
	                }
	            }

	            count++;
	        }

	        if (!value) {
	        	System.out.println(!value);
	           System.out.println("i am executed");
	           
	        }
}
}



	




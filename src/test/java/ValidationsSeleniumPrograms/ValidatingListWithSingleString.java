package ValidationsSeleniumPrograms;

import java.util.List;

import java.util.Arrays;
public class ValidatingListWithSingleString {
	
	
	public static void main(String[] args) {
		
		List<String> lst=Arrays.asList("Apple","Apple","aple");

        String str="Apple";
        boolean value=true;
        for(String strLstApple:lst){
        	
            System.out.println(strLstApple);
            if(!str.equalsIgnoreCase(strLstApple)){
                value=false;
                break;

            }
        }
       if(value){
           System.out.println("pass");
           System.out.println(value);
       }
       else {
           System.out.println("fail");
           System.out.println(value);
       }
    }
		
		
	}



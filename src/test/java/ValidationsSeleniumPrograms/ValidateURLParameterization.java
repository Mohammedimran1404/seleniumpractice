package ValidationsSeleniumPrograms;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class ValidateURLParameterization {
	
	public static void main(String[] args) {
		String strName="name which we are validation";
		String strCheckBoxValue="name which we are validation";
		WebDriver driver = null;
		boolean value=false;
		
		String strCurrentURL=driver.getCurrentUrl();
		
		try {
			URL url=new URL(strCurrentURL);
			
			String strQuery=url.getQuery();
			Map<String,String> parameters=new HashMap<>();
			for(String strParam:strQuery.split("&")) {
				String[] strPair=strParam.split("=");
				parameters.put(strPair[0], strPair[1]);
			}
			if(parameters.containsKey(strName)&& parameters.get(strName).equalsIgnoreCase(strCheckBoxValue)) {
				value=true;
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

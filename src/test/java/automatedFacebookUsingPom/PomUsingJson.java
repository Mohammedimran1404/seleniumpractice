package automatedFacebookUsingPom;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

public class PomUsingJson {
	@DataProvider(name="pomdata")
	public String[] dataToPom(Method name) throws IOException, ParseException {
		System.out.println("method which is connected to dataprovider is "+name.getName());
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader(".\\Reader\\Automation.json");
		Object obj = parser.parse(reader);
		JSONObject jsonobject = (JSONObject) obj;
		JSONArray jsonarray=(JSONArray)jsonobject.get("instagramcred");
		String arr[] = new String[jsonarray.size()];
		for (int i = 0; i < jsonarray.size(); i++) {
    	 JSONObject jsobject=(JSONObject) jsonarray.get(i);
    	 String uname=(String) jsobject.get("usernames");
    	 String psd = (String) jsobject.get("passwords");
    	 arr[i]=uname+","+psd;
      }
		return arr;
        
			
		
		
	}
	


}

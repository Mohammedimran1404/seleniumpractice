package jsonpractice;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

public class GivingDataToAutomClass {
	@DataProvider(name="instagram")
	public String[] data() throws IOException, ParseException {
		
		
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader(".\\Reader\\Automation.json");
		Object obj=parser.parse(reader);
		JSONObject jsonobj=(JSONObject)obj;
		JSONArray jsonarray=(JSONArray)jsonobj.get("instagramcred");
		String[] arr= new String[jsonarray.size()];
		for(int i=0; i<jsonarray.size();i++) {
			JSONObject jobject=(JSONObject)	jsonarray.get(i);
			String useru= (String) jobject.get("usernames");
			String passu = (String)jobject.get("passwords");
			arr[i]=useru+","+passu;
			



		}
		return arr;

	}
}

package PomPractice;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

public class Pomdatasending {
	@DataProvider(name="pomfacebookdata")
	public String[] pomdatasen() throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader(".\\Reader\\Pom.json");
		Object obj = (Object) parser.parse(reader);
		JSONObject jobj = (JSONObject) obj;
		JSONArray jarray = (JSONArray) jobj.get("Pomcredentials");
		String arr[] = new String[jarray.size()];
		for (int i = 0; i <jarray.size(); i++) {
			JSONObject jsobject = (JSONObject) jarray.get(i);
			String face = (String) jsobject.get("facebookmail");
			String pass = (String) jsobject.get("facebookpass");
			arr[i] =face+","+pass;
		}
		return arr;
	}
}

package jsonWithoutDataUsingBrowsers;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonClass {
public static void main(String[] args) throws IOException, ParseException {
	JSONParser parser = new JSONParser();
	FileReader reader = new FileReader(".\\Reader\\data.json");
	Object obj = parser.parse(reader);
	JSONObject jsonobj = (JSONObject) obj;
	String fname = (String) jsonobj.get("firstname");
	String lname = (String) jsonobj.get("lastname");
	System.out.println(fname);
	System.out.println(lname);
	JSONArray jsonarray = (JSONArray) jsonobj.get("address");
	for (int i = 0; i < jsonarray.size(); i++) {
		JSONObject addresss = (JSONObject) jsonarray.get(i);
		String addr = (String) addresss.get("street");
		String cit = (String) addresss.get("city");
		String stat = (String) addresss.get("state");
		System.out.println(addr);
		System.out.println(cit);
		System.out.println(stat);

	}
}
}

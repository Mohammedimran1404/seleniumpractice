package jsonWithoutDataUsingBrowsers;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TakingDataFromJson {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Reader\\data.json");
	Object obj=	jsonparser.parse(reader);
	JSONObject jobj=(JSONObject)obj;
	String fname=(String)jobj.get("firstname");
	String lname=(String)jobj.get("lastname");
	System.out.println(fname+","+lname);
	JSONArray jarray=(JSONArray)jobj.get("address");
	for(int i=0;i<jarray.size();i++) {
		JSONObject jsonobject=(JSONObject)jarray.get(i);
	String str=(String)	jsonobject.get("street");
	String cit=(String)	jsonobject.get("city");
	String sta=(String)	jsonobject.get("state");
	System.out.println(str+","+cit+","+sta);
	}

	}

}

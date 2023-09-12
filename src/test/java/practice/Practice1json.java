package practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Practice1json {
	public void jsonreader() throws IOException, ParseException {
		File filepath = new File(System.getProperty("user.dir")+"\\Reader\\practice.json");
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(filepath);
	    Object obj =(Object)jsonparser.parse(reader);
	    JSONObject jobj =(JSONObject)obj;
	  String userName=(String)  jobj.get("username");
	  System.out.println(userName);
	 String passWord=(String) jobj.get("password");
	 JSONArray jarray=(JSONArray)jobj.get("usres");
		String arr[]=new String [jarray.size()];
		for(int i=0;i<jarray.size();i++) {
			JSONObject jsobj=(JSONObject)jarray.get(i);
		}
	}
	public static void main(String[] args) throws IOException, ParseException {
		Practice1json p = new Practice1json();
		p.jsonreader();
	}

}

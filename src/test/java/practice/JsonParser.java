package practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParser {
	public void json() throws IOException, ParseException  {
		File f = new File(System.getProperty("user.dir")+"//Reader\\practice.json");
		// JSONParser is used for passing the file
		JSONParser parser = new JSONParser();
		//FileReader is used to load the file
		FileReader reader= new FileReader(f);
		//parsing the json file
		Object obj =(Object)parser.parse(reader);
		// whole file is jsononject
		JSONObject jobj=(JSONObject) obj;
		//in jsonobject there is jsonarray
	JSONArray jarray=(JSONArray)jobj.get("users");
	//storing the file injava array to return and use in tc
	Object objj[]=new Object[jarray.size()];
	for(int i=0;i<jarray.size();i++) {
	JSONObject jsobj=(JSONObject)jarray.get(i);
	Object user=(Object)jsobj.get("usersname");
	Object passw=(Object)jsobj.get("password");
	System.out.println(user);
	System.out.println(passw);
	//String use=(String)jobj.get("username");
//	System.out.println(use);
//	String pass=(String)jobj.get("password");
//	System.out.println(pass);
	
	}
		}
		
		
	    
	
public static void main(String[] args) throws IOException, ParseException  {
	JsonParser json= new JsonParser();
	json.json();
	
	
}
}

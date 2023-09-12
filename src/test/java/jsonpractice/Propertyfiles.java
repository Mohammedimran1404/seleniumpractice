package jsonpractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfiles {

	public static void main(String[] args) throws IOException {
		
	
		FileInputStream fis = new FileInputStream("C:\\Users\\ImranMohd-Kairos\\EclipseFolder\\Seleniumpractice\\Reader\\datafile.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String urlOfWebsite =pro.getProperty("url");
		System.out.println(urlOfWebsite);
		String user=pro.getProperty("username");
		System.out.println(user);
		String pass=pro.getProperty("password");
		System.out.println(pass);
	}


}
//just for practice not use any where.
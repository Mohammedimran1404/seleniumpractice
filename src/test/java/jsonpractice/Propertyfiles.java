package jsonpractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfiles {

	public void propertyFiles() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\ImranMohd-Kairos\\EclipseFolder\\Seleniumpractice\\Reader\\datafile.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String urlOfWebsite =pro.getProperty("url");
		System.out.println(urlOfWebsite);
		pro.getProperty("username");
		pro.getProperty("password");
	}
}


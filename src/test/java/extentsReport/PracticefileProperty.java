package extentsReport;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PracticefileProperty {
	
	public void propertyFiles() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\ImranMohd-Kairos\\EclipseFolder\\Seleniumpractice\\Reader\\datafile.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String urlOfWebsite =pro.getProperty("url");
		System.out.println(urlOfWebsite);
		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("password"));
	}

	public static void main(String[] args) throws IOException {
		PracticefileProperty obj = new PracticefileProperty();
		obj.propertyFiles();
	}

}

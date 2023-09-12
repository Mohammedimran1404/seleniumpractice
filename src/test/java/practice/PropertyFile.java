package practice;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
	Properties pro;
	public void setPropertyFilePath() {
		try {
		File filepath = new File(System.getProperty("user.dir")+"\\Reader\\practice.properties");
		FileInputStream fi = new FileInputStream(filepath);
		 pro = new Properties();
		pro.load(fi);
	}
		catch(Exception e) {
		System.out.println(e.getMessage());
		}
	}
		public void geturl(String Url) {
			String url=pro.getProperty(Url);
			System.out.println(url);
		}
		public void getusername(String username) {
			String use=pro.getProperty(username);
			System.out.println(use);
		}
		public void getpassword(String password) {
			String pass=pro.getProperty(password);
			System.out.println(pass);
		}
	
	
public static void main(String[] args)  {
	PropertyFile p = new PropertyFile();
	p.setPropertyFilePath();
	p.geturl("url");
	p.getusername("username");
	p.getpassword("password");
}
}

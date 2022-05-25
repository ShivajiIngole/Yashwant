package day1.basics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
	//	String filePath = System.getProperty("user.home")+"\\basics\\Property1.properties";
		//FileInputStream get= new FileInputStream(filePath);
		//or
		//FileInputStream get1= new FileInputStream(".\\basics\\Property1.properties");
		//or
		FileInputStream get= new FileInputStream ("C:\\Users\\dell\\eclipse-workspace\\JavaBasicProgram\\src\\day1\\basics\\day1\\basics\\Property1.properties");
		
		Properties read = new Properties();
		read.load(get);
		
		System.out.println (read.getProperty("username"));
		System.out.println (read.getProperty("password"));
		
	}

}

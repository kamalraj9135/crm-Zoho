package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fr = new FileInputStream("C:\\Users\\User\\OneDrive\\Desktop\\Automation Project\\TestAutomationFramework\\src\\test\\resources\\configFiles\\config.properties");
		
		Properties p = new Properties();
		
		p.load(fr);

		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
	}

}

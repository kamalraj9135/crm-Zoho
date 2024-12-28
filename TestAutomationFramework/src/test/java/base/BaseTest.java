package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties p = new Properties();
	public static Properties loc = new Properties();
	public static FileInputStream fr;
	public static FileInputStream fr1;
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		if(driver==null) {
			fr = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\config.properties");
			fr1 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\locators.properties");
			p.load(fr);
			loc.load(fr1);
		}
		
		if(p.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();  //base
			driver = new ChromeDriver();  //base
			driver.get(p.getProperty("testurl"));  //properties
		}
		
		else if(p.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(p.getProperty("testurl"));  //properties
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		System.out.println("Teardown Successfull");
		
	}

}

package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstClass {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();  // base
		WebDriver driver = new ChromeDriver();  // base
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zoho.com/");  // properties
		driver.findElement(By.linkText("Sign In")).click();  // locators -- properties
		driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("kamal.kumar.uemk.cse.2023@gmail.com");
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kumar@2024");
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		
//		driver.findElement(By.xpath("//span[@aria-label='Sign in with Google']")).click();
//		driver.findElement(By.xpath("//body/div[contains(@class,'gfM9Zd')]/div[contains(@class,'NQ5OL')]/div[@class='SQNfcc WbALBb']/div[@class='nR49Bf']/div[@class='PIEwGd']/div[@class='Anixxd']/div[@class='TFSJ7e']/div[@class='DdzYHd']/div[@class='HvrJge']/form[@method='post']/span/section[contains(@class,'Em2Ord')]/div[@class='yTaH4c']/div/div[@class='A0AdH']/div[@class='r4WGQb']/ul[@class='Dl08I']/li[2]/div[1]/div[1]/div[1]")).click();
//		driver.findElement(By.xpath("//span[normalize-space()='Continue']")).click();
		
	}

}

package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTestFW extends BaseTest{
	
	@Test(dataProviderClass = ReadXLSdata.class, dataProvider = "bvtData")
	public static void LoginTest(String username, String password) throws Exception {
		
		System.out.println("Clicked Successfully");
		driver.findElement(By.linkText(loc.getProperty("signin_Link"))).click();  // locators -- properties
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("email_field"))).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("next_btn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("pwd_field"))).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("login_next_btn"))).click();
		
	}

}

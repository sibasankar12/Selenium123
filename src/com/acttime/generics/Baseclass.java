package com.acttime.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class Baseclass
{
	WebDriver driver;
	static 
	 {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe")	 ;
	 }
	
	@BeforeTest
public void openbrowser()
{
 Reporter.log("openbrowser", true);	
 driver=new ChromeDriver();
 
}
@AfterTest
public void closebrowser()
{
Reporter.log("closebrowser", true);	
driver.close();
}
@BeforeMethod
public void login()
{
Reporter.log("login", true);	
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("8917412959");
driver.findElement(By.id("pass")).sendKeys("sankar12");
driver.findElement(By.name("login")).click();
}
@AfterMethod
public void logout()
{
	Reporter.log("logout", true);	
	driver.findElement( By.xpath("//span[.='Log Out']")).click();
}
}

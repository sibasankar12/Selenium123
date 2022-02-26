package com.acttime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

import com.actitime.pom.Loginpage;


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
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterTest
public void closebrowser()
{
Reporter.log("closebrowser", true);	
driver.close();
}
@BeforeMethod
public void login() throws IOException
{
Reporter.log("login", true);	

Filelab f=new Filelab();
String url = f.getpropertyData("url");
String un=f.getpropertyData("username");
String pw=f.getpropertyData("password");
driver.get(url);
Loginpage l=new Loginpage(driver);
l.setLogin(un, pw);

}
@AfterMethod
public void logout()
{
	Reporter.log("logout", true);	
	driver.findElement( By.xpath("//span[.='Log Out']")).click();
}
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOfFacebook 
{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args)
	{
	WebDriver  driver=new ChromeDriver();	
	driver.get("https://www.facebook.com/");
	boolean login=driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).isEnabled();
	if(login== true)
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	driver.close();
	
	}
	

}

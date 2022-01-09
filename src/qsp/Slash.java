package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slash 
{
	static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.google.co.in/");
    WebElement e=driver.switchTo().activeElement();
    e.sendKeys("java");
	}

}

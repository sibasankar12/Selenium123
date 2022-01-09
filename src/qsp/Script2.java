package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 
{
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) 
	{
WebDriver driver=new ChromeDriver();	
driver.get("https://www.gmail.com/");
String currenturl=driver.getCurrentUrl();
if(currenturl.contains("google.com"))
{
System.out.println("url contains google");	
}
else
{
	System.out.println("url does not contains google");
}
driver.quit();
	}
}

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled
{
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args)
	{
WebDriver driver=new ChromeDriver();	
driver.get("https://www.facebook.com/");
boolean logbutton=driver.findElement(By.xpath("//button[@id='u_0_j_NR']")).isEnabled();
if(logbutton==true)
{
	System.out.println("login button is enabled");
}
else
{
	System.out.println("login button is not enabled");
}
driver.close();
	}
}


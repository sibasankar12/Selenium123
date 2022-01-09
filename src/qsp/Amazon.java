package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) 
	{
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
WebElement emailtbx=driver.findElement(By.id("username"));
int height=emailtbx.getSize().getHeight();
int width=emailtbx.getSize().getWidth();
WebElement pswbox=driver.findElement(By.name("pwd"));
int height1=pswbox.getSize().getHeight();
int  width1=pswbox.getSize().getWidth();
if(height + width == height1 +width1)
{
	System.out.println("both are equal");
}7
else
{
	System.out.println("both are not equal");
}
driver.quit();
	}
}
	
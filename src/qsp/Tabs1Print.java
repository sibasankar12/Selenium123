package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs1Print 
{
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Set<String>allTab=driver.getWindowHandles();
	int count=allTab.size();
	System.out.println(count);
	for(String Tab: allTab)
	{
		driver.switchTo().window(Tab);
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	driver.quit();
	

	}

}

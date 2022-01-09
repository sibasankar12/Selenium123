package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeWh 
{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(12000);
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	Set<String>allwh=driver.getWindowHandles();
	for(String wh:allwh)
	{
		driver.switchTo().window(wh);
		String title=driver.getTitle(); 
		System.out.println(title);
	}
driver.close();
	}

}

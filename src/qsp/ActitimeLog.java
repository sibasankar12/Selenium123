package qsp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLog 
{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();	
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(4000);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(12000);
	driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
	Thread.sleep(4000);
	driver.findElement(By.linkText("About your actiTIME")).click();
	driver.findElement(By.linkText("Read Service Agreement")).click();
	Thread.sleep(3000);
	List< WebElement >allTabshead=driver.findElements(By.xpath("//li/span"));
	for(String wh1: allTabshead) 
	{
	String title=driver.getTitle();
	System.out.println(title);
	}
	driver.quit();
	}

}

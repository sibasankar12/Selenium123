package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndwidthOfActi
{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException
	{
    WebDriver driver=new ChromeDriver();	
    driver.get("https://demo.actitime.com/login.do");
    Thread.sleep(8000);
    WebElement  username=driver.findElement(By.id("username"));
    int height=username.getSize().getHeight();
    int width=username.getSize().getWidth();
    WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	int height1=password.getSize().getHeight();
	int width1=password.getSize().getWidth();
	if(height+width==height1+width1)
	{
		System.out.println("equal");
	}
	else
	{
		System.out.println("not equal");
	}
	driver.close();
	}

}

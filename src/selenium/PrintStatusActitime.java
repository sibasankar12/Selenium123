package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintStatusActitime
{
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(6000);
    String status=driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).getText();
    System.out.println(status);
    driver.close();
	}
}
      

package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousre {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.vtiger.com/");
	WebElement resource=driver.findElement(By.partialLinkText("Resources"));
      Actions a=new Actions(driver);
      a.moveToElement(resource).perform();
      driver.findElement(By.partialLinkText("Contact ")).click();
      String text=driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
      System.out.println(text);
      driver.close();
	}

}

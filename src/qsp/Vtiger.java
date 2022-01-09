package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger
{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.vtiger.com/");
	Thread.sleep(2000);
	WebElement resource = driver.findElement(By.partialLinkText("Resources"));
Actions a=new Actions(driver);
a.moveToElement(resource).perform();
driver.findElement(By.partialLinkText("Customers")).click();
Thread.sleep(5000);
WebElement clicker = driver.findElement(By.xpath("//a[contains(text(),'READ FULL STORY')]"));
Thread.sleep(2000);
Actions a1=new Actions(driver);
a1.moveToElement(clicker).perform();
a1.doubleClick(clicker).perform();
Thread.sleep(4000);
String title=driver.getTitle();
System.out.println(title);
	}

}

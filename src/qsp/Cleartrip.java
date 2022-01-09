package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip 
{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cleartrip.com/");
	Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).sendKeys("Bengaluru");
    driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).sendKeys("Goa");
    driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']")).click();
    driver.findElement(By.xpath("(//div[contains(text(),'31')])[1]")).click();
    
    
	}

}

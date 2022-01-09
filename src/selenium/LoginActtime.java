package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActtime {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
Thread.sleep(9000);
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
Thread.sleep(4000);
driver.findElement(By.xpath("(//div[contains(text(),'Login ')])[1]")).click();
Thread.sleep(9000);
driver.close();

	}
                   
}

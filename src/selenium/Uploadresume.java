package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadresume {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.naukri.com/");
driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
Thread.sleep(7000);
driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("sahusibasankar28@gmail.com");
driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Sankar@12");
driver.findElement(By.xpath("//button[contains(text(),'Login')]")).submit();
driver.findElement(By.xpath("//div[contains(text(),'UPDATE PROFILE')]")).click();
driver.findElement(By.id("attachCV")).click();
File f=new File("./data/Siba Sankar Sahu resume....docx");
String absolutepath = f.getAbsolutePath();

	}

}

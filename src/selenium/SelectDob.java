package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDob {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);                                                                                                                      
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
WebElement daylist = driver.findElement(By.id("day"));
Select s=new Select(daylist);
s.selectByValue("12");
 WebElement monthlist = driver.findElement(By.id("month"));
 Select s1=new Select(monthlist);
 s1.selectByVisibleText("Oct");
 WebElement yearlist = driver.findElement(By.id("year"));
Select s2=new Select(yearlist);
s2.selectByValue("1994");

	}

}

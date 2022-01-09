package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byusingsendkeys
{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Alerts.html");
driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();

driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
Thread.sleep(2000);
Alert a=driver.switchTo().alert();
Thread.sleep(2000);
a.sendKeys(null)
Thread.sleep(1000);
a.accept();
driver.close();
	}

}

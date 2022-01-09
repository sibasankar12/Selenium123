package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondone 
{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args)
	{
WebDriver driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Alerts.html");
driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();

WebElement  b= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
b.click();

Alert a=driver.switchTo().alert();
a.dismiss();
String b1=b.getText();
if(b1=="You Pressed Cancel")
{
	System.out.println("passed");
}
else
{
	System.out.println("failed");
}
System.out.println(b1);
driver.close();
	}

}

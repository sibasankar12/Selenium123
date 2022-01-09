package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Create New Account']")).click();
	Thread.sleep(2000);
	int y1=driver.findElement(By.xpath("//label[.='Female']")).getLocation().getY();
	Thread.sleep(2000);
	int y2=driver.findElement(By.xpath("//label[.='Male']")).getLocation().getY();
	Thread.sleep(2000);
	int y3=driver.findElement(By.xpath("//label[.='Custom']")).getLocation().getY();
	Thread.sleep(2000);
	System.out.println("Female radio button:" +y1);
	System.out.println("male radio button:"+y2);
	System.out.println("custome radio button:"+y3);
	if(y1==y2 && y2==y3)
	{
		System.out.println("properly alligned");
	}
	else
	{
		System.out.println("not properly alligned");
	}
	driver.quit();
	}
}

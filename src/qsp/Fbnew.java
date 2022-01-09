package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fbnew 
{
static 
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2_hq")).click();
		int x1=driver.findElement(By.id("u_a_2_MK")).getLocation().getX();
		int x2=driver.findElement(By.id("u_a_3_nb")).getLocation().getX();
		int x3=driver.findElement(By.id("u_a_4_iV")).getLocation().getX();
		if(x1==x2 && x1==x3)
		{
			System.out.println("both are properly alligned");
		}
		else
		{
			System.out.println("not properly alligned");
		}
	}
}

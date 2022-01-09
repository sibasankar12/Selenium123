package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Type1 {
static 
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	boolean type=driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).isSelected();
    if(type==true)
    {
    	System.out.println("status is present");
    }
    else
    {
    	System.out.println("status is not present");
    }
    driver.quit();
	}
}

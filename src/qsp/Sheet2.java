package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sheet2
{
	static 
{

System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	List<WebElement> allLink=driver.findElements(By.tagName("a"));
	int count=allLink.size();
    System.out.println(count);	
    WebElement link=allLink.get(1);
   String Text= link.getText();
   System.out.println(Text);
driver.quit();
	}

}

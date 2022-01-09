package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewScript1
{
static 
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();	
	 Thread.sleep(4000);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("iphone 13 pro max");
	List<WebElement> AllLinks=driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
	int count=AllLinks.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
		String Text=AllLinks.get(i).getText();
		System.out.println(Text);
	}
	AllLinks.get(6).click();
	}

}

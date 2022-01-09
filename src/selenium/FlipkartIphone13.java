package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphone13 
{
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(8000);
	driver.findElement(By.name("q")).sendKeys("iphone13pro max");
	Thread.sleep(2000);
	List<WebElement> allsuggestion = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
    int count=allsuggestion.size();
    System.out.println(count);
	for(int i=0; i<count;i++)
	{
		String text=allsuggestion.get(i).getText();
		System.out.println(text);
	}
	driver.close();
	}

}

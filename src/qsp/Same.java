package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Same 
{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
driver.get("https://www.seleniumhq.org/");
String link=driver.getCurrentUrl();
if(link.contains("selenium.dev"))
{
	System.out.println("url is same");
}
else
{
	System.out.println("url is diffrent");
}
driver.quit();
	}

}

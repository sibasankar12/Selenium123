package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {
static
		{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.naukri.com/");
	driver.quit();
	}
}

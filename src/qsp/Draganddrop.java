package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop 
{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement rsc = driver.findElement(By.partialLinkText("Resources"));
         Actions a=new Actions(driver);
         a.moveToElement(rsc).perform();
 	    driver.findElement(By.partialLinkText("Customers")).click();
 	    WebElement stry = driver.findElement(By.xpath("//a[contains(text(),'READ FULL STORY')]"));
        Actions a1=new Actions(driver);
        a1.doubleClick(stry).perform();
        String ttle = driver.getTitle();
        System.out.println(ttle);
	driver.close();
        }
        
        
	}

}

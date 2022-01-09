package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Claertrip1 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).sendKeys("Bangalore");
		//Actions a= new Actions(driver);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'Bangalore, IN')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).sendKeys("Goa");
		driver.findElement(By.xpath("//p[contains(text(),'Goa, IN')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']")).click();
		driver.findElement(By.xpath("(//div[contains(text(),'31')])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='col flex flex-middle'])[5]")).click();

		Thread.sleep(10000);

		List<WebElement> details = driver.findElements(By.xpath("//div[@class='bar']/../div[8]/div/div/div[2]/div/div/div/div/img"));
		int count = details.size();
		System.out.println(count);
		
		//div[@class='bar']/../div[8]//img

		for(int i=0;i<count;i++)
		{
			String flight = details.get(i).getAttribute("alt");
			System.out.println(flight);
		}
		
		driver.close();
	}



	}



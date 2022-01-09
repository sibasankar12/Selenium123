package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukriupload 
{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException 
	{
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.naukri.com/");
    Thread.sleep(7000);
    driver.findElement(By.xpath("//label[contains(text(),'Upload CV')]")).sendKeys("C:\\Users\\DELL\\eclipse-workspace\\Automation\\data\\Siba Sankar Sahu resume....docx");
    
    
	}

}

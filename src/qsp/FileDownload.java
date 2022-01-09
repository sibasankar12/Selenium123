package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload 
{
static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
}
	public static void main(String[] args) throws AWTException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.linkText("4.1.0")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.close();
		
        
	}

}

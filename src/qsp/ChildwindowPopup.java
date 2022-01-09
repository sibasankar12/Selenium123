package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildwindowPopup 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	String wh=driver.getWindowHandle();
	Set<String>allwh=driver.getWindowHandles();
	for(String wh1: allwh)
	{
		driver.switchTo().window(wh1);
		String title=driver.getTitle();
		System.out.println(title);
	if(wh.equals(allwh))
	{
	 driver.close(); 	
	}

	}
	}
}



package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 
{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();	
     driver.get("https://www.google.co.in/");
    String link= driver.getCurrentUrl();
    System.out.println(link);
     if(link.contains("google.com"))
     {
    	 System.out.println("same url");
     }
     else
     {
    	 System.out.println("different url");
     }
     driver.close();
	}

}

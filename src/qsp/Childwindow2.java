package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow2 
{
static {
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException
	{
	 System.out.println("Enter the title to be closed");
	 Scanner sc=new Scanner(System.in);
	 String exepectedTitle= sc.nextLine();
	 Thread.sleep(7000);
		WebDriver driver=new ChromeDriver();
	  driver.get(" https://www.naukri.com/");
	  Set<String>allwh=driver.getWindowHandles();
	  for(String wh : allwh)
	  {
		  driver.switchTo().window(wh);
		  String actualtitle= driver.getTitle();
	if(!(actualtitle.equals(exepectedTitle)))
	  {
       driver.close();
	  }
		
		
	  }
	 
	}
	}

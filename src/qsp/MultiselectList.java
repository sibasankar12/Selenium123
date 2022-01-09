package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectList 
{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) 
	{
  WebDriver driver=new ChromeDriver();	
  driver.get("file:///C:/Users/DELL/OneDrive/Desktop/Handeling%20Multiple%20Exception.html");
  WebElement Mtrlist = driver.findElement(By.id("mtr"));
  Select s=new Select(Mtrlist);
  List<WebElement>alloptions=s.getOptions();
  int count=alloptions.size();
  System.out.println(count);
  for(WebElement option : alloptions)
  {
	String text=option.getText();
	  System.out.println(text);
  }

	}

}

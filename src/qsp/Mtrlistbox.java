package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mtrlistbox 
{
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/DELL/OneDrive/Desktop/Handeling%20Multiple%20Exception.html");
        WebElement mtrlistbox=driver.findElement(By.id("cp"));
         Select s=new Select(mtrlistbox);
         List<WebElement>alloptions=s.getOptions();
         int count=alloptions.size();
         System.out.println(count);
         for(int i=0;i<count;i++)
         {
        	String text= alloptions.get(i).getText();
        	System.out.println(text);
         }
	driver.quit();
	}

}

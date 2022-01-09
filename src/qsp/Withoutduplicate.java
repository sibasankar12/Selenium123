package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Withoutduplicate 
{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/DELL/OneDrive/Desktop/Handeling%20Multiple%20Exception.html");
     WebElement mtrlistbox=driver.findElement(By.id("mtr"));
     Select s=new Select(mtrlistbox);
     List<WebElement> alloptions=s.getOptions();
    int count= alloptions.size();
    System.out.println(count);
    HashSet<String>hs=new HashSet<>();
    for(int i=0;i<count;i++) {
    	String text=alloptions.get(i).getText();
    	hs.add(text);
    }
    for(String text:hs)
    {
    	System.out.println(text);
    }
    driver.close();
	}
}
	
	



package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicate1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("file:///C:/Users/DELL/OneDrive/Desktop/Handeling%20Multiple%20Exception.html");
WebElement mtrlist=driver.findElement(By.id("mtr"));
Select s=new Select(mtrlist);
List<WebElement> alloptions=s.getOptions();
int count=alloptions.size();
System.out.println(count);
if(s.isMultiple()==true)
{
s.deselectAll();
}
driver.close();
	}

}

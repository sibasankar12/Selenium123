package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenPopup 
{
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException 
	{
WebDriver driver=new ChromeDriver();
driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
driver.findElement(By.id("policynumber")).sendKeys("123");
driver.findElement(By.id("dob")).click();
WebElement dob = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
Select s=new Select(dob);
s.selectByValue("9");
WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
Select s1=new Select(year);
s1.selectByValue("1994");
driver.findElement(By.xpath("(//a[@class='ui-state-default'])[12]")).click();
driver.findElement(By.id("alternative_number")).sendKeys("8917412959");
driver.findElement(By.id("renew_policy_submit")).submit();
Thread.sleep(5000);
String text=driver.findElement(By.xpath("//p[@class='ValidationErrorsBot']")).getText();
System.out.println(text);
String message="lapsed";
if(text.contains(message))
{
	System.out.println("pass");
}
else {
	System.out.println("fail");
}
driver.close();

	}

}

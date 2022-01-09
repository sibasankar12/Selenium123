package selenium;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckboxWebapp {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args)
	{
		System.out.println("enter the url");
		Scanner sc=new Scanner(System.in);
         String url=sc.nextLine();
         WebDriver driver=new ChromeDriver();
         driver.get(url);
         List<WebElement> cbox = driver.findElements(By.xpath("//input[@type='checkbox ']"));
	    int count=cbox.size();
	    System.out.println(count);
	for(int i=0;i<count;i++)
{
    String text = cbox.get(i).getText();
    System.out.println(text);
}
	driver.close();
	}

	
	

}

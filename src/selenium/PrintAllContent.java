package selenium;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllContent {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args)
	{
		System.out.println("Enter the url");
		Scanner sc=new Scanner(System.in);
		String url=sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		List<WebElement> content = driver.findElements(By.xpath("//td"));
        int count=content.size();
        System.out.println(count);
        for(int i=0;i<count;i++)
        {
        	String text = content.get(i).getText();
        	System.out.println(text);
        }
	   driver.close();                         
	}

}

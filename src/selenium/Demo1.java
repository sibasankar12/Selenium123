package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.acttime.generics.WebdriverCommonLab;

public class Demo1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebdriverCommonLab w=new WebdriverCommonLab();
        w.WaitForPageLoad(driver);
        w.WaitForElementVisible(driver, element);
        w.CustomWait(element);
        w.SelectOption(element, 1);
        w.selectOption(element, "idly");
	}

}

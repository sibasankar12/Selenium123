package com.acttime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 *This is generic method for Webdriver.
 * @author Sibasankar
 *
 */
public class WebdriverCommonLab {
/**
 * This is the  generic method for implicit wait for page to load. 
 * @param driver
 */
	public  void WaitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * This is a generic method for Explicit wait for Element to load .
	 * @param driver
	 * @param element
	 */
	public void WaitForElementVisible(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * Custom wait for Element to Displayed.
	 * @param element
	 */
		public void CustomWait(WebElement element)
		{
			int i=0;
			while(i<1000)
			{
				try
				{
					element.isDisplayed();
					break;
				}
				catch(Exception e)
				{
					i++;
				}
			}
		}
		/**
		 * Select the value from the  listbox  based on the index. 
		 * @param element
		 * @param i
		 */
      public void SelectOption(WebElement element,int i)
      {
    	  Select s=new Select(element);
    	  s.selectByIndex(i);
      }
      /**
       * Select the value from the listbox based  on the text.
       * @param element
       * @param text
       */
      public void selectOption(WebElement element,String text)
{
    	  Select s=new Select(element);
    	  s.selectByVisibleText(text);
}
}

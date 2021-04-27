package Capgimni.qa.humana.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class elementUtil  
{
	WebDriver driver;
	
	public elementUtil(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getTitleutil()
	{
		return driver.getTitle();
	}
	
	public void sendUtil(By locator, String value)
	{
		 driver.findElement(locator).sendKeys(value);;
	}
	
	public void clickbtnutil(By locator)
	{
		driver.findElement(locator).click();
	}
	
	public WebElement webelement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public void choicelist(By locator, String... value)
	{
		List<WebElement> choice = driver.findElements(locator);
		
		for(int i=0; i<choice.size(); i++)
		{
			String text = choice.get(i).getText();
			System.out.println(text);
			
			for(int j=0; j<value.length; j++)
			{
				if(choice.equals(value[j]))
				{
					choice.get(i).click();
					break;
				}
			}
		}
	}
	
  public Actions actionclass(WebElement locator)
  {
	  Actions act = new Actions(driver);
	 return act.moveToElement(locator);
  }
	
}

package Capgimni.qa.humana.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Capgimni.qa.humana.Basepage.BasePage;
import Capgimni.qa.humana.utility.elementUtil;

public class Homepage extends BasePage
{
	BasePage basepage;
	WebDriver driver;
	elementUtil ele;
	
	By order = By.linkText("Orders");
	By dashboard = By.linkText("Dashboard");
	By holdings = By.linkText("Holdings");
	By chart = By.xpath("(//span[@data-balloon=\"Open chart\"])[1]");
	By dropdown = By.xpath("//span[@class=\"user-id\"]");
	
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
		ele = new elementUtil(driver);
	}
	
	public String getTitle()
	{
		return ele.getTitleutil();
	}
	
	public boolean verifylinkorder()
	{
		 return ele.webelement(order).isEnabled();
	}
	public boolean verifylinkdash()
	{
		 return ele.webelement(dashboard).isEnabled();
	}
	
	public boolean verifylinkhold()
	{
		 return ele.webelement(holdings).isEnabled();
	}
	
	public boolean verifychartclicable()
	{
		return ele.webelement(chart).isEnabled();
	}
	
	public void dropdown()
	{
		driver.findElement(dropdown).click();		
	}
		
	
}

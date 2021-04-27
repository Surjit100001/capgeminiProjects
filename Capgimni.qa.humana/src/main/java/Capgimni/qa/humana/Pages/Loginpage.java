package Capgimni.qa.humana.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Capgimni.qa.humana.Basepage.BasePage;
import Capgimni.qa.humana.utility.elementUtil;

public class Loginpage extends BasePage
{
	WebDriver driver;
	BasePage basepage;
	Properties prop;
	elementUtil ele;
	
	    By username = By.xpath("//input[@type='text']");
		By password = By.xpath("//input[@type='password']");
		By submitbtn = By.xpath("//button[@type='submit']");  
		By pins = By.xpath("//input[@id='pin']");
		By submitbtn2 = By.xpath("//button[@type='submit']");
		
		public Loginpage(WebDriver driver)
		{
			this.driver = driver;
			ele = new elementUtil(driver);
		}
		
		public String getTitle()
		{
			return ele.getTitleutil();
		}
		
		
		public Homepage dologin(String user, String pass, String pin )
		{
		  ele.sendUtil(username, user);
		  ele.sendUtil(password, pass);
		  ele.clickbtnutil(submitbtn);
		  ele.sendUtil(pins, pin);
		  ele.clickbtnutil(submitbtn2);
		  
		  return new Homepage(driver);
		 
		  
		
		}
		
		
}

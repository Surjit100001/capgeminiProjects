package Capgimni.qa.humana.PagesTest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Capgimni.qa.humana.Basepage.BasePage;
import Capgimni.qa.humana.Pages.Loginpage;
import Capgimni.qa.humana.utility.elementUtil;

public class LoginpageTest 
{
	BasePage basepage;
	WebDriver driver;
	Properties prop;
	Loginpage loginpage;
	elementUtil ele;
	
	@BeforeMethod
	public void brosetup()
	{
		basepage = new BasePage();
		prop = basepage.int_properties();
		String Browsername = prop.getProperty("browser");
		driver = basepage.int_browser(Browsername);
		driver.get(prop.getProperty("url"));
		loginpage = new Loginpage(driver);
	}
	
	@Test
	public void getTitleTest()
	{
		String title = loginpage.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Kite - Zerodha's fast and elegant flagship trading platform");
	}
	
	
	
	@Test
	public void dologinTest()
	{
	
		loginpage.dologin(prop.getProperty("email"), prop.getProperty("pass"), prop.getProperty("pin"));
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}

package Capgimni.qa.humana.PagesTest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Capgimni.qa.humana.Basepage.BasePage;
import Capgimni.qa.humana.Pages.Homepage;
import Capgimni.qa.humana.Pages.Loginpage;
import Capgimni.qa.humana.utility.elementUtil;

public class HomepageTest 
{
	WebDriver driver;
	BasePage basepage;
	Properties prop;
	elementUtil ele;
	Loginpage loginpage;
	Homepage homepage;
	
	@BeforeMethod
	public void setuphome()
	{
		basepage = new BasePage();
		prop = basepage.int_properties();
		String Browsername = prop.getProperty("browser");
		driver = basepage.int_browser(Browsername);
		driver.get(prop.getProperty("url"));
		loginpage = new Loginpage(driver);
		homepage = loginpage.dologin(prop.getProperty("email"), prop.getProperty("pass"), prop.getProperty("pin"));
		homepage = new Homepage(driver);
	}
	
	@Test
	public void getTitleTest()
	{
		String title = homepage.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Dashboard / Kite");
		
	}
	
	@Test
	public void verifylinkorderTest()
	{
		Assert.assertTrue(homepage.verifylinkorder());
	}
	
	@Test
	public void verifylinkdasTest()
	{	
		Assert.assertTrue(homepage.verifylinkdash());
	}
	
	@Test
	public void verifylinkhold()
	{
		Assert.assertTrue(homepage.verifylinkhold());
	}
	
	@Test
	public void verifychartTest()
	{
		Assert.assertTrue(homepage.verifychartclicable());
	}
	
	@Test()
	public void dropdownTest()
	{
		homepage.dropdown();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}

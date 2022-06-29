package prsTest;

import org.testng.annotations.Test;

import base.Base;
import pomKiteZerodha.LogInPage;
import pomKiteZerodha.Watchlist;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest extends Base {
	
	WebDriver driver;
	LogInPage loginpage;
	Watchlist marketwatch;
	
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browser)
	{
		if(browser.equals("ChromeBrowser"))
		{
			driver=openChromeBrowser();
		}
		if(browser.equals("FireFoxBrowser"))
		{
			driver=openFirefoxBrowser();
		}
	}
	
	@BeforeClass
	  public void beforeClass() {
		 
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
	  }
	
	 @BeforeMethod
	  public void beforeMethod() {
		  driver.get("https://kite.zerodha.com");
			
			 loginpage=new LogInPage(driver);
			 marketwatch=new Watchlist(driver);
	  }
	
  @Test
  public void f() throws InterruptedException {
	  loginpage.login();
	  marketwatch.setting();
		marketwatch.change();
		marketwatch.changeFormat();
		marketwatch.checkBox();
		
		String url=driver.getCurrentUrl();
	    System.out.println(url);
		if(url.equals("https://kite.zerodha.com/dashboard"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	  
	  loginpage.logout();
	  
  }

  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

  
  

}

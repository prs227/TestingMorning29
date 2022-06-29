package orangeTest;

import org.testng.annotations.Test;

import base.Base;
import pomOrange.LogInPage;
import pomOrange.MyInfo;
import pomOrange.MyLeave;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class OrangeTest extends Base{
	
	WebDriver driver;
	MyLeave myleave;
	LogInPage login;
	String artb;
	boolean result;
	
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
			
			driver.get("https://opensource-demo.orangehrmlive.com");
	  }
	 
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
		  login= new LogInPage(driver);
		  myleave=new MyLeave(driver);
		  login.login();
		  myleave.myleave();
		 
		  
	  }
  
  @Test
  public void testB() throws InterruptedException
  {   
	  myleave.from(); 
	  System.out.println(artb);
	  //String actual=artb;
	  
	//Assert.assertEquals(actual, "ui-state-default ui-state-highlight ui-state-active", "Diffrent");
  }
  @Test
  public void testC() throws InterruptedException
  {
	  myleave.all();
	  System.out.println(result);
	  //Assert.assertEquals(result, "true", "Checked");
  }
  @Test
  public void testD() throws InterruptedException
  {
	  myleave.save();
	  System.out.println(result);
	  //Assert.assertEquals(result, "true", "Enabled");
  }
  @Test
  public void testE() throws InterruptedException
  {
	  MyInfo photo=new MyInfo(driver);
	  photo.photoupload("C:\\Users\\Admin\\Desktop\\Automation\\istockphoto-517998264-612x612.jpg");
  }
  
  

  @AfterMethod
  public void afterMethod() {
	  
	  login.logout();
	  
  }
  
 

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
 
  

}

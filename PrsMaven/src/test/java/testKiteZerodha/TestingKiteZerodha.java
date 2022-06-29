package testKiteZerodha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pomKiteZerodha.LogInPage;
import pomKiteZerodha.Watchlist;

public class TestingKiteZerodha {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\Automation\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com");
		
		LogInPage loginpage=new LogInPage(driver);
		loginpage.login();
		
		
		
		Watchlist marketwatch=new Watchlist(driver);
		//marketwatch.marketwatch();
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

}

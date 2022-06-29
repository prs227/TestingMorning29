package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomOrange.LogInPage;
import pomOrange.MyLeave;

public class Testing {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chrome driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		
		
		LogInPage login=new LogInPage(driver);
		login.login();
		
		MyLeave myleave=new MyLeave(driver);
		myleave.all();
		boolean result = false ;
		System.out.println(result);
	}

}

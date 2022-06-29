package pomOrange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage 
{

	@FindBy (xpath ="//input[@id=\"txtUsername\"]") 
	private WebElement userName;
	
	@FindBy (xpath ="//input[@id=\"txtPassword\"]") 
 	private WebElement password;
	
	@FindBy (xpath ="//input[@name='Submit']") 
	private WebElement loginButton;
	
	@FindBy (xpath ="//a[@id=\"welcome\"]") 
	private WebElement welcome;
	
	@FindBy (xpath ="//a[text()=\"Logout\"]") 
	private WebElement logout;
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void login()
	{
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		loginButton.click();
	}
	
	public void logout()
	{
		welcome.click();
		logout.click();
	}

}
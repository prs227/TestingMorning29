package pomKiteZerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {
	
	@FindBy (xpath ="//input[@id='userid']") 
	private WebElement userID;
	
	@FindBy (xpath ="//input[@id='password']") 
	private WebElement password;
	
	@FindBy (xpath ="//button[text()='Login ']") 
	private WebElement loginButton;
	
	@FindBy (xpath ="//input[@id='pin']") 
	private WebElement pin;
	
	@FindBy (xpath ="//button[text()='Continue ']") 
	private WebElement continu;
	
	@FindBy (xpath ="//span[text()='FZ1723']") 
	private WebElement username;
	
	@FindBy (xpath ="//a[@target='_self']") 
	private WebElement logout;
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void login()
	{
		userID.sendKeys("FZ1723");
		password.sendKeys("Prs@2271996");
		loginButton.click();
		
		wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys("220796");
		continu.click();
		
	}
	
	public void logout()
	{
		username.click();
		logout.click();
	}
	
	
	

}

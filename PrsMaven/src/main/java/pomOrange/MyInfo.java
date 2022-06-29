package pomOrange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfo {
	
	 
	@FindBy (xpath ="//a[@id=\"menu_pim_viewMyDetails\"]") 
	private WebElement myInfo;
	
	@FindBy (xpath ="//img[@alt=\"Employee Photo\"]") 
	private WebElement photo;  
	
	@FindBy (xpath ="//input[@id=\"photofile\"]") 
	private WebElement choosefile;
	
	@FindBy (xpath ="//input[@id=\"btnSave\"]") 
	private WebElement upload;
	
	public MyInfo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void photoupload(String path)
	{
		myInfo.click();
		photo.click();
		choosefile.sendKeys(path);
		upload.click();
	}
}

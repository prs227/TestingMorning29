package pomKiteZerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Watchlist {
	
	@FindBy (xpath ="//span[@class='icon icon-bookmark']") 
	private WebElement marketwatch;
	
	@FindBy (xpath ="//span[@class='settings-button icon icon-settings']") 
	private WebElement settingButton;  
	
	@FindBy (xpath ="//span[text()='Sort by']") 
	private WebElement sortBy;
	
	@FindBy (xpath ="(//button)[1]") 
	private WebElement sortAtoZ;
	
	@FindBy (xpath ="(//button)[2]") 
	private WebElement sortBychange;      
	
	@FindBy (xpath ="(//button)[3]") 
	private WebElement sortbyLTP;
	
	@FindBy (xpath ="(//button)[4]") 
	private WebElement sortbyEXH;
	
	@FindBy (xpath ="(//label)[1]") 
	private WebElement closePrice;
	
	@FindBy (xpath ="(//label)[2]") 
	private WebElement openPrice;
	
	@FindBy (xpath ="(//label)[3]") 
	private WebElement percentage;
	
	@FindBy (xpath ="(//label)[4]") 
	private WebElement absolute;
	
	@FindBy (xpath ="(//label)[5]") 
	private WebElement showDirection;
	
	@FindBy (xpath ="(//label)[6]") 
	private WebElement showChange;
	
	@FindBy (xpath ="(//label)[7]") 
	private WebElement showHoldings;
	
	public Watchlist(WebDriver driver3)
	{
		PageFactory.initElements(driver3, this);
	}
	
	public void marketwatch()
	{
		marketwatch.click();
	}
	
	public void setting() throws InterruptedException
	{
		settingButton.click();
		Thread.sleep(3000);
		boolean result=sortBy.isDisplayed();
		if(result)
		{
			System.out.println("PASS");
			String text=sortBy.getText();
			if(text.equals("Sort by"))
			{
				System.out.println("MATCHES");
				
			}
			else
			{
				System.out.println("NOTMATCHES");
			}
		}
		else
		{
			System.out.println("FAIL");
		}
		sortAtoZ.click();
		Thread.sleep(3000);
		sortBychange.click();
		Thread.sleep(3000);
		sortbyLTP.click();
		Thread.sleep(3000);
		sortbyEXH.click();
		Thread.sleep(3000);
	}
	
	public void change() throws InterruptedException
	{
		boolean result=closePrice.isSelected();
		if (result)
		{
			System.out.println("Close price is selected by default");			
		}
		else 
		{
			System.out.println("Close price is not selected by default");
		}
		Thread.sleep(3000);
		openPrice.click();
		Thread.sleep(3000);
		closePrice.click();
		Thread.sleep(3000);
	}
	
	public void changeFormat() throws InterruptedException
	{
		boolean result= percentage.isSelected();
		if (result)
		{
			System.out.println("Percentage is selected by default");
		}
		else 
		{
			System.out.println("Percentage is not selected by default");	
		}
		Thread.sleep(3000);
		absolute.click();
		Thread.sleep(3000);
		percentage.click();
		Thread.sleep(3000);
	}
	
	public void checkBox() throws InterruptedException
	{
		boolean result= showDirection.isSelected();
		if (result)
		{
			System.out.println("ShowDirection is selected by default");
		}
		else 
		{
			System.out.println("ShowDirection is not selected by default");	
		}
		Thread.sleep(3000);
		showDirection.click();
		result= showChange.isSelected();
		if (result)
		{
			System.out.println("ShowChange is selected by default");
		}
		else 
		{
			System.out.println("ShowChange is not selected by default");	
		}
		Thread.sleep(3000);
		showChange.click();
		result= showHoldings.isSelected();
		if (result)
		{
			System.out.println("ShowHoldings is selected by default");
		}
		else 
		{
			System.out.println("ShowHoldings is not selected by default");	
		}
		Thread.sleep(3000);
		showHoldings.click();
	}

}

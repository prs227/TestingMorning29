package pomOrange;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.Assert;

public class MyLeave {
	
			
			@FindBy (xpath ="(//td//div//a//img)[5]") 
			private WebElement myleave;
			
			@FindBy (xpath ="//input[@type='checkbox']") 
			private WebElement all;  
			
			@FindBy (xpath ="//input[@id=\"calFromDate\"]") 
			private WebElement fromDate;
			
			@FindBy (xpath ="//select[@class=\"ui-datepicker-month\"]") 
			private WebElement monthfrom;
			
			@FindBy (xpath ="//select[@class=\"ui-datepicker-year\"]") 
			private WebElement yearfrom;
			
			@FindBy (xpath ="(//a[contains(@class,'ui-state-default')])[23]") 
			private WebElement defaultdate;  
			
			@FindBy (xpath ="(//a[contains(@class,'ui-state-default')])[22]") 
			private WebElement datefrom;
			
			@FindBy (xpath ="(//img[@class=\\\"ui-datepicker-trigger\\\"][2])") 
			private WebElement to;
			
			@FindBy (xpath ="//input[@id=\"btnSave\"]") 
			private WebElement save;
			
			WebDriver driver;
			String atrb;
			boolean result;
			
			public MyLeave(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
				this.driver=driver;
			}
			
			public void myleave() throws InterruptedException
			{
				boolean result=myleave.isEnabled();
				if(result)
				{
					Thread.sleep(3000);
					myleave.click();
				}
				else
				{
					System.out.println("Not Enabled");
				}
			}
			
			public void from() throws InterruptedException
			{
				fromDate.click();
				 atrb=defaultdate.getAttribute("class");
				
				
				
				Select m=new Select(monthfrom);
				Select y=new Select(yearfrom);
				Thread.sleep(3000);
				m.selectByVisibleText("Jul");
				Thread.sleep(3000);
				y.selectByVisibleText("2021");
				Thread.sleep(3000);
				datefrom.click();	
			}
			
			public void all()
			{
				result=all.isSelected();
				
			}
			
			public void save() throws InterruptedException
			{
				JavascriptExecutor je=(JavascriptExecutor)driver;
				je.executeScript("arguments[0].scrollIntoView(true);",save);
				result=save.isEnabled();
				
				
			}
			
			
			
}

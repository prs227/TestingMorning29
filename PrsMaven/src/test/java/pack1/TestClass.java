package pack1;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestClass {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chrome driver\\chromedriver.exe");
		
String path="C:\\Users\\Admin\\Desktop\\Book123.xlsx";

FileInputStream file= new  FileInputStream(path);
String data= WorkbookFactory.create(file).getSheet("prs").getRow(3).getCell(0).getStringCellValue();
System.out.println(data);

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//DropDown///////////////////////////////////////////
		driver.get("https://www.facebook.com/r.php");
		WebElement day=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		WebElement year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		
		Thread.sleep(2000);
		Select d=new Select(day);
		d.selectByIndex(21);
		
		Thread.sleep(2000);
		Select m=new Select(month);
		m.selectByVisibleText("Jul");
		
		Thread.sleep(2000);
		Select y=new Select(year);
		y.selectByValue("1996");
		//DropDown//////////////////////////////////////////
		
		//is selected, is dispayed/////////////////////////
		
	     WebElement female=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		 WebElement male=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		 WebElement custom=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		 WebElement genderoptional=driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		
		female.click();
		boolean result=female.isSelected();
		if(result)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not");
		}
		
		result=genderoptional.isDisplayed();
		if (result)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("NO");
			custom.click();
			result=genderoptional.isDisplayed();
			if (result)
			{
				System.out.println("yes 2");
			}
			
		}
		String id=custom.getAttribute("id");
		System.out.println(id);
		//is selected, is dispayed/////////////////////////
		
		//excelsheet
		
		WebElement firstname=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		WebElement surname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		 WebElement mobilenumber=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		 WebElement password=driver.findElement(By.xpath("(//input[@type='password'])"));
		
		 //String path="C:\\Users\\Admin\\Desktop\\Book123.xlsx";
		 
		 //FileInputStream file= new  FileInputStream(path);
		//String data= WorkbookFactory.create(file).getSheet("prs").getRow(3).getCell(0).getStringCellValue();
		 
		 
		 
		 
		 
		 
		 
		 
	}
}

package testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String path="C:\\Users\\Admin\\Desktop\\Book123.xlsx";
	FileInputStream file=new FileInputStream(path);
	
	String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	
	System.out.println(data);
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chrome driver\\chromedriver.exe");
	
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://www.facebook.com/signup");
	 WebElement signup=driver.findElement(By.xpath("//div//button[1]"));
	 
	boolean result= signup.isEnabled();
	System.out.println(result);
	 
}
}

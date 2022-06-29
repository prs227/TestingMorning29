import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Testing {
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Automation\\chrome driver\\chromedriver.exe");
		
//		WebDriver driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	driver.get("https://kite.zerodha.com/");
//		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	File destFile= new File("C:\\Users\\Admin\\Desktop\\New folder (2)\\Test123.jpg");
//	FileUtils.copyFile(srcFile, destFile);
	
	String path= "C:\\Users\\Admin\\Desktop\\Book123.xlsx";
	FileInputStream file= new FileInputStream(path);
	String value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
	}

}

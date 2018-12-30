package executionEngine;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.ActionKeyWords;
import utility.ExcelUtilities;

public class DriverScript {

	//private static WebDriver driver = null;

	public static void main(String args[]) throws IOException {

		
		String Workbookname ="DataEngine";
		String sheetname = "TestSteps";
			
		ExcelUtilities.setExcelFile(Workbookname, sheetname);
		
		for(int irowNum = 1; irowNum < 8; irowNum++) {
			
			if(ExcelUtilities.getCellData(irowNum, 3).contains("open_Browser")){
				ActionKeyWords.open_Browser();
				
			}else if(ExcelUtilities.getCellData(irowNum, 3).contains("start_Url")) {
				ActionKeyWords.start_Url();
			}else if(ExcelUtilities.getCellData(irowNum, 3).contains("myAccount")) {
				ActionKeyWords.myAccount();
			}else if(ExcelUtilities.getCellData(irowNum, 3).contains("enter_Uname")) {
				ActionKeyWords.enter_Uname();
			}else if(ExcelUtilities.getCellData(irowNum, 3).contains("enter_Password")) {
				ActionKeyWords.enter_Password();
			}else if(ExcelUtilities.getCellData(irowNum, 3).contains("click_Login")) {
				ActionKeyWords.click_login();
			}else if(ExcelUtilities.getCellData(irowNum, 3).contains("close_Browser")) {
				ActionKeyWords.close();
			}else {
				
				System.out.println("Could not find the Action KeyWords - Please revist the Action KeyWords");
			}
			
		}
//		System.setProperty("webdriver.driver.chromedriver", System.getProperty("user.dir") + "\\chromedriver.exe");
//		driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://store.demoqa.com/");
//		driver.findElement(By.xpath("//div[@id='account']/a")).click();
//		driver.findElement(By.xpath("//input[@id='log']")).sendKeys("testuser_3");
//		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Test@123");
//		driver.findElement(By.xpath("//input[@id='login']"));
//		driver.quit();

	}
}

package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeyWords {

	public static WebDriver driver = null;

	public static void open_Browser() {

		System.setProperty("webdriver.driver.chromedriver", System.getProperty("user.dir") + "\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void start_Url() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://store.demoqa.com/");
	}

	public static void myAccount() {

		driver.findElement(By.xpath("//div[@id='account']/a")).click();
	}

	public static void enter_Uname() {

		driver.findElement(By.xpath("//input[@id='log']")).sendKeys("testuser_3");
	}

	public static void enter_Password() {

		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Test@123");
	}
	
	public static void click_login() {

		driver.findElement(By.xpath("//input[@id='login']"));
	}
	
	public static void close() {

		driver.close();
	}

}

package Utility;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class webutili extends JavaUtili {
	
	public static WebDriver driver = null;
	public static ExtentHtmlReporter html = null;
	public static ExtentReports report = null;
	
	
       public static void buttonclick(WebElement element) {
	
		  	element.click();    	
		}

		public static void browserclose() {
			
			driver.close();
		}
		public static void keyInput(WebElement element, String value) {
			
			element.sendKeys(value);
		}
		public static String keyOutput(WebElement element) {
			
			
			String value = element.getText();
			return value;
			
		}
		public static String urlOutput() 
		{
			String value = driver.getCurrentUrl();	
			return value;
			}
		public static String getURL() {
			
			String value = driver.getCurrentUrl();
			
			return value;
		}
		
		public static void waitImplicit(WebElement element, int value) {
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(value));
		}
		
		public static void waitExplicit(WebElement element, int value) {
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(value));
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		public static void dropdown(WebElement element, String value) {
			
			Select sel = new Select(element);
			sel.selectByVisibleText(value);
		}
		
		public static void Alextbox(WebElement element) {
			driver.switchTo().alert().accept();
		}
	
}



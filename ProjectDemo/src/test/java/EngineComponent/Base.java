package EngineComponent;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import Utility.webutili;

public class Base extends webutili {
	@Test
   @BeforeSuite(alwaysRun = true)
   public static void openbrowser() {
	   
	   driver = new ChromeDriver();
		
		//driver.get("https://www.demoblaze.com/");
		
		html = new ExtentHtmlReporter(System.getProperty("user.dir" ) + "/ExtentReport.html");
		report = new ExtentReports();
		report.attachReporter(html);
   }
	@Test
	@BeforeTest(alwaysRun = true)
   
	public void browserminimize() {
    	
    	driver.manage().window().maximize();
	}
    @Test
    @BeforeClass(alwaysRun = true)
    
    public void openlink() throws Throwable  {
    	
    
			driver.get(openURL("https://www.demoblaze.com/"));
			
			System.out.println("open browser");
			
    }
   
    @Test
    @AfterTest(alwaysRun = true)
    
    public void closebrowser() {
    	
    	driver.close();
    }

}

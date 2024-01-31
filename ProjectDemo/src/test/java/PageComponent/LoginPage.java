package PageComponent;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Utility.webutili;

public class LoginPage extends webutili {
	
	WebElement userName;
	WebElement passWord;
	
	//pageFactory method

	@FindBy (id = "login2")
	WebElement loginbutton;
	
	@FindBy (id = "loginusername")
	WebElement userkey;
	
	@FindBy (id = "loginpassword")
	protected
	 static
	WebElement passkey;
	
	@FindBy (xpath = "//button[@buttonclick ='login()']")
    WebElement buttonclick;
	
	@FindBy (xpath = "//*[@id=\"loginusername\"]")
	WebElement keyoutput;
	
	public LoginPage() { //pagefactory constructor
		
		PageFactory.initElements(driver, this);
	}
	
	public void loginfun(String userkey, String passkey) {
		
		
		buttonclick(loginbutton);
		waitExplicit(loginbutton, 10);
		keyInput(userName,userkey);
	    keyInput(passWord,passkey);
		
		buttonclick(buttonclick);
		waitExplicit(buttonclick,10);
		
	String acutal = keyOutput(buttonclick);
	String eccepted = "welcome" + userkey;
	System.out.println(acutal);
	System.out.println(eccepted);
	Assert.assertEquals(acutal, eccepted);
	
	} 

	public static  String TakeScreenshot()  {
	    	
	    	TakesScreenshot ts = (TakesScreenshot)driver;
	    	
	    	File souce = ts.getScreenshotAs(OutputType.FILE);
	    	
	    	String location = System.getProperty("user.dir") + "/Screenshots/googlepage.png";
	    	
	    	File destination = new File(location);
	    	try {
				FileHandler.copy(souce, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return location;
	}
}
		
	

	
	
		
	

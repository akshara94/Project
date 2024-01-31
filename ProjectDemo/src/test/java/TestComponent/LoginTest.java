package TestComponent;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import PageComponent.LoginPage;


public class LoginTest extends LoginPage{
	
    @Test
	@Parameters({"userkey","passkey"})
	
	public static void loginTc01(String userkey, String passkey) {
		
		LoginPage obj = new LoginPage();
		obj.loginfun(userkey, passkey);
		//LoginPage.TakeScreenshot();
		
		System.out.println("ONE - FIRST");
		
		ExtentTest test = report.createTest("loginTc01");
		test.log(Status.PASS, "Login Successful");
		try {
         test.addScreenCaptureFromPath(TakeScreenshot());
		} catch(Exception e) {
			e.printStackTrace();
		}
	   report.flush();
	}
	
	@Test
	public void loginTc02() {
		
	    System.out.println("ONE - SECOND");
	}
}
		
		
	



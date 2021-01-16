package pom;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test
	public void ValidateloginwithinvalindCredentials() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.logininvalid("Admin122", "admin123");
		closebrowser();
	}
	@Test
	public void Validateloginwithblankusername() throws InterruptedException {
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.logininvalid("" , "admin123");
		closebrowser();
		Thread.sleep(20000);
	}
	@Test(groups = { "bonding" })
	public void Validateloginwithpasswordblank() throws InterruptedException {
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.logininvalid("Admin", "");
		closebrowser();
		Thread.sleep(20000);
	}
	@Test(groups = {  "strong_ties" })
	public void Validateloginwihtblanklogin() throws InterruptedException{
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.logininvalid("","");
		closebrowser();
		Thread.sleep(20000);
	}
}

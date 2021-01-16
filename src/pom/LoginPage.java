package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="txtUsername")
	WebElement userName;

	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	@FindBy(id ="spanMessage")
	WebElement spammessage;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void logininvalid(String user, String passwordname) {
		userName.sendKeys(user);
		password.sendKeys(passwordname);
		login.click();
		System.out.println(spammessage.getText());
	}
	
}

package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamaterTest {
	
	WebDriver  driver;
	
	@Test
	@Parameters("url")
	public void ParameterList(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\WEBDRIVER\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		//driver.findElement(By.id("txtUsername")).sendKeys(username);
		//driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}

}

package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicitexp {
			@Test
		public void explicit(){
			
				System.setProperty("webdriver.chrome.driver", "E:\\WEBDRIVER\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				WebDriverWait  wait = new WebDriverWait(driver,20); 
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				WebElement Login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnLogin")));
				Login.click();
				
		}
	
	
}



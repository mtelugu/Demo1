package pom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	WebDriver driver;
	@BeforeSuite
	public void  initialize() throws IOException {
		PropertyUtil.intialze();
		}
	@BeforeMethod
	public void launchBrowser() {
		String browsername = PropertyUtil.readProperty("browsername");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", PropertyUtil.readProperty("chromebrowser"));
			driver = new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", PropertyUtil.readProperty("firefoxbrowser"));
			 driver = new FirefoxDriver();
	}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
	
	@BeforeMethod(dependsOnMethods="launchBrowser")
	public void openapp() {
		driver.get(PropertyUtil.readProperty("url"));
	}
	public void closebrowser() {
		driver.close();
	}
	
}

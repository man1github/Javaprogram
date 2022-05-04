package maven.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgMethods {

	WebDriver driver;

	@Test(priority = 0, enabled = false)
	public void openEdureka() {
		driver.get("https://www.edureka.co/");
	}

	@BeforeSuite
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void openGoogle() {
		driver.get("https://www.google.com/");
	}

	@Test(priority = 3)
	public void openBing() {
		driver.get("https://www.bing.com/");
	}

	@Test(priority = 2)
	public void openyahoo() {
		driver.get("https://in.search.yahoo.com/");
	}

	@Test(priority = 4)
	public void openFacebook() {
		driver.get("https://www.facebook.com/");
	}

	@Test(priority = 5)
	public void opentwitter() {
		driver.get("https://twitter.com/i/flow/login");
	}

	@Test(priority = 6)
	public void openFlipkart() {
		driver.get("https://www.flipkart.com/");
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}

}

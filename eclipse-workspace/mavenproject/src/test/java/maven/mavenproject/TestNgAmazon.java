package maven.mavenproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgAmazon extends Driverclass {
	@Test
	public void amazonsearch() {

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("samsung mobile");
		searchBox.sendKeys(Keys.ENTER);

		WebElement mobileSelect = driver.findElement(By.xpath(
				"//*[@id=\'search\']/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		mobileSelect.click();

		Set<String> window2 = driver.getWindowHandles();
		for (String w : window2) {
			driver.switchTo().window(w);
		}
		
		WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
		addToCart.click();
		 
	}

	@BeforeMethod
	public void beforeMethod() {
		OpenDriver("https://www.amazon.in/");
	}
	@AfterMethod
	public void afterMethod() {
	//	closeBrowser(driver);
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}

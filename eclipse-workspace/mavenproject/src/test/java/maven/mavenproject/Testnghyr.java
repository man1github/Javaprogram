package maven.mavenproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testnghyr extends Driverclass{
  @Test
  public void f() throws InterruptedException {
	  
		 driver.findElement(By.id("firstName")).sendKeys("Manoj");
			
			//	Thread.sleep(3000);
				
				 driver.findElement(By.id("lastName")).sendKeys("M");
				
			//	Thread.sleep(3000);
				
				driver.findElement(By.id("malerb")).click();
				
			//	Thread.sleep(3000);
				
				driver.findElement(By.id("englishchbx")).click();
				
			//	Thread.sleep(3000);
				
				driver.findElement(By.id("email")).sendKeys("manoj.mukkan1@gmail.com");		
		    	Thread.sleep(3000);

				driver.findElement(By.id("clearbtn")).click();
				
			//	Thread.sleep(3000);
				
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  OpenDriver("https://www.hyrtutorials.com/p/basic-controls.html");
  }

  @AfterMethod
  public void afterMethod() {
	  closeBrowser(driver);
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

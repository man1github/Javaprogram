package maven.mavenproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNg extends Driverclass{
  @Test
  public void test1() {
	  System.out.println("test 1");

  }
  @Test
  public void test2() {
	  System.out.println("test 2");

  }
  
  @BeforeMethod
  public void beforeMethod() {
//	  OpenDriver("https://github.com/login");
	  OpenDriver("https://www.google.com/"); 

  }

  @AfterMethod
  public void afterMethod() {
	  closeBrowser(driver);
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }

}

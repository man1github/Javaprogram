package chrome1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub {
		
	public static void main(String[] args) throws InterruptedException  {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://github.com/login");
       driver.manage().window().maximize();
       
       WebElement login =  driver.findElement(By.id("login_field"));
       login.sendKeys("man1github");
       Thread.sleep(3000);
       
       WebElement password =  driver.findElement(By.id("password"));
       password.sendKeys("Manojgithub2");
       Thread.sleep(3000);

       WebElement signin =  driver.findElement(By.name("commit"));
       signin.click();
       
	}
	
	
	
	
	
//	public static void Highlight(WebDriver driver, WebElement element)  {
//		JavascriptExecutor jsExecuter = (JavascriptExecutor) driver;
//		jsExecuter.executeScript("argument[0].setAttribute('style','background:yellow;border:2px solid red;');", null)
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}

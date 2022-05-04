package chrome1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductInAmazon {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

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
  
		/*
		 * WebElement loginButton =
		 * driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']"));
		 * loginButton.click();
		 * 
		 * WebElement email = driver.findElement(By.id("ap_email"));
		 * email.sendKeys("manojmurali12345@gmail.com");
		 * 
		 * WebElement continueButton = driver.findElement(By.id("continue"));
		 * continueButton.click();
		 * 
		 * WebElement getOtp = driver.findElement(By.xpath("//*[@id=\'continue\']")); g
		 * etOtp.click();
		 */

	}

}

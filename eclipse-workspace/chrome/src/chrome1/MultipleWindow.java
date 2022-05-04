package chrome1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String oldwindow = driver.getWindowHandle(); 
		
		WebElement firstButton = driver.findElement(By.id("home"));
		firstButton.click();
		
		Set<String> window = driver.getWindowHandles();
		for (String w : window) {
			driver.switchTo().window(w);
		}
		System.out.println(driver.getTitle());
		
		WebElement editbox = driver.findElement(By.xpath("//*[text()='Edit']"));
		editbox.click();
		driver.close();
		
		driver.switchTo().window(oldwindow);
		
		WebElement openMultipleWindow = driver.findElement(By.xpath("//*[@onclick = 'openWindows()']"));
		openMultipleWindow.click();
		
		Set<String> window1 = driver.getWindowHandles();
		for (String string : window1) {
			driver.switchTo().window(string);	
		}
		
		int size = driver.getWindowHandles().size();
		System.out.println(size);
		driver.close();
		
		driver.switchTo().window(oldwindow);
		
		Thread.sleep(5000);
		WebElement delayOpen = driver.findElement(By.xpath("//*[@onclick = 'openWindowsWithWait();']"));
		delayOpen.click();
		
		driver.quit();
		
		

	}

}

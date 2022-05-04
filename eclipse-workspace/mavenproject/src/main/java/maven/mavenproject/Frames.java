package maven.mavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement ClickMe = driver.findElement(By.id("Click"));
		ClickMe.click();
		System.out.println(ClickMe.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement nestedFrame = driver.findElement(By.id("Click1"));
		nestedFrame.click();
		System.out.println(nestedFrame.getText());
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		
		int size = totalFrames.size();
		System.out.println(size);
		

	}

}

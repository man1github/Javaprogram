package chrome1;

import org.openqa.selenium.By;

public class BasicControls extends Driverclass {

	public static void main(String[] args) throws InterruptedException {

		OpenDriver("https://www.hyrtutorials.com/p/basic-controls.html");

		 driver.findElement(By.id("firstName")).sendKeys("Manoj");
		
	//	Thread.sleep(3000);
		
		 driver.findElement(By.id("lastName")).sendKeys("M");
		
	//	Thread.sleep(3000);
		
		driver.findElement(By.id("malerb")).click();
		
	//	Thread.sleep(3000);
		
		driver.findElement(By.id("englishchbx")).click();
		
	//	Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("manoj.mukkan11@gmail.com");		
	//	Thread.sleep(3000);

		driver.findElement(By.id("clearbtn")).click();
		
	//	Thread.sleep(3000);
		
		closeBrowser(driver);
		
		
		
		
		
		
		
	}

}

package rahulshetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CartAutomate {
	
	
	// Add 3 kg brocoll
	//add  5 kg  cucumberi
	
	@Test
	public void add_Tocart() throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("driver.chrome.driver", "C:\\Users\\52039252\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		int Brocolli=1;
		int Cucumber=5;
		while(Brocolli!=1) {
			driver.findElement(By.xpath("//div//div//div//div//div[1]//a[2]")).click();
			Brocolli--;
		}
		driver.findElement(By.xpath("//div//div//div//div//div[1]//div[3]//button[1]")).click();
		Thread.sleep(10000);
	while(Cucumber!=1) {
		driver.findElement(By.xpath("//div[3]//div[2]//a[2]")).click();
		Cucumber--;
	}
	driver.findElement(By.xpath("//div[2]//div[3]//button[1]]")).click();
	
	
	}

}

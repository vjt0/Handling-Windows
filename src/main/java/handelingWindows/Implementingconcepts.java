package handelingWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Implementingconcepts {
WebDriver driver;
	@Test
	public void tc1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\52039252\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.nilayvishwakarma.com/");
		String new_Window=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.xpath("//body/div/div/div/div/div/div/div[1]/div[1]/a[1]")).sendKeys(new_Window);
		//WebDriverWait wait =new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.)
		Thread.sleep(10000);
			Actions action =new Actions (driver);Thread.sleep(10000);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
	}
}

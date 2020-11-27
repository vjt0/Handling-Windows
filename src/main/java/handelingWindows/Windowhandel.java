package handelingWindows;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class Windowhandel {
	//a[contains(text(),'NEXT')]
	WebDriver driver;
	@Test
 public void getWindow() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\52039252\\Desktop\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.get("https://www.nilayvishwakarma.com/");
	 String newWindow=Keys.chord(Keys.CONTROL,Keys.RETURN);
	 String parent_Window=driver.getWindowHandle();
	// Actions action =new Actions(driver);
	 //action.moveToElement(driver.findElement(By.xpath("//body/div/div/div/div/div/div/div[1]/div[1]/a[1]"))).contextClick().build().perform();
	 //driver.findElement(By.xpath("//body/div/div/div/div/div/div/div[1]/div[1]/a[1]"))
	 Thread.sleep(1000000);
	 driver.findElement(By.xpath("//body/div/div/div/div/div/div/div[1]/div[1]/a[1]")).sendKeys(newWindow);
	 driver.findElement(By.xpath("//body/div/div/div/div/div/div/div[1]/div[2]/a[1]")).sendKeys(newWindow);
	 driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div[3]/a[1]")).sendKeys(newWindow);
	 driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div[4]/a[1]")).sendKeys(newWindow);
	 
	 Set<String> newwindow = driver.getWindowHandles();
	for(String nw:newwindow) {
		System.out.println(nw.toString());
		System.out.println(driver.switchTo().window(nw).getTitle());
	}
	driver.switchTo().window(parent_Window);
	 
	 WebDriverWait wait =new WebDriverWait(driver,20);
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'NEXT')]")));
	 while(driver.findElement(By.xpath("//a[contains(text(),'NEXT')]")).isEnabled()) {
		 try {
		 if (driver.findElement(By.xpath("//a[contains(text(),'NEXT')]")).isEnabled()==true){
			 
		 
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'NEXT')]")));
		 driver.findElement(By.xpath("//a[contains(text(),'NEXT')]")).click();}else {System.out.println("Cannot click furhter");
	 }}
	
		 catch(Exception e) {
		 System.out.println(e.getStackTrace());}
		 
	 
	
	//driver.get("https://www.nilayvishwakarma.com/posts/a-hope-for-a-dream");
	 //driver.close();
	 //Set<String> arr=driver.getWindowHandles();
	 
	 //for(String a :arr) {
		 //driver.switchTo().window(a);
		 
	// }
	 }}}
	

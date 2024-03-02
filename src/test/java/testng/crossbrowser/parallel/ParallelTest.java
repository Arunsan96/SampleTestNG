package testng.crossbrowser.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	@Test
	public void fblogin() throws InterruptedException {
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.facebook.com/");
   driver.findElement(By.id("email")).sendKeys("Arun");
   driver.findElement(By.id("pass")).sendKeys("Arun123");
   Thread.sleep(3000);
   driver.close();
	
}
	@Test
	public void searchjava() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com/");
		   driver.findElement(By.xpath("//*[@name='q']")).sendKeys("java",Keys.ENTER);
		   Thread.sleep(3000);
		   driver.close();
	}
	@Test
	public void searchSelenium() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		   driver.get("https://www.google.com/");
		   driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium",Keys.ENTER);
		   Thread.sleep(3000);
		   driver.close();
	}
	@Test
	public void AdactinLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		   driver.get("https://adactinhotelapp.com/");
		   driver.findElement(By.id("username")).sendKeys("san");
		   driver.findElement(By.id("password")).sendKeys("san@123");
		   Thread.sleep(3000);
		   driver.close();
	
	}
	
}



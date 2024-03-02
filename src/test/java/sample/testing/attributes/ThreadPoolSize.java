package sample.testing.attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadPoolSize extends BaseClass {

	@Test(invocationCount = 5,threadPoolSize = 2)
	public void Test1() throws Exception { 
		
		System.out.println("Thread Id : "+Thread.currentThread().getId());
		System.out.println("Thread Name "+Thread.currentThread().getName());
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("java", Keys.ENTER);
		driver.close();
		
		
//		browserLaunch("chrome", "https://www.google.com/");
//		findElementByXpath("//*[@name='q']").sendKeys("java",Keys.ENTER);
//		Thread.sleep(3000);
//		pageClose();
}
}
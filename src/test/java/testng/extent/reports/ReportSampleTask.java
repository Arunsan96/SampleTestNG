package testng.extent.reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import sample.testing.attributes.BaseClass;

public class ReportSampleTask extends BaseClass {

	@Test
	public void adactinlogin() throws InterruptedException {
		createtestName("Adactin login");
		
   WebDriver driver = new ChromeDriver();
    reportStatus("Pass", "browser opened");
		driver.get("https://adactinhotelapp.com/");
		
		if(driver.getCurrentUrl().equals("https://adactinhotelapp.com/")) {
		 	   reportStatus("Pass", "URL Launched");
		    }else {
		 	   reportStatus("Fail", "URL not launched");
		    }
		
		driver.findElement(By.id("username")).sendKeys("Muthu173");
		if(driver.findElement(By.id("username")).equals("Muthu173")){
		 	   reportStatus("Pass", "username correct");
		    }else {
		 	   reportStatus("Fail", "username incorrect");
		    }
		    
		driver.findElement(By.id("password")).sendKeys("4D0VYM");
		if(driver.findElement(By.id("password")).equals("4D0VYM")){
		 	   reportStatus("Pass", "password correct");
		    }else {
		 	   reportStatus("Fail", "password incorrect");
		 	   driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		driver.close();
	}
	}
}

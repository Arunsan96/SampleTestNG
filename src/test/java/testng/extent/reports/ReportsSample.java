package testng.extent.reports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import sample.testing.attributes.BaseClass;

public class ReportsSample extends BaseClass {

	@Test
	public void fblogin() throws InterruptedException {
		createtestName("Facebook Login");
		
   WebDriver driver = new ChromeDriver();
    reportStatus("Pass", "browser opened");
//    reportStatus("Fail", "sample fail");
//    reportStatus("warn", "sample warn");
//    reportStatus("info", "sample info");
    
    
    driver.get("https://adactinhotelapp.com/");
    Thread.sleep(2000);
    if(driver.getCurrentUrl().equals("https://adactinhotelapp.com/")) {
 	   reportStatus("Pass", "URL Lanuched");
    }else {
 	   reportStatus("Fail", "URL failed");
    }
    driver.findElement(By.id("username")).sendKeys("san");
	driver.findElement(By.id("password")).sendKeys("san@123");
    Thread.sleep(3000);
    driver.close();
 }
 }

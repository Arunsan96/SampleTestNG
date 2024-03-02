package testing.parameters.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSample  {

	//@Test(dataProvider = "crendentials")
	@Test(dataProvider="check", dataProviderClass =DiffClass.class)
	public void login(String username,String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(3000);
		driver.close();	
	}
	@DataProvider(name = "crendentials",parallel = true)
	public Object[][] testData(){
		return new Object[][] {{"Muthu173","Test@123"},
								{"Muthu173","Testing"},
								{"Muthu","Test@123"},
								{"Muthu","Testing"}};
								
	}
}

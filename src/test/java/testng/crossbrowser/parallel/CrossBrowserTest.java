package testng.crossbrowser.parallel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v119.page.Page;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sample.testing.attributes.BaseClass;

public class CrossBrowserTest extends BaseClass {
	
	
	@Parameters("browser")
	@Test
	public void SearchJava(String browser) throws InterruptedException {
		browserLaunch(browser, "https://www.google.com/");
		findElementByXpath("//*[@name='q']").sendKeys("TestNg",Keys.ENTER);
		Thread.sleep(3000);
		pageClose();
		
	}
	

}

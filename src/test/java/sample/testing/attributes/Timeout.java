package sample.testing.attributes;


import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

 public class Timeout extends BaseClass {

	@Test(timeOut = 7000)
	public void searchJava() {
		browserLaunch("chrome", "https://www.google.com/");
		findElementByXpath("//*[@name='q']").sendKeys("java",Keys.ENTER);
		pageClose();
	}
}

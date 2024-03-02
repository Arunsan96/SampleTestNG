package sample.testing.attributes;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class InvocatitonCountAndTimeOut extends BaseClass{

	
		@Test(invocationCount = 3,invocationTimeOut = 15000)
		public void Test1() { 
			browserLaunch("chrome", "https://www.google.com/");
			findElementByXpath("//*[@name='q']").sendKeys("java",Keys.ENTER);
			pageClose();
	}
}

package testing.parameters.dataprovider;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sample.testing.attributes.BaseClass;


public class ParametersSample extends BaseClass{
	
	@Parameters({"browser","url"})
	@BeforeMethod
	public void testSetup(String browser,String url) {
		browserLaunch(browser, url);
		
		
	}
	
	@Parameters("search data")
	@Test
	public void searchJava(String data) {
		browserLaunch("chrome", "https://www.google.com/");
		WebElement searchfield =findElementByXpath("//*[@name='q']");
		searchfield.sendKeys(data,Keys.ENTER);
		
		
	}

	
	}



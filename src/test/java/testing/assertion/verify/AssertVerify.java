package testing.assertion.verify;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVerify {

	@Test
	public void HardAssertion() {
		String name = "Arun";
		String name1 ="arun";
		Assert.assertEquals(name, name1);
		
	}
	@Test
	public void softAssertion() {
		
		SoftAssert verify = new SoftAssert();
		String name = "Arun";
		String name1 = "arun";
		verify.assertEquals(name, name1);
	}
}

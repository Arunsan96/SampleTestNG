package sample.testng.attributes;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethods {
	
	@Test
	public void addToCart() {
		System.out.println("product added into the cart");
	}
	@Test(dependsOnMethods = "sample.testng.attributes.Enabled.sample")
	public void login() {
		//Assert.assertTrue(false);
		System.out.println("User logged in");
	}
	@Test(dependsOnMethods = "login")
	public void checkout() {
		
		System.out.println("check out the product");
	}

}

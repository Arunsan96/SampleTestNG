package sample.testng.attributes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleAnnotations {

	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite");
		
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
		
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before Method");
		
}
	@AfterMethod
	public void Aftermethod() {
		System.out.println("After Method");
		
}
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("After Class");
		
}
	@AfterSuite
	public void Aftersuite() {
		System.out.println("After Suite");
		
}
}


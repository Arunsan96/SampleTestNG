package sample.testng.attributes;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority=5)
	public void tests() {
		System.out.println("Test 5");
	}
	@Test
	public void testss() {
		System.out.println("Test 6");
	}
	@Test(priority=4)
	public void testsr() {
		System.out.println("Test 4");
	}
	@Test(priority=2)
	public void testsa() {
		System.out.println("Test 2");
	}
	@Test(priority=1)
	public void testsf() {
		System.out.println("Test 1");
	}
	@Test(priority=3)
	public void testsy() {
		System.out.println("Test 3");
	}

}

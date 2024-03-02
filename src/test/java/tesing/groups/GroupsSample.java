package tesing.groups;

import org.testng.annotations.Test;

public class GroupsSample {

	@Test(groups = {"Smoke","Regression","Loginpage"})
	public void test1() {
		System.out.println("Test1");
	}
	@Test(groups = {"Smoke","Regression"})
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test(groups = {"Smoke","Regression"})
	public void test3() {
		System.out.println("Test3");
	}
	
	@Test(groups = {"Sanity","Regression"})
	public void test4() {
		System.out.println("Test4");
	}
	
	@Test(groups = {"Sanity","Regression"})
	public void test5() {
		System.out.println("Test5");
	}
	
	@Test(groups = {"HomePage","Regression"})
	public void test6() {
		System.out.println("Test6");
	}
	
	@Test(groups = {"CartPage","Regression"})
	public void test7() {
		System.out.println("Test7");
	}
	
	@Test(groups = {"PDPPage","Regression"})
	public void test8() {
		System.out.println("Test8");
	}
	
	@Test(groups = {"HomePage","Regression"})
	public void test9() {
		System.out.println("Test9");
}
}

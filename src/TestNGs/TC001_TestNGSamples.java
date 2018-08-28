package TestNGs;

import org.testng.annotations.Test;

public class TC001_TestNGSamples {
	@Test(priority=1,description ="this is testcase1")
	public void test1() {
		System.out.println("Test1");
	}
	@Test(priority=2,description ="this is testcase2")
	public void test0() {
		System.out.println("Test0");
	}
	@Test(priority=3,description ="this is testcase3")
	public void test3() {
		System.out.println("Test3");
	}


}

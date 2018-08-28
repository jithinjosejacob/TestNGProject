package TestNGs;

import org.testng.annotations.Test;

public class TC006_TestNGGrouping {
	@Test(groups = {"SmokeTest","FunctionalTest"})
	public void loginTest() {
		System.out.println("Login Successful");
	}

}

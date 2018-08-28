package TestNGs;

import org.testng.annotations.Test;

public class TC004_TestNGDependencies {
//If one method fails,then execution stops there try
	
	@Test
	public void login() {
		System.out.println("Login Done");
	}
	@Test(dependsOnMethods = "login")
	public void DoSomeAct() {
		System.out.println("Activity Done");
	}
	@Test(dependsOnMethods ="DoSomeAct")
	public void LogOut() {
		System.out.println("Logout Done");
	}
	
}

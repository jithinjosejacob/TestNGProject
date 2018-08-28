package HarveyHorman;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC014_BeforeClassAfterClass {
	@BeforeClass
	public void login() {
		System.out.println("Login Successful");
	}
	@BeforeMethod
	public void login_beforemethod() {
		System.out.println("Login Before Successful");
	}
	@Test(priority =5)
	public void Search() {
		System.out.println("Search Successful");
	}
	@Test(priority =2)
	public void AddtoCart() {
		System.out.println("AddtoCart Successful");
	}
	@Test(priority =3)
	public void Payment() {
		System.out.println("Payment Successful");
	}
	@AfterMethod
	public void login_aftermethod() {
		System.out.println("Login After Successful");
	}
	@AfterClass
	public void logout() {
		System.out.println("LogOut Successful");
	}


}

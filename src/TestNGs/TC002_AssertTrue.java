package TestNGs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_AssertTrue {
	@Test(priority=1,description ="this is testcase1")
	public void test1() {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Navigate to url
		driver.get("https://www.harveynorman.com.au/customer/account/login");
		//Wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String currentURL = driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("account/login"));
	}
}

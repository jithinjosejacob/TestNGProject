package TestNGs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_AssertEquals {
	@Test(priority=1,description ="this is testcase1")
	public void test1() {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Navigate to url
		driver.get("https://www.harveynorman.com.au");
		//Wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Get Title
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "arvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia");
	}
}

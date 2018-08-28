package TestNGs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC005_AssertTrue1 {
	@Test(priority=1,description ="this is testcase1")
	public void test1() {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Navigate to url
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
//		String errormess = driver.findElement(By.xpath("//div[contains(text(),'Enter an email or phone number')]")).getText();
//		System.out.println(errormess);
		String actual_error = driver.findElement(By.xpath("//div[contains(text(),'Enter an email or phone number')]")).getAttribute("innerHTML");
		System.out.println(actual_error);
		
		String expected_error = "Enter an email or phone number";
		//Type1
		Assert.assertEquals(actual_error, expected_error);
		
		//Type2
		Assert.assertTrue(actual_error.contains("Enter an email or phone number"));
		
//		//Wait for 10 seconds
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		String currentURL = driver.getCurrentUrl();
//		Assert.assertTrue(currentURL.contains("account/login"));
	}
}

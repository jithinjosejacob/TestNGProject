package TestNGs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC007_DataProvider {
	
	
	@Test(dataProvider = "testdata")

	public void TestChrome(String uname,String password) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Navigate to url
		driver.get("https://www.facebook.com/");
		//Wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}
		@DataProvider(name ="testdata")
		public Object[][] TestDataFeed(){
			Object[][] facebookdata = new Object[2][2];
			
			facebookdata[0][0] = "selenium@gmail.com";
			facebookdata[0][1] ="pwd";
			
			facebookdata[1][0] = "selenium1@gmail.com";
			facebookdata[1][1] ="pwd1";
			
			return facebookdata;
			
		}
	}


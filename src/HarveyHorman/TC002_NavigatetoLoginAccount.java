package HarveyHorman;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC002_NavigatetoLoginAccount extends TC001_NavigatetoHN {
	@Test
	public void Navigate_2() {
//	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();//Full Screen
//	driver.get("https://www.harveynorman.com.au");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//Click on Account Link
	driver.findElement(By.linkText("Account")).click();
	}

}

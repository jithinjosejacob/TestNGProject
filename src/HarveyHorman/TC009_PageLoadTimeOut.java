package HarveyHorman;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC009_PageLoadTimeOut {
	@Test
	public void pageTimeOut() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen;
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		try {
			driver.get("https://www.harveynorman.com.au");
			System.out.println("Page Found");
		}
		catch(Exception e) {
			System.out.println("Page Not Found");
		}
	}

}

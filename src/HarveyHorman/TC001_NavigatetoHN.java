package HarveyHorman;
//Taking Updated Code
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001_NavigatetoHN {
	WebDriver driver;
	@Test
	//Loginin to Git
	public void navigate() {
		//Opens the Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen
		//Navigate to url
		driver.get("https://www.harveynorman.com.au");
		//Wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Get Title
		String title = driver.getTitle();
		System.out.println(title);
	}

}

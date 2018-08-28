package HarveyHorman;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC003_LearningFrontandBackButtons {
	@Test
	public void FrontBack() {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();//Full Screen
	driver.navigate().to("https://www.harveynorman.com.au");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Account")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().forward();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.quit closes all browser instances
	//driver.quit();
	driver.close();
	}
}

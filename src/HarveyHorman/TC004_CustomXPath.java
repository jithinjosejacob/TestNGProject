package HarveyHorman;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC004_CustomXPath {
	@Test
	public void Navigate() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();//Full Screen
	driver.get("https://www.harveynorman.com.au");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//Click on Account Link
	//driver.findElement(By.linkText("Account")).click();
	//1.
	//driver.findElement(By.xpath("//a[@class='my-account-link tracked']")).click();
	//Enter text into Search
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class ='masthead_search-button btn btn_lg btn_link']")).click();
	}

}

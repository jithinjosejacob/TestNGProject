package HarveyHorman;


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC008_SwitchTabs {
	@Test
	public void switchtab() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen;

		//Navigate to url
		driver.get("https://www.harveynorman.com.au");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("PhotoCentre")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("https://www.harveynormanphotos.com.au/pages/15-free-prints-when-you-sign-up-to-photocentre")).click();
		/*
		//close the tab and how to take image
		//driver.findElement(By.xpath("//div[contains(@class,'grid__item post-large--one-whole medium--one-whole small--one-whole')]")).click();;
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.linkText("Account")).click();
		*/
	}
}

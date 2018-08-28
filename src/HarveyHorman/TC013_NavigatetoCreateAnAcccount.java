package HarveyHorman;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC013_NavigatetoCreateAnAcccount extends TC002_NavigatetoLoginAccount {
	@Test
	public void Navigate_CreateAnAccount()  {

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[contains(text(),'Create an account')]")).click();;
	
	}

}

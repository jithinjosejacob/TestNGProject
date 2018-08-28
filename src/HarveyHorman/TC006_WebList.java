package HarveyHorman;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC006_WebList {
	@Test
	public void Navigate() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();//Full Screen
	driver.get("https://www.harveynorman.com.au");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[contains(@data-pid,'286870')]")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	/*To Select dropdown using visible text
	//Select-Selenium List,List-Java List
	Select Warranty= new Select(driver.findElement(By.id("attribute1069")));
	Warranty.selectByVisibleText("512GB");
	
	//To select all dropdown elements
	Select Warranty1= new Select(driver.findElement(By.id("attribute1069")));

	for(int j=0;j<=3;j++) {
		String Text = Warranty1.getOptions().get(j).getText();
		System.out.println(Text);		
	}
	*/
	//Select by Index for dropdown elements
	Select Warranty2= new Select(driver.findElement(By.id("attribute1069")));
	Warranty2.selectByIndex(1);
	}

}

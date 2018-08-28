package HarveyHorman;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC011_RadioButtonAttributeValue {
	@Test
	public void radioclick() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		//Created an object of driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//Full Screen;
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		Thread.sleep(5000);
		List <WebElement> listOfLinks =driver.findElements(By.name("radio1"));
		//Create a boolean variable to store true/false
		int count = listOfLinks.size();
		System.out.println(count);
		
		//Now Iterate the loop from firstcheckbox to lastcheckbox using attribute value
		for(int i =0;i<count;i++) {
		//Store the checkbox name to the String variable using Attribute Value
			String sValue = listOfLinks.get(i).getAttribute("type");
			System.out.println(sValue);
		
		//Select the checkbox if the value is the same as you want
		if(sValue.equalsIgnoreCase("radio")) {
			listOfLinks.get(i).click();
			break;
		}
		//driver.quit;
		}


	}

}

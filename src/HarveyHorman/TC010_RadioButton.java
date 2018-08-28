package HarveyHorman;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC010_RadioButton {
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
		Boolean is_selected = listOfLinks.get(0).isSelected();
		System.out.println(is_selected);
		//if is_selected is True ie first radio button is selected
		if(is_selected ==true) {
			listOfLinks.get(1).click();
		}
		else {
			listOfLinks.get(0).click();
		}
	}

}

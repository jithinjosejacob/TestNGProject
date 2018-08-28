package HarveyHorman;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC005_GetAllLinks {
	@Test
	public void Navigate() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();//Full Screen
	driver.get("https://www.harveynorman.com.au");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List <WebElement> listOfLinks = driver.findElements(By.tagName("a"));//Get Elements into a List
	System.out.println(listOfLinks.size());
	
	//For Loop to display Link Names
	for (int i =0;i<listOfLinks.size();i++) {
		String LinkNames = listOfLinks.get(i).getText();
		System.out.println(LinkNames);
	}
	}
	}

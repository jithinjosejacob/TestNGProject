package HarveyHorman;

import org.testng.annotations.Test;

public class TC015_BeforeAfterClass2 extends TC014_BeforeClassAfterClass{
	@Test(priority  =1)
	public void display() {
		System.out.println("2nd Method");
	}

}

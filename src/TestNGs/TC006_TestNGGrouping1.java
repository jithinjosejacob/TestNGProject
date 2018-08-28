package TestNGs;

import org.testng.annotations.Test;

public class TC006_TestNGGrouping1 {
	@Test(groups = {"FunctionalTest"})
	public void composeMail() {
		System.out.println("Mail send");
	}

}

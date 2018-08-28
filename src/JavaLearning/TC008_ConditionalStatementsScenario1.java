package JavaLearning;

public class TC008_ConditionalStatementsScenario1 {

	public static void main(String[] args) {
		String browser ="Chrome";
		if(browser.equalsIgnoreCase("Chrome")){
			System.out.println("TC Executed on Chrome");
		}
		else
			System.out.println("TC Failed");

	}

}

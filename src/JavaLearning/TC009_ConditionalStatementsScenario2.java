package JavaLearning;

public class TC009_ConditionalStatementsScenario2 {

	public static void main(String[] args) {
		String browser ="IE";
		if(browser.equalsIgnoreCase("Chrome")){
			System.out.println("TC Executed on Chrome");
		}
		else if (browser.equalsIgnoreCase("FireFox")) {
			System.out.println("TC Executed on FireFox");
		}
		else if (browser.equalsIgnoreCase("IE")) {
			System.out.println("TC Executed on IE");
		}
		else
			System.out.println("TC Failed");

	}

}

package JavaLearning;

public class TC010_SwitchStatement {

	public static void main(String[] args) {
		int x =4;
		switch(x)
		{
		case 1:
			System.out.println("1st one selected");
			break;
		case 2:
			System.out.println("2nd one selected");
			break;
		case 3:
			System.out.println("3rd one selected");
			break;
		case 4:
			System.out.println("4th one selected");
			break;
		default:
			System.out.println("Default one selected");
			break;
		}
	}
}

package JavaLearning;

public class TC001_LearningAboutObjects {
	
	int a; //Global Variables
	int b; //Global Variables

	public static void main(String[] args) {
		
		TC001_LearningAboutObjects d = new TC001_LearningAboutObjects();
		d.a = 10; //Accessing global Variable through object
		System.out.println(d.a);
		d.b = 20; //Accessing global Variable through object
		System.out.println(d.b);
		System.out.println("d.a");
	}

}

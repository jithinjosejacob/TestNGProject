package JavaLearning;

public class TC004_StatisVsNonStatic {
	
	int i = 100;//This is a public variable NonStatic
	static int j = 200;//This is a public variable(static)

	public static void main(String[] args) {
	//1 Direct Calling
	//test1();
	System.out.println(j);
	
	//2 Calling by class name
	TC004_StatisVsNonStatic.test1();
	System.out.println(TC004_StatisVsNonStatic.j);
	
	//3 NonStatic Way of Calling
	TC004_StatisVsNonStatic obj = new TC004_StatisVsNonStatic();
	System.out.println(obj.i);
	
	obj.test2();

	}
	//Static method
	public static void test1() {
		System.out.println("This is a static method");
	}
	// NonStatic method or Normal method
	public void test2() {
		System.out.println("THis is a nonstatic method");
	}
}

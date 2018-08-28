package JavaLearning;
final class TC002_GlobalVsLocalVariables {
	int m = 50;
	int n = 60;
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		
		System.out.println(i+j);
		System.out.println("This is the Main method");
		
		TC002_GlobalVsLocalVariables obj = new TC002_GlobalVsLocalVariables();
		System.out.println(obj.m);
		System.out.println(obj.n);
		
		obj.tester();

	}
	public void tester() {
	//local variables
	int p = 500;
	int q = 600;
	System.out.println(p+q);
	System.out.println("THis is sub method");
	}

}

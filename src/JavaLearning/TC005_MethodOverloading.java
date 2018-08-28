package JavaLearning;

public class TC005_MethodOverloading {

	public static void main(String[] args) {
		TC005_MethodOverloading obj = new TC005_MethodOverloading();
		obj.sum();
		obj.sum(100);
		obj.sum(100,200);
		obj.sum(10.00);
		
	}
	//Here we have created same method but with different input parameters
	//and this concept is called as method overloading
	//similar to this submethod
	public void sum() {
		System.out.println("This is the First method");
	}
	public void sum(int i) {
		System.out.println("This is the Second method");
		System.out.println(i);
	}
	public void sum(int i,int j) {
		System.out.println("This is the Third method");
		System.out.println(i+j);
	}
	public void sum(double d) {
		System.out.println("This is the Fourth method");
		System.out.println(d);
	}
}

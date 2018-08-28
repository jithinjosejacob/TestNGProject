/*
 Test Case name:
 Project:
 Release:
 Author:
 Date:
 Description:
 Test Data:
 */
package JavaLearning;

public class TC003_MethodorFunctionLearning {

	public static void main(String[] args) {

		TC003_MethodorFunctionLearning obj= new TC003_MethodorFunctionLearning();
		//1
		obj.test1();
		//2
		int secondmethod = obj.test2();
		System.out.println(secondmethod);
		//3
		String thirdmethod= obj.test3();
		System.out.println(thirdmethod);
		//4
		int Fourthmethod = obj.test4(100, 200);
		System.out.println(Fourthmethod);
	}
	//This method has void in it meaning we are not returning anything
	public void test1() {
		System.out.println("This is First Method");
	}
	//This is the second method and we are returning integer value as output
	public int test2() {
		int a =10;
		int b =20;
		int c = a+b;
		return c;
	}
	//This is the third method and here we are returning string value as output
	public String test3() {
		String f = "SeleniumTraining";
		return f;
	}
	//This is the fourth method and we are entering int values from main method
	public int test4(int x,int y) {
		int z = x + y;
		return z;
	}
}

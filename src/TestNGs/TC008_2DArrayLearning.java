package TestNGs;

import org.testng.annotations.Test;

public class TC008_2DArrayLearning {
	@Test
	public void ArrayLearning() {
		
		int StudentMarks [] [];
		StudentMarks = new int[3][3];
		
		StudentMarks[0][0] = 22;
		StudentMarks[0][1] = 33;
		StudentMarks[0][2] = 44;
		
		System.out.println(StudentMarks[0][0]);
		System.out.println(StudentMarks[0][1]);
		System.out.println(StudentMarks[0][2]);
		
		
	}

}

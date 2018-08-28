package TestNGs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TC009_ApachePOIExcel {
	
	public static void main(String[] args) throws IOException {

	File source = new File("C:\\Users\\JITHIN BACK TO  WORK\\eclipseworkspace\\UserPwdExcel.xlsx");
	//C:\Users\JITHIN BACK TO  WORK\Documents
	
	FileInputStream fis = new FileInputStream(source);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sheet1 = wb.getSheetAt(0);
	
	String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(data0);

	}
}

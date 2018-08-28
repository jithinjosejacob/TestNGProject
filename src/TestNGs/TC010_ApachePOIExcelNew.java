package TestNGs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TC010_ApachePOIExcelNew {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File source = new File("C:\\Users\\JITHIN BACK TO  WORK\\eclipseworkspace\\UserPwdExcel.xlsx");
		
		FileInputStream fis = new FileInputStream(source);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(9).getCell(0).getStringCellValue();
		
		System.out.println(data0);


	}

}

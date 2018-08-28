package TestNGs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test123 {

	public static void main(String[] args) throws IOException   {
	

			File source = new File("C:\\Users\\JITHIN BACK TO  WORK\\Documents\\UserPwdExcel.xlsx");
			//C:\Users\JITHIN BACK TO  WORK\Documents
			
			FileInputStream fis = new FileInputStream(source);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sheet123 = wb.getSheetAt(0);
			
			String data0 = sheet123.getRow(9).getCell(1).getStringCellValue();
			
			System.out.println(data0);

			}
		}

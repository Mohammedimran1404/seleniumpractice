package readDataFromExcell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingStringtypedatausingExcell {

	public static void main(String[] args) throws IOException {
		
		String filepath =".\\excelldatafiles\\userpass.xlsx";
		
		FileInputStream inputstream = new FileInputStream(filepath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		    XSSFSheet sheet= workbook.getSheet("sheet1");
		    
		int rows =sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		for(int r=1;r<=rows;r++) {
		  XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++) {
			XSSFCell cell=row.getCell(c);
			System.out.print(cell.getStringCellValue());
				System.out.print("|");
			}
			
			System.out.println();
		}

	}

}

package readDataFromExcell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellData {

	public static void main(String[] args) throws IOException {
		
		String path =".\\excelldatafiles\\Book1.xlsx";
		
		FileInputStream inputstream = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		for(int r=1;r<=rows;r++) {
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++) {
			XSSFCell col=row.getCell(c);
			DataFormatter df = new DataFormatter();
			String value=df.formatCellValue(col);
			System.out.print(value);
			System.out.print("|");
			}
			System.out.println();
		}

	}

}

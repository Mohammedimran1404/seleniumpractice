package practice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeExcell {
	public static void main(String[] args)  {
		try {
		String path=".\\excelldatafiles\\Book1.xlsx";
		FileInputStream inputstream = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
	int rows=sheet.getLastRowNum();
	int cells=sheet.getRow(1).getLastCellNum();
	    for(int r=1;r<rows;r++) {
	    XSSFRow row=	sheet.getRow(r);
	    for(int c=0;c<cells;c++) {
	    XSSFCell cell=row.getCell(c);
	    DataFormatter df=new DataFormatter();
	  String s=  df.formatCellValue(cell);
	  System.out.println(s);
	    }
	    }
	

}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}

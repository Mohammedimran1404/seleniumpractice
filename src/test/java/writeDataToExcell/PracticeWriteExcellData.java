package writeDataToExcell;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeWriteExcellData {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		
		Object empdata[][]= {{"EmpUsername","Empname","Empid","Empmobnum"},
				             {"imran123@gmail.com","imran",101,1237464747},
				             {"imran1245@gmail.com","mohammed",102,1728827282},
				             {"mohammed9087@gmail.com","mohammedimran",103,8682769171l}  };
	
		int rows=empdata.length;
		int cols=empdata[0].length;
		System.out.println(rows);
		System.out.println(cols);
		
		
		for(int r=0;r<rows;r++) {
		XSSFRow row	=sheet.createRow(r);
		 for(int c=0;c<cols;c++) {
			XSSFCell col=row.createCell(c);
			Object value=empdata[r][c];
			
			if(value instanceof String)
				col.setCellValue((String)value);
			if(value instanceof Long)
				col.setCellValue((Long)value);
			if(value instanceof Boolean)
				col.setCellValue((Boolean)value);
			if(value instanceof Integer)
				col.setCellValue((Integer)value);
			}
		 }
		String path =".\\excelldatafiles\\employees.xlsx";
		FileOutputStream outstream = new FileOutputStream(path);
		workbook.write(outstream);
		outstream.close();
		
			
		}
	

	}


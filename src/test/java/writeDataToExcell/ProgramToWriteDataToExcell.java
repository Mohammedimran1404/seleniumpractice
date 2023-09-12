package writeDataToExcell;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProgramToWriteDataToExcell {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet=workbook.createSheet("Emp info");
	Object empdata[][]= { {"Empid","Empname","job"},
			              {101,"imran","testengineer"},
			              {102,"praneeth","softwrare developer"},
			              {103,"basha","Manager"}};
	// to know number of rows and column
	int rows=empdata.length;
    int cols=empdata[0].length;
	    for(int r=0;r<rows;r++) {
	   XSSFRow row=	sheet.createRow(r);
	    	for(int c=0;c<cols;c++) {
	    	XSSFCell col=row.createCell(c);
	    Object value=	empdata[r][c];
	    
	    
	    
	    
	    	    if(value instanceof String) 
	    	col.setCellValue((String)value);
	    if(value instanceof Integer)
    	col.setCellValue((Integer)value);
	    if(value instanceof Boolean)
	    	col.setCellValue((Boolean)value);
	    	}
	    
	    }
	    String location=".\\excelldatafiles\\employee.xlsx";
	    FileOutputStream outstream = new FileOutputStream(location);
	    workbook.write(outstream);
	    outstream.close();
	}

}

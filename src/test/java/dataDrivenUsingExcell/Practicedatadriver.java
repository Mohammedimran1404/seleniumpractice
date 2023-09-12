package dataDrivenUsingExcell;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practicedatadriver {
	String path=null;
	FileInputStream inputstream;
	FileOutputStream outputstream;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell col;
	
	
	Practicedatadriver(String path){
		this.path=path;
	}
	public int getRowcount(String sheetname) throws IOException {
	
		inputstream = new FileInputStream(path);
		workbook = new XSSFWorkbook(inputstream);
	    sheet=workbook.getSheet(sheetname);
	 int rowscount=sheet.getLastRowNum();
	 workbook.close();
	 inputstream.close();
	return rowscount;	
	}
	public int getcellcount(String sheetname,int rownum) throws IOException {
        inputstream = new FileInputStream(path);
		workbook = new XSSFWorkbook(inputstream);
		sheet=workbook.getSheet(sheetname);
		 row=sheet.getRow(rownum);
		int cellcount= row.getLastCellNum();
		workbook.close();
		inputstream.close();
		return cellcount;	 
	}
	public String getCellData(String sheetname,int rownum,int colnum) throws IOException {
		inputstream=new FileInputStream(path);
		workbook=new XSSFWorkbook(inputstream);
		sheet=workbook.getSheet(sheetname);
		row=sheet.getRow(rownum);
		col=row.getCell(colnum);
		DataFormatter df= new DataFormatter();
		String data;
		try {
			data=df.formatCellValue(col);
		}
		catch(Exception e) {
			data="";
		}
		workbook.close();
		inputstream.close();
		return data;	
	}

}

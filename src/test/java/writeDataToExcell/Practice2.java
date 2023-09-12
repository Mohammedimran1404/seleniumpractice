package writeDataToExcell;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice2 {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		
		Object data[][]= {{"UserName","Password","id"},
				          {"mohammed1223@gmail.com","gataga",101},
		                  {"a@gmail.com","uayaya",102},
				          {"b@gmail.com","aswe",103}};
		int empdatarow=data.length;
		System.out.println(empdatarow);
		int empdatacol=data[1].length;
		System.out.println(empdatacol);
		
		for(int r=0;r<empdatarow;r++) {
		XSSFRow row=sheet.createRow(r);
		for(int c=0;c<empdatacol;c++) {
		XSSFCell col=row.createCell(c);
		Object value=data[r][c];
		
		if(value instanceof String)
			col.setCellValue((String)value);
		if(value instanceof Integer)
			col.setCellValue((Integer)value);
		}	
		}
		String path =".\\excelldatafiles\\emp.xlsx";
		FileOutputStream op = new FileOutputStream(path);
		workbook.write(op);
		op.close();

	}

}

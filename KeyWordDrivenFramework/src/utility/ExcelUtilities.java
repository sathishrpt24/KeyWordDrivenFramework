package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

	private static XSSFSheet excelSheet = null;
	private static XSSFWorkbook wbk = null;
	private static XSSFCell Cell = null;
	private static FileInputStream fis = null;
	
//	private String Workbookname;
//	private String sheetname;
//	
	
//	public ExcelUtilities(String Workbookname, String sheetname) {
//		
//		this.Workbookname = Workbookname;
//		this.sheetname = sheetname;
//		E:\Sathish\KeyWordDrivenFramework\src\dataEngine\DataEngine.xlsx
//	}

	public static void setExcelFile(String Workbookname, String sheetname) throws IOException {
		System.out.println("reading Excel sheet name and Excel file");
		String path = System.getProperty("user.dir");
		System.out.println(path + "\\src\\dataEngine\\" + Workbookname + ".xlsx");
		try {
			fis = new FileInputStream(path + "\\src\\dataEngine\\" + Workbookname + ".xlsx");

			wbk = new XSSFWorkbook(fis);
			excelSheet = wbk.getSheet(sheetname);

		} catch (FileNotFoundException e) {
			System.out.println("Unable to read the data engile file" + e);
		}
	}
	public static String getCellData(int rowNum, int cellNum) {
			
		Cell = excelSheet.getRow(rowNum).getCell(cellNum);
		
		String CellData = Cell.getStringCellValue();
		
		return CellData;
	}


}
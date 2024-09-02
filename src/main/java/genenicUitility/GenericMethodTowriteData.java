package genenicUitility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericMethodTowriteData {
	public void WritenDataInExcel(String sheetName, int rownum, int cellnum, String value) throws Exception {
		FileInputStream fis = new FileInputStream(IconstantUtility.excelPath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		sh.createRow(rownum).createCell(cellnum).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IconstantUtility.excelPath);
		book.write(fos);
	}

}

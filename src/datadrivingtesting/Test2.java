package datadrivingtesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream("./Abc/Ram.xlsx");
		
		Workbook wb = WorkbookFactory.create(f);
		
		Cell c = wb.getSheet("Sheet1").getRow(1).getCell(0);
		
		System.out.println(c);
	}

}

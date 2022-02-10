package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test24 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream("./Abc/ram.xlsx");

		Workbook wb =WorkbookFactory.create(f);

		String s=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

		System.out.println(s);

	}		
}
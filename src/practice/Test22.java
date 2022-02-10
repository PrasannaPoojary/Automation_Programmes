package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22 {
	public static void main(String[] args) throws
	EncryptedDocumentException, InvalidFormatException, IOException
	{
	FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\Excel\\Exceldata11.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Cell c =  wb.getSheet("Sheet1").getRow(0).getCell(1);
	System.out.println(c);
	}

}

package datadrivingtesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test1 {
	//static {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	//}
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
	     
		
		FileInputStream f = new FileInputStream("./Excel/Exceldata11.xlsx");
		
		Workbook wb = WorkbookFactory.create(f);
		
		String s= wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(s);
		
		//Thread.sleep(2000);
		//driver.close();
}
}

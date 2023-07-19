package ninjaUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	//Reading Excel data
	public static String getDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("D:\\Selenium\\PracticeSheet.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	
	//Screenshot
	public static void takeScreenshot(WebDriver driver, String TC) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Screeenshot\\TC-"+TC+".png");
		FileHandler.copy(src, dest);
		
	}
	
	
	

}

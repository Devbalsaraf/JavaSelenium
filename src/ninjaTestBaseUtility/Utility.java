package ninjaTestBaseUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	

	public static String getDataFromExcel(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("D:\\Selenium\\PracticeSheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String value = mysheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	
	public static void captureScreenshot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Software Testing course\\ScreenShot\\Ninja"+TCID+".png");
		FileHandler.copy(src, dest);
		
	}
}

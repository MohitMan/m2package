package personal.m2project.m2package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonMethods {
	//---------------------Web drivers variables------------------------------------------
	WebDriver driver;
	
	//-----------------------Properties file variables-------------------------------------
	Properties properties;
	FileInputStream fileInput = null;
	
	//-----------------------Excel Variables-----------------------------------------------
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	FileInputStream excel = null;
	int row_count = 0;
	int row_index;
	String testdata;
	
	
	
	//******************************--------Methods------------****************************************
	
	//-----------------------Properties file method----------------------------------------
		Properties property_initiate() throws IOException
		{	
			fileInput = new FileInputStream("EnvironmentVariables.properties");
			properties = new Properties();
			properties.load(fileInput);
			return properties;
		}
	
	//-------------------------- Different drivers----------------------------------
	protected WebDriver driver_initiate()
	{
		
			switch(properties.getProperty("personal.driver"))
			{
			case "Chrome" :
				driver = new ChromeDriver();
			break;
			case "InternetExlorer" :
				driver = new InternetExplorerDriver();
			break;
			case "Firefox" : 
				driver = new FirefoxDriver();
			break;
			}
		//
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
		return driver;
	}
	
	//----------------------Excel Methods----------------------------------------------------
	void excel_initiate(String scenarioname) throws IOException
	{
		excel = new FileInputStream("ExcelName.xlsx");
		workbook = new XSSFWorkbook(excel);
		sheet = workbook.getSheet("SheetName");
		row_count  = sheet.getLastRowNum();
		boolean rowvalue_check = false;
		for(int i=1; i <= row_count ; i++)
		{
			row = sheet.getRow(i);
			cell = row.getCell(0);
			if(cell.getStringCellValue().equalsIgnoreCase(scenarioname))
			{
				rowvalue_check = true;
				row_index = i;
				break;
			}
		}
			if(rowvalue_check == false)
			{
				Assert.assertTrue("Scenario name Mismatched", false);
			}
	}
	
	String excel_read(String colnamefrom_M2class)
	{
		row = sheet.getRow(0);
		int colcount = row.getLastCellNum();
		for(int j=1; j<colcount ;j++)
		{
			if(sheet.getRow(0).getCell(j).getStringCellValue().equalsIgnoreCase(colnamefrom_M2class))
			{
				DataFormatter formatter = new DataFormatter();
				testdata = formatter.formatCellValue(sheet.getRow(row_index).getCell(j));
			}
		}	
		return testdata;
		
	}
	
	
}

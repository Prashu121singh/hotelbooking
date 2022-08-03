package LIbraryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.reporters.jq.Main;

public class BasePage {
	public static WebDriver driver;

	@BeforeSuite
	public void InitializeBrowser() throws IOException {

		{

			System.setProperty("webdriver.chrome.driver", Utility_Class.gettestdata("chromepath"));

			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get(Utility_Class.gettestdata("url"));

		}
	}
	
//	@DataProvider
//	public Object[][] dataDriven() throws EncryptedDocumentException, IOException {
//			// Rows col
//			Object data[][] = new Object[3][5];
//			FileInputStream file = new FileInputStream(Utility_Class.gettestdata("excelpath"));
//			XSSFWorkbook wb=new XSSFWorkbook(file);
//			XSSFSheet sh = wb.getSheetAt(0);
//			Row r = sh.getRow(0);
//			int lastrow=sh.getLastRowNum();
//			int lastcol= r.getLastCellNum();
//			int x=0;
//			for(int l=1;l<=lastrow;l++) {
//				for(int i=0;i<lastcol;i++){
//					data[x][i] = sh.getRow(l).getCell(i).getStringCellValue() ;
//					System.out.println(data[x][i]);
//				}
//				x++;
//			}
//			return data;	
//	}
}
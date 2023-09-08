package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ReadingData_ExcelSheet {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String url=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String username = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(username);
		System.out.println(password);
		WebDriverManager.edgedriver().setup();
		//opening the edge browser
	    WebDriver driver= new EdgeDriver();
	    //maximizing the browser
	    driver.manage().window().maximize();
	  //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // entering the URL
	    driver.get(url);
	    String title = driver.getTitle();
	    wb.getSheet("Sheet1").createRow(6).createCell(0).setCellValue(title);
	    FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx.xlsx");
	    wb.write(fos);
	    
	    
		
		

	

	}

}

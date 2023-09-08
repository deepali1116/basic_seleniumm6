package screenshots;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		//driver related statement
				WebDriverManager.edgedriver().setup();
				//opening the chrome browser
			    WebDriver driver= new EdgeDriver();
			    //maximizing the browsers
			    driver.manage().window().maximize();
			    //implicit wait
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    // opens the browser
			    driver.get("https://www.amazon.com/");
			    //downcasting
			    TakesScreenshot ts=(TakesScreenshot)driver;
			    File src=ts.getScreenshotAs(OutputType.FILE);
			    File dest=new File("./screenshots/amazon.png");
			    FileUtils.copyFile(src, dest);
			    
			    
			    
		// TODO Auto-generated method stub;

	}

}

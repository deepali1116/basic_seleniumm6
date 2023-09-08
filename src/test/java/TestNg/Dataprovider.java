package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {
	@DataProvider
	public Object[][] getData()
	{
	Object[][] a=new Object[3][2];
	a[0][0]="tdhvh";
	a[0][1]="s12h";
	
	a[1][0]="sbft";
	a[1][1]="hyfh";
	
	a[2][0]="deepali";
	a[2][1]="sft";
	return a;
	}
	
	@Test(dataProvider="getData")
	public void demo(String username,String pass)
	{
		//driver related statement
				WebDriverManager.edgedriver().setup();
				//opening the edge browser
			    WebDriver driver= new EdgeDriver();
			    //maximizing the browser
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    driver.get("https://www.facebook.com/");
			    driver.findElement(By.id("email")).sendKeys(username);
			    driver.findElement(By.id("pass")).sendKeys(pass);
			    driver.findElement(By.name("login")).click();
			    driver.close();
			    

			    }
	
	
	
	
}



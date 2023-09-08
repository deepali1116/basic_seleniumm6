package pom_practise;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import pom.Fb_loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.Properties;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Facebook {

	public static void main(String[] args) throws Throwable {
		//creating object for property class
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(fis);
		String appurl=p.getProperty("url");
		String User=p.getProperty("username");
		String Password=p.getProperty("password");
				
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opening the edge browser
	    WebDriver driver= new EdgeDriver();
	    //maximizing the browser
	    driver.manage().window().maximize();
	    //implicit wait
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // entering the URL
	    driver.get(appurl);
	    Fb_loginPage fbLogin=  new Fb_loginPage(driver);
	    fbLogin.emailTextField(User);
	    fbLogin.passwordTextField(Password);
	    fbLogin.loginButton();
	    
	    
	    
		

	}

}

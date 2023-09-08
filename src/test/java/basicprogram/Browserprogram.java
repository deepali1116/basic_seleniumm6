package basicprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserprogram {

	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    // opens the browser
    driver.get("https://www.facebook.com/");
    // get the title of webpage
    System.out.println(driver.getTitle());
    //printing the current url
    System.out.println(driver.getCurrentUrl());
    Thread.sleep(4000);
    driver.close();
    

	}

}

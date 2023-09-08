package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_loginPage {
	//Declaration
	//address of email text field
	@FindBy(id="email")
	private  WebElement emailTf;
	
	//address if password text field
	@FindBy(id="pass")
	private WebElement passwordTf;
	
	//address of login button
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginbutton;
	
	//initilization
      public Fb_loginPage(WebDriver driver)
      {
      PageFactory.initElements(driver, this);
      }
      
      //Utilization 
      public void emailTextField( String value)
      {
    	  emailTf.sendKeys(value) ;
    	  
      }
      public void passwordTextField( String value)
      {
    	  passwordTf.sendKeys(value);  
      }
      public void loginButton()
      {
    	  loginbutton.click(); 
      }
      //getter and setter method 

	public WebElement getEmailTf() {
		return emailTf;
	}

	public void setEmailTf(WebElement emailTf) {
		this.emailTf = emailTf;
	}

	public WebElement getPasswordTf() {
		return passwordTf;
	}

	public void setPasswordTf(WebElement passwordTf) {
		this.passwordTf = passwordTf;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}
      
			
			
	
	

}

package Tiara.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Tiara.AbstractComponents.AbstractComponent;

public class LoginPage extends AbstractComponent {

       WebDriver driver; 
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="a[class='btn google-login login-social-links ng-scope ms-widget'] div[class='ng-binding ng-scope']")
	WebElement GoogleLogin;
	
	@FindBy(css="input[id='email']")
	WebElement inputEmail;
	
	@FindBy(css="input[id='password']")
	WebElement inputpassword;
	
	@FindBy(css="button[class='ms-w-full btn btn-default ng-binding']")
	WebElement loginbutton;
	
	public SignInPage googleLinkClick() {
		GoogleLogin.click();
		SignInPage sgnInPg=new SignInPage(driver);
		return sgnInPg;
	}
	
	public SchoolSelectionPage logintoProdSelectionPg(String email,String password) {
		
		  inputEmail.sendKeys("email");
		  inputpassword.sendKeys("password");
		  loginbutton.click();
		  SchoolSelectionPage ssp=new SchoolSelectionPage(driver);
		  return ssp;
		  
	}
	
	
}

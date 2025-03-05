package Tiara.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Tiara.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
    @FindBy(linkText="Signup")
    WebElement signUp;
    
    @FindBy(css="a[title='Login']")
    WebElement login;
    
    @FindBy(css="a[title='My Cart']")
    WebElement MyCart;
    
    
    public SignUpPage signUp() {
    	signUp.click();
    	SignUpPage supage=new SignUpPage(driver);
    	return supage;
    }
    
    public LoginPage Login() {
    	
    	login.click();
    	LoginPage lginpg=new LoginPage(driver);
    	return lginpg;
    }
    
    public void goTo() {
    	driver.get("https://www.tiarauniforms.com/");
    }
}

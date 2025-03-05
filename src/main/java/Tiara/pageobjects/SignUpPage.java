package Tiara.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Tiara.AbstractComponents.AbstractComponent;

public class SignUpPage extends AbstractComponent {

WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="first_name")
	WebElement FirstName;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="phone")
	WebElement PhoneNum;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="confirm_password")
	WebElement confrmPaswd;
	
	@FindBy(css="button[class='ms-w-full btn btn-default ng-binding']")
	WebElement register;
	
	public void registerCustomer(String name,String Eml,String PhnNum,String pWord,String cnfrmpas) {
		FirstName.sendKeys(name);
		Email.sendKeys(Eml);
		PhoneNum.sendKeys(PhnNum);
		password.sendKeys(pWord);
		confrmPaswd.sendKeys(cnfrmpas);
		register.click();	
	}
}

package Tiara.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Tiara.AbstractComponents.AbstractComponent;

public class SignInPage extends AbstractComponent {

WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css="input[type='email']")
	WebElement EmailEntry;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
	WebElement NextButton;
	
	@FindBy(css="section.Em2Ord ")
	WebElement SignInError;
	
	
	public void EnterEmailId(String email) {
		EmailEntry.sendKeys(email);
	}
	
	public void ClickNextButton() {
		NextButton.click();
	}
	
	public String SignInError1() {
		return SignInError.getText();
	}
}

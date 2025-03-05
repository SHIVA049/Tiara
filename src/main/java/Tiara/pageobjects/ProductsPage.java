package Tiara.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Tiara.AbstractComponents.AbstractComponent;

public class ProductsPage extends AbstractComponent {

WebDriver driver;
	
	public ProductsPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[contains(text(),'₹405')]")
	List<WebElement> itemSelectOnPrice;
	
	@FindBy(xpath="//button[normalize-space()='Go']")
	WebElement GoButton;
	
	@FindBy(css="input[placeholder='From']")
	WebElement FromPriceEntry;
	
	@FindBy(css="input[placeholder='To']")
	WebElement ToPriceEntry;
	
	@FindBy(xpath="//span[@class='horizontal-filters-sub ng-binding']")
	WebElement HeaderItemCountDisplay;
	
	@FindBy(css="input[type='email']")
	WebElement EmailEntry;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/c-wiz[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
	WebElement NextButton;
	
	@FindBy(css="section.Em2Ord ")
	WebElement SignInError;
	
	
	public int CountOfItemsBasedOnPrice() {
		return itemSelectOnPrice.size();
	}
	
	public boolean GoButtonEnabled() {
		return GoButton.isEnabled();
	}
	
	public void PriceRangeEntry(String frmPrice,String toPrice) {
		FromPriceEntry.sendKeys(frmPrice);
		ToPriceEntry.sendKeys(toPrice);
	}
	
	public void ClickOnGoButton() {
		GoButton.click();
	}
	
	public String HeaderItemCountDisplayExtract() {
		return HeaderItemCountDisplay.getText();
	}
	
	public void ClickNextButton() {
		NextButton.click();
	}
	
	public String SignInError1() {
		return SignInError.getText();
	}
}

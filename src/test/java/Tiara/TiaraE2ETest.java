package Tiara;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Tiara.TestComponents.BaseTest;
import Tiara.pageobjects.LandingPage;
import Tiara.pageobjects.SignUpPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TiaraE2ETest extends BaseTest {

	//public static void main(String[] args) {
	
    @Test(dataProvider="getData1")
    public void emailErrorValidation(String FName,String Email,String PhnNum,String Passwrd,String CnfrmPaswd) throws IOException {
    	//LandingPage lp=launchApplication();
    	SignUpPage supage=lp.signUp();
    	supage.registerCustomer(FName, Email, PhnNum, Passwrd,CnfrmPaswd);
    	String emailErrorText=driver.findElement(By.xpath("//label[normalize-space()='Invalid Email']")).getText();
    	Assert.assertEquals(emailErrorText, "Invalid Email");
    }
	
	@Test(dataProvider="getData")
	public void customerRegistration(String FName,String Email,String PhnNum,String Passwrd,String CnfrmPaswd) throws IOException {
		// TODO Auto-generated method stub
		
		//LandingPage lp=launchApplication();
		SignUpPage supage=lp.signUp();
		supage.registerCustomer(FName, Email, PhnNum, Passwrd,CnfrmPaswd);
		
	}
	
	
	@DataProvider
	public Object[][] getData() {
		
		return new Object[][] {{"Shrinidhi","shivakumarn2@gmail.com","9741275767","","Nidhi6@us1234"}};
	}
	
	@DataProvider
	public Object[][] getData1() {
		
		return new Object[][] {{"Shrinidhi","sh","9741275767","Nidhi6@us1234","Nidhi6@us1234"}};
	}

}

package Tiara.pageobjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Tiara.AbstractComponents.AbstractComponent;

public class SchoolSelectionPage extends AbstractComponent {
      
	   WebDriver driver;
	   
	   @FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[2]/div[3]/div[1]/nav[1]/div[1]/ul[1]/li")
	   List<WebElement> schoolList;
	   
	   SchoolSelectionPage(WebDriver driver){
		   
		   super(driver);
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
	   }
	   
	   
	   
	   public ProductsPage selectRequiredSchool(String scoolName) throws InterruptedException {
		   
		   Actions actions=new Actions(driver);
			Iterator<WebElement> it=schoolList.iterator();
			while(it.hasNext()) {
				
				boolean schoolName=it.next().getText().equalsIgnoreCase(scoolName);
				if(schoolName==true) {
					WebElement Gln=driver.findElement(By.cssSelector("span[class='ng-binding']"));
					actions.moveToElement(Gln).build().perform();
					Thread.sleep(2000);
					driver.findElement(By.xpath("(//b[normalize-space()='Grade 5 to Grade 10 - Girls'])[1]")).click();		
				}
			}
			
			ProductsPage prodsPg=new ProductsPage(driver);
			return prodsPg;
		   
	   }
	   
}

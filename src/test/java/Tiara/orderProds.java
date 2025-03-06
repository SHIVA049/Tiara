package Tiara;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Tiara.TestComponents.BaseTest;
import Tiara.pageobjects.LoginPage;
import Tiara.pageobjects.ProductsPage;
import Tiara.pageobjects.SchoolSelectionPage;
import freemarker.ext.beans.LegacyDefaultMemberAccessPolicy;
import io.reactivex.rxjava3.functions.Action;

public class orderProds extends BaseTest {
       
	 @Test(dataProvider="testDataToOrderProds")
	 public void orderProdstoCart(String emailid,String passwrd,String scoolName,String frmPrice,String toPrice) throws InterruptedException {
		 
		 //Testing of Git Learning
		 //Learning Git By Practice
		 //Pushing from eclipse workspace2
		 LoginPage lginpg =lp.Login();
		 SchoolSelectionPage ssp=lginpg.logintoProdSelectionPg(emailid, passwrd);
		 ProductsPage prdspg=ssp.selectRequiredSchool(scoolName);
		 int itemcount=prdspg.CountOfItemsBasedOnPrice();
		 boolean flag=prdspg.GoButtonEnabled();			
		 Assert.assertTrue(true);
		 prdspg.PriceRangeEntry(frmPrice, toPrice);	
			prdspg.ClickOnGoButton();
			
			Thread.sleep(2000);
			String filtcount=prdspg.HeaderItemCountDisplayExtract();
			System.out.println(filtcount);
			System.out.println("Test");
			String count=filtcount.substring(2, 3);
			int counter=Integer.parseInt(count);
			
			Actions actions=new Actions(driver);
			/*if(itemcount==counter) {
				List<WebElement> selitems=driver.findElements(By.cssSelector("div[class='ms-img-warpper']"));
				Iterator<WebElement> it1=selitems.iterator();
				while(it1.hasNext()) {
					actions.moveToElement(it1.next()).build().perform();
					driver.findElement(By.cssSelector("i[class='icons8-plus ms-fs-27']")).click();
				} 
			}  */
			
			
		
		 
		 
	 }
	 
	 
	 @DataProvider
	 public static Object[][] testDataToOrderProds() {
		 
		return new Object[][] {{"som.neralagi@gmail.com", "Nidhi6@us1234","Glentree Academy","400","450"}};
		 
	 }
}

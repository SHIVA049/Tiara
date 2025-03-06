package Tiara;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Tiara.TestComponents.BaseTest;
import Tiara.pageobjects.LoginPage;
import Tiara.pageobjects.SignInPage;

public class loginthruGmail extends BaseTest {
	
	@Test
	public void gmailLogin() throws InterruptedException {
		
		//Testing of Git
		//Learning Git Concepts
		//Pushing the changes from Eclipse WorkSpace2
		LoginPage lginPg=lp.Login();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		SignInPage sgnInPg=lginPg.googleLinkClick();
		Set<String> tihand=driver.getWindowHandles();
		Iterator<String> it=tihand.iterator();
		String parwind=it.next();
		String childwind=it.next();
		driver.switchTo().window(childwind);
		driver.manage().window().maximize();
		sgnInPg.EnterEmailId("som.neralagi@gmail.com");
		System.out.println("Test2");
		//Thread.sleep(3000);
		sgnInPg.ClickNextButton();		
		//Thread.sleep(2000);
		Set<String> windhandl=driver.getWindowHandles();
		
		System.out.println(driver.getTitle());
		String text=sgnInPg.SignInError1();	
		System.out.println(text);		
	}

}

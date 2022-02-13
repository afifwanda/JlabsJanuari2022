package qaautomation.tugas4;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tugas3.pages.LoginPageFactory;
import tugas3.pages.ProfilePageFactory;
import tugas4.yopmail.MailHomePage;
import tugas4.yopmail.MailPage;

public class Tugas4 extends BaseWebTest
{
	@Test
	public void testEmail() {
		MailHomePage homeMailPage = new MailHomePage(driver, explicitWait);
		MailPage mailPage = new MailPage(driver, explicitWait);
		
		String username = "testautomation";
		
		homeMailPage.inputUsername(username);
		homeMailPage.clickButton();
		//mailPage.clickButton();
		
		
		String actualText = mailPage.getProfileText();
		String expectedText = "Hi";
		
		System.out.println(" ini text");
		System.out.println(actualText + " ini text");
		
		//Assert.assertTrue(actualText.contains(expectedText));
	}
	
	
	
	
}


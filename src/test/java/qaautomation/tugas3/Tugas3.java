package qaautomation.tugas3;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import tugas3.pages.LoginPageFactory;
import tugas3.pages.ProfilePageFactory;

public class Tugas3 extends BaseWebTest
{
	@Test
	public void test() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickButton();
		
		
		String actualText = profilePage.getProfileText();
		String expectedText = "You logged into a secure area!";
		
		System.out.println(actualText);
		
		AssertJUnit.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void negativeTest() {
		String username = "tomsmith";
		String password = "SuperSecretPassword";
		
		driver.get().findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.get().findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.get().findElement(By.xpath("//button[@type='submit']")).click();
		
		String actualText = driver.get().findElement(By.xpath("//div[@id='flash']")).getText();
		String expectedText = "Your password is invalid!";
		
		System.out.println(actualText);
		
		AssertJUnit.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void negativeTestRefactor() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		
		String username = "tomsmith";
		String password = "SuperSecretPassword";
		
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickButton();
		
		
		String actualText = profilePage.getProfileText();
		String expectedText = "Your password is invalid!";
		
		System.out.println(actualText);
		
		AssertJUnit.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void logoutTest() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickButton();
		profilePage.clickButton();
		
		
		String actualText = profilePage.getProfileText();
		String expectedText = "You logged out of the secure area!";
		
		System.out.println(actualText);
		
		AssertJUnit.assertTrue(actualText.contains(expectedText));
	}
	
	
	
	
}


package tugas4.yopmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailPage extends BasePageFactory {

	@FindBy(xpath = "//*[@id=\"mail\"]")
	private WebElement mailText;
	
	@FindBy(xpath = "//*[@id=\"e_ZwVjZwRkZQVkZGDlZQNjZQL0ZQD2Zt==\"]/button")
	private WebElement mailButton;

	public MailPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public String getProfileText() {
		driver.get().switchTo().frame("ifmail");
		return mailText.getText();
	}
	
	public void clickButton() {
		mailButton.click();
	}


}


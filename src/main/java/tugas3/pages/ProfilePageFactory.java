package tugas3.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePageFactory extends BasePageFactory {

	@FindBy(xpath = "//div[@id='flash']")
	private WebElement profileText;
	
	@FindBy(xpath = "//a[@class='button secondary radius']")
	private WebElement logoutButton;

	public ProfilePageFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public String getProfileText() {
		return profileText.getText();
	}
	
	public void clickButton() {
		logoutButton.click();
	}


}


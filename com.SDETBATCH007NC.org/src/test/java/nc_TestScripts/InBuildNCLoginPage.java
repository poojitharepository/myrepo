package nc_TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class InBuildNCLoginPage {
	WebDriver driver;
	@FindBy(id = "Email")
	WebElement email;
	@FindAll({ @FindBy(id = "Password"), @FindBy(name = "Password") })
	WebElement pws;
	@FindBys({ @FindBy(className = "buttons"), @FindBy(tagName = "button") })
	WebElement loginBtn;

	public void enterEmail() {
		email.clear();
		email.sendKeys("admin@yourstore.com");
	}

	public void enterPassword() {
		pws.clear();
		pws.sendKeys("admin");
	}

	public void clickOnLoginBtn() {
		loginBtn.click();
	}

	public InBuildNCLoginPage(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
}

package nc_TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NC_LoginPage {
WebDriver driver;
By email=By.id("Email");
By pws=By.id("Password");
By LoginBtn=By.tagName("button");
public void enterEmail()
{
	driver.findElement(email).clear();
	driver.findElement(email).sendKeys("admin@yourstore.com");
	}
public void enterPassword()
{
	driver.findElement(pws).clear();
	driver.findElement(pws).sendKeys("admin");
}
public void clickOnLoginBtn()
{
	driver.findElement(LoginBtn).click();
	}
public NC_LoginPage(WebDriver d)
{
this.driver=d;	
}
}

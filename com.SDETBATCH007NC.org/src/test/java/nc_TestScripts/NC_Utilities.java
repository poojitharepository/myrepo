package nc_TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NC_Utilities {
	WebDriver driver;
By sales=By.xpath("(//p[contains(text(),'Sales')])[1]");
By orders=By.xpath("//p[contains(text(),'Orders')]");
By logout=By.xpath("//a[contains(text(),'Logout')]");
public void ClickOnSales()
{
driver.findElement(sales).click();
}
public void ClickOnOrders()
{
driver.findElement(orders).click();
}
public void DoLogout()
{
	driver.findElement(logout).click();
}
public void Setup()
{
driver.get("https://admin-demo.nopcommerce.com/Admin");	
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
public void tearDown()
{
driver.quit();
}
public NC_Utilities(WebDriver d)
{
this.driver=d;
}
}

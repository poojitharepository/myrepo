package nc_TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NC_DashboardPage {
	WebDriver driver;
	By dashboard=By.xpath("//p[contains(text(),'Dashboard')]");
public void verifyDashboard()
{
boolean value=driver.findElement(dashboard).isDisplayed();
if (value==true)
{
	System.out.println("Login sucess");
	}
else
{
	System.out.println("Login failed");	
}
}
public NC_DashboardPage(WebDriver d)
{
this.driver=d;	
}
}

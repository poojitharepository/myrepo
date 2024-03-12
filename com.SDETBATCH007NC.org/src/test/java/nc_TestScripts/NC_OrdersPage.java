package nc_TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NC_OrdersPage {
	WebDriver driver;
	By ProSearch=By.xpath("//input[@id=\"search-product-name\"]");
	By SearBtn=By.xpath("//button[@id=\"search-orders\"]");
	public void ProductSearch()
	{
		driver.findElement(ProSearch).sendKeys("laptop");
	}
	public void ClickOnSearch()
	{
		driver.findElement(SearBtn).click();
	}
	public NC_OrdersPage(WebDriver d)
	{
this.driver=d;
	}
}

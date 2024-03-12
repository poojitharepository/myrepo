package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExample21 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement email = driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement pwd = driver.findElement(By.name("Password"));
		pwd.clear();
		pwd.sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("(//p[contains(text(),'Sales')])[1]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Return requests')]")).click();
	WebElement returnrequests=	driver.findElement(By.id("ReturnRequestStatusId"));
	Select Selection=new Select(returnrequests);
	Selection.selectByVisibleText("Pending");
	driver.findElement(By.id("search-returnrequests")).click();
Thread.sleep(1000);
driver.quit();
	}

}

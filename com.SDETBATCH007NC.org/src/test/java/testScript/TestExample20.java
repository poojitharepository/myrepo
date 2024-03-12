package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExample20 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement email = driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement pwd = driver.findElement(By.name("Password"));
		pwd.clear();
		pwd.sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
driver.findElement(By.xpath("(//p[contains(text(),'Customers')])[1]")).click();
driver.findElement(By.xpath("//p[contains(text(),'Activity log')]")).click();
		WebElement Activitytype=driver.findElement(By.name("ActivityLogTypeId"));
	Select Selection=new Select(Activitytype);
	List<WebElement>alloptions=Selection.getOptions();
	for(WebElement Singleoption:alloptions)
	{
		String val=Singleoption.getText();
		System.out.println(val);
	}
	}

}

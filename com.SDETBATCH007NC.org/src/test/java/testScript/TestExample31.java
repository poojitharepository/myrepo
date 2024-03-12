package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample31 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/admin/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		WebElement email=driver.findElement(By.id("Email"));
		boolean Email=email.isDisplayed();
		WebElement pwd=	driver.findElement(By.id("Password"));
boolean Password=pwd.isDisplayed();
if(Email=true)
	{
	if(Password=true)
	{
		email.clear();
email.sendKeys("admin@yourstore.com");
pwd.clear();
pwd.sendKeys("admin");
driver.findElement(By.tagName("button")).click();
System.out.println("Login successfully");
	}
	}
else
	{
	System.out.println("email or password is incorrect please try again");
	driver.navigate().refresh();
	}
Thread.sleep(5000);
driver.quit();;
	}
}

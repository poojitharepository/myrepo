package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testExample3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FLanguage%2FList");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement pwd = driver.findElement(By.name("Password"));
		pwd.clear();
		pwd.sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}

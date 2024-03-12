package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample19 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement pwd = driver.findElement(By.name("Password"));
		pwd.clear();
		pwd.sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
driver.findElement(By.xpath("//p[contains(text(),'Promotions')]")).click();
driver.findElement(By.xpath("//p[contains(text(),'Discounts')]")).click();
WebElement discount=driver.findElement(By.name("SearchDiscountTypeId"));
Thread.sleep(5000);
discount.click();
discount.sendKeys(Keys.DOWN);
Thread.sleep(5000);
discount.sendKeys(Keys.DOWN);
Thread.sleep(5000);
discount.sendKeys(Keys.DOWN);
Thread.sleep(5000);
discount.sendKeys(Keys.DOWN);
Thread.sleep(5000);
discount.sendKeys(Keys.DOWN);
Thread.sleep(5000);
discount.sendKeys(Keys.ENTER);
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@id=\"search-discounts\"]")).click();
Thread.sleep(5000);
driver.quit();
	}

}

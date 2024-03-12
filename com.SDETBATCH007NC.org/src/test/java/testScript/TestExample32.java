package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample32 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		WebElement email = driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement pwd = driver.findElement(By.id("Password"));
		pwd.clear();
		pwd.sendKeys("admin");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(6000);
		for (int a = 1; a <= 10; a++) {
			switch (a) {
			case 1:
				driver.findElement(By.xpath("//p[contains(text(),'Dashboard')]")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("//div[@id=\"nopcommerce-common-statistics-card\"]")).click();
				Thread.sleep(6000);
				System.out.println("Dashboard page loaded successfully");
				break;
			case 2:
				driver.findElement(By.xpath("//p[contains(text(),'Catalog')]")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("//p[contains(text(),'Products')]")).click();
				Thread.sleep(6000);
				System.out.println("Catalog page loaded successfully");
				break;
			case 3:
				driver.findElement(By.xpath("//p[contains(text(),'Sales')]")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("//p[contains(text(),'Orders')]")).click();
				Thread.sleep(6000);
				System.out.println("Sales page loaded successfully");
				break;
			case 4:
				driver.findElement(By.xpath("//p[contains(text(),'Customers')]")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("//p[contains(text(),' Online customers')]")).click();
				Thread.sleep(6000);
				System.out.println("Customers page loaded successfully");
				break;
			case 5:
				driver.findElement(By.xpath("//p[contains(text(),'Promotions')]")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("//p[contains(text(),'Discounts')]")).click();
				Thread.sleep(6000);
				System.out.println("Promotions page loaded successfully");
				break;
			case 6:
				driver.findElement(By.xpath("//p[contains(text(),'Content management')]")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("//p[contains(text(),'Polls')]")).click();
				Thread.sleep(6000);
				System.out.println("Content management page loaded successfully");
				break;
			case 7:
				driver.findElement(By.xpath("//p[contains(text(),'Configuration')]")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("//p[contains(text(),' Stores')]")).click();
				Thread.sleep(6000);
				System.out.println("Configuration page loaded successfully");
				break;
			case 8:
				driver.findElement(By.xpath("//p[contains(text(),'System')]")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("//p[contains(text(),'Log')]")).click();
				Thread.sleep(6000);
				System.out.println("Systems page loaded successfully");
				break;
			case 9:
				driver.findElement(By.xpath("//p[contains(text(),'Reports')]")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("//p[contains(text(),' Bestsellers')]")).click();
				Thread.sleep(6000);
				System.out.println("Reports page loaded successfully");
				break;
			case 10:
				driver.findElement(By.xpath("//p[contains(text(),'Help')]")).click();
				Thread.sleep(6000);
				driver.findElement(By.xpath("//p[contains(text(),' Training')]")).click();
				Thread.sleep(6000);
				System.out.println("Help page loaded successfully");
				break;
			}
		}
		Thread.sleep(6000);
		driver.quit();
	}
}

package testScript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample13 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String cd=driver.getWindowHandle();
		System.out.println(cd);
		WebElement email = driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		WebElement pwd = driver.findElement(By.name("Password"));
		pwd.clear();
		pwd.sendKeys("admin");
		driver.findElement(By.tagName("Button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(text(),'Help')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Training')]")).click();
		Thread.sleep(5000);
		Set<String>emd = driver.getWindowHandles();
		System.out.println(emd);
		Thread.sleep(5000);
		driver.quit();
	}

}

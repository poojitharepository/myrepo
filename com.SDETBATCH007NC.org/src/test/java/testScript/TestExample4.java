package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2F");
		driver.manage().window().maximize();
		WebElement input= driver.findElement(By.xpath("//div[@class='form-fields']/descendant :: input"));
		input.clear();
		input.sendKeys("admin.com");
		Thread.sleep(5000);
		driver.quit();
	}

}

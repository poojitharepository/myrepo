package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestExample30 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("button"))));
		driver.findElement(By.tagName("button")).click();
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[contains(text(),'Configuration')]"))));
		driver.findElement(By.xpath("//p[contains(text(),'Configuration')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Settings')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(" //p[contains(text(),'General settings')]"))));
		driver.findElement(By.xpath(" //p[contains(text(),'General settings')]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@name=\"store-scope-configuration\"]"))));
		driver.findElement(By.xpath("//select[@name=\"store-scope-configuration\"]")).click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}

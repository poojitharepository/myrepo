package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample18 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		boolean val1 = driver.findElement(By.tagName("label")).isSelected();
		System.out.println("Is checkbox got selected? " + val1);
		boolean val2 = driver.findElement(By.tagName("button")).isEnabled();
		System.out.println("Is Login button got enabled? " + val2);
		driver.findElement(By.tagName("button")).click();
		boolean val3 = driver.findElement(By.tagName("h1")).isDisplayed();
		System.out.println("Is dashboard displayed? " + val3);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(text(),'Catalog')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Products')]")).click();
		boolean val4 = driver.findElement(By.xpath("//p[contains(text(),'Catalog')]")).isDisplayed();
		System.out.println("Is Product page got loaded? " + val4);
		driver.findElement(By.id("SearchProductName")).sendKeys("Build your own computer");
		Thread.sleep(5000);
		driver.findElement(By.id("search-products")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		boolean val5 = driver.findElement(By.name("Password")).isDisplayed();
		System.out.println("Is Logout successful? " + val5);
		Thread.sleep(5000);
		driver.quit();

	}

}

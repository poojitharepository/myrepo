package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample16 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");	
driver.manage().window().maximize();
driver.findElement(By.id("Email")).clear();
driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
driver.findElement(By.name("Password")).clear();
driver.findElement(By.name("Password")).sendKeys("admin",Keys.TAB,Keys.TAB,Keys.ENTER);
Thread.sleep(5000);
driver.quit();
	}
}

package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample33 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.findElement(By.tagName("button")).click();
		int a=1;
		int count=3;
		while(a<=count)
		{
			driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
			driver.findElement(By.xpath("//p[contains(text(),'Products')]")).click();
			driver.findElement(By.xpath("//a[@class=\"btn btn-default\"]")).click();
			a++;
		}
		driver.quit();
}
}
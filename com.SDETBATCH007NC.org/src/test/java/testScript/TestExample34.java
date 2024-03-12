package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample34 {

	public static void main(String[] args) {
		int a=1;
		int count=2;
		do {
			ChromeDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
			driver.findElement(By.tagName("button")).click();
			System.out.println("Login Successfully");
			driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
			driver.findElement(By.xpath("//p[contains(text(),'Products')]")).click();
			driver.findElement(By.xpath("//select[@name=\"SearchCategoryId\"]")).click();
			driver.quit();
		}while(a<=count);

	}

}

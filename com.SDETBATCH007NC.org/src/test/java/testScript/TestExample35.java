package testScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample35 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("(//p[contains(text(),'Catalog')])[1]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Products')]")).click();
		List<WebElement> allInputs= driver.findElements(By.tagName("input"));
		for(WebElement input:allInputs) {
		String val=	input.getAttribute("name");
		System.out.println(val);
		}
Thread.sleep(5000);
driver.quit();
	}

}

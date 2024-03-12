package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample11 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
driver.manage().window().maximize();
WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
email.clear();
email.sendKeys("admin@yourstore.com");
WebElement pwd= driver.findElement(By.xpath("//input[@name='Password']"));
pwd.clear();
pwd.sendKeys("admin");
WebElement login=driver.findElement(By.xpath("//div[@class='buttons']"));
login.click();
Thread.sleep(5000);
driver.navigate().to("https://admin-demo.nopcommerce.com/Admin/CustomerRole/List");
String url=driver.getCurrentUrl();
System.out.println(url);
Thread.sleep(5000);
driver.quit();
	}

}

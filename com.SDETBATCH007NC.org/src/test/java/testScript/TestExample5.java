package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample5 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2F");
driver.manage().window().maximize();
List<WebElement>allDivs= driver.findElements(By.tagName("div"));
int count=allDivs.size();
System.out.println("total divs size is" +count);
Thread.sleep(5000);
driver.quit();
	}

}

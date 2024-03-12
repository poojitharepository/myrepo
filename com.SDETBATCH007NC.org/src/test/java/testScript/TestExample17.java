package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample17 {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
String num=driver.findElement(By.tagName("Label")).getText();
System.out.println(num);
String check=driver.findElement(By.name("RememberMe")).getAttribute("id");
System.out.println(check);
String val =driver.findElement(By.tagName("Button")).getText();
System.out.println(val);
driver.quit();
	}

}

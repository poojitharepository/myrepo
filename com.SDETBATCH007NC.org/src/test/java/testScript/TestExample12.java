package testScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample12 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
String std=driver.getPageSource();
System.out.println(std);
Thread.sleep(5000);
driver.quit();
	}

}

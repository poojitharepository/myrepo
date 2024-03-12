package testScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2FAdmin%2FLanguage%2FList");
		Thread.sleep(5000);
		driver.quit();
	}

}

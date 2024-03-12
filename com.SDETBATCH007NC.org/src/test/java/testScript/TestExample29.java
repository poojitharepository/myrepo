package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample29 {

	public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.carehospitals.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
driver.findElement(By.xpath("//span[contains(text(),'Specialities & Treatments')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.quit();
	}

}

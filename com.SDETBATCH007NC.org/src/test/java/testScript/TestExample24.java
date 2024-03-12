package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample24 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(5000);
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("(//a[@title=\"View larger image\"])[1]")).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
driver.findElement(By.xpath("(//a[@title=\"Delete this image\"])[2]")).click();
		Thread.sleep(4000);
	driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.quit();
	}

}

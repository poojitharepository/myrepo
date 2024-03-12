package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TestExample25 {

	public static void main(String[] args) throws InterruptedException {
EdgeDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
Thread.sleep(5000);
driver.switchTo().frame(3);
driver.findElement(By.xpath("(//a[@title=\"View larger image\"])[1]")).click();
driver.switchTo().defaultContent();
Thread.sleep(4000);
driver.quit();
	}

}

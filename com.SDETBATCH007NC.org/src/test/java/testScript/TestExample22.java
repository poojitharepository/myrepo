package testScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample22 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://demoqa.com/alerts");
driver.manage().window().maximize();
driver.findElement(By.xpath("//button[@id='alertButton']")).click();
Thread.sleep(1000);
Alert popup1=driver.switchTo().alert();
String Alertmsg1=popup1.getText();
System.out.println("First popup message is"+Alertmsg1);
Thread.sleep(1000);
popup1.accept();
Thread.sleep(1000);
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
Alert popup2=driver.switchTo().alert();
String Alertmsg2=popup2.getText();
System.out.println("Second popup message is"+Alertmsg2);
Thread.sleep(1000);
popup2.dismiss();
Thread.sleep(1000);
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
Alert popup3=driver.switchTo().alert();
popup3.sendKeys("Poojitha");
String Alertmsg3=popup1.getText();
System.out.println("Third popup message is"+Alertmsg3);
Thread.sleep(1000);
popup3.accept();
Thread.sleep(8000);
driver.quit();
	}

}

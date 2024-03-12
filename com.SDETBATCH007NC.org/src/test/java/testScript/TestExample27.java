package testScript;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestExample27 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
Actions action=new Actions(driver);
WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
email.clear();
email.sendKeys("admin@yourstore.com");
WebElement pwd=driver.findElement(By.xpath("//input[@value=\"admin\"]"));
pwd.clear();
pwd.sendKeys("admin");
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
Thread.sleep(5000);
action.moveToElement(driver.findElement(By.id("nopSideBarPusher"))).perform();
Thread.sleep(5000);
action.doubleClick().perform();
driver.findElement(By.xpath("(//p[contains(text(),'Sales')])[1]")).click();
driver.findElement(By.xpath("//p[contains(text(),'Orders')]")).click();
action.moveToElement(driver.findElement(By.xpath("(//span[@class=\"k-select\"])[1]"))).perform();
Thread.sleep(5000);
action.click().perform();
Thread.sleep(5000);
driver.quit();

}

}

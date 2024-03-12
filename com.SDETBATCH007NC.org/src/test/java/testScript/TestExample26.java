package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample26 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
		email.clear();
email.sendKeys("admin@yourstore.com");
WebElement pwd=driver.findElement(By.xpath("//input[@value=\"admin\"]"));
pwd.clear();
pwd.sendKeys("admin");
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//p[contains(text(),'Customers')])[1]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath(" //p[contains(text(),'Activity log')]")).click();
Thread.sleep(5000);
List<WebElement> AllRows=driver.findElements(By.xpath("//table[@id=\"activityLog-grid\"]/tbody/tr"));
int rowCount=AllRows.size();
System.out.println("Number of rows in activity log table are :" +rowCount);
Thread.sleep(5000);
List<WebElement>AllColumns=driver.findElements(By.xpath("//table[@id=\"activityLog-grid\"]/tbody/tr[1]/td"));
int ColumnsCount=AllColumns.size();
System.out.println("Number of Columns in activity log table are :" +ColumnsCount);
Thread.sleep(5000);
List<WebElement>AllHeadRows=driver.findElements(By.xpath("//div[@class=\"dataTables_scrollHeadInner\"]/table/thead/tr"));
int HeadRows=AllHeadRows.size();
List<WebElement>AllHeadColumns=driver.findElements(By.xpath("//div[@class=\"dataTables_scrollHeadInner\"]/table/thead/tr/th"));
int HeadColumns=AllHeadColumns.size();
for (int co = 1; co <= HeadColumns; co++) {
		String val = driver.findElement(By.xpath("//div[@class=\"dataTables_scrollHeadInner\"]/table/thead/tr/th["+co+"]")).getText();
		System.out.print(val+"	");
}
System.out.println();

for(int r=1;r<=rowCount;r++)
{
	for(int c=1;c<=ColumnsCount;c++)
	{
	String value=driver.findElement(By.xpath("//table[@id='activityLog-grid']/tbody/tr["+r+"]/td["+c+"]")).getText();
	System.out.print(value+ " ");
	}
	System.out.println();
	}
driver.quit();
	}

}

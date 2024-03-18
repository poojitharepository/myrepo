package nc_TestScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ValidateNCLoginPageWithInBuiltPOM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		NC_Utilities ncu=new NC_Utilities(driver);
		InBuildNCLoginPage iblp=new InBuildNCLoginPage(driver);
		ncu.Setup();
		Thread.sleep(2000);
		iblp.enterEmail();
		iblp.enterPassword();
		iblp.clickOnLoginBtn();
		Thread.sleep(2000);
		ncu.DoLogout();
		Thread.sleep(2000);
		ncu.tearDown();		

	}

}

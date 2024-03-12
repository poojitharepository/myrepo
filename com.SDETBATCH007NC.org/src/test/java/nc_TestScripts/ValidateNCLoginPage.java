package nc_TestScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import nc_TestScripts.NC_LoginPage;
import nc_TestScripts.NC_Utilities;
public class ValidateNCLoginPage {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	NC_LoginPage nlp=new NC_LoginPage(driver);
	NC_DashboardPage ndp=new NC_DashboardPage(driver);
	NC_Utilities ncu=new NC_Utilities(driver);
	NC_OrdersPage nop=new NC_OrdersPage(driver);
	ncu.Setup();
	nlp.enterEmail();
	nlp.enterPassword();
	nlp.clickOnLoginBtn();
	ndp.verifyDashboard();
	ncu.ClickOnSales();
	nop.ProductSearch();
	nop.ClickOnSearch();
	ncu.DoLogout();
	ncu.tearDown();
	}

}

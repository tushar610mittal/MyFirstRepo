package qa.crm.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import qa.crm.base.TestBase;
import qa.crm.listeners.CustomListener;
import qa.crm.pages.LoginEntryPage;
import qa.crm.pages.LoginPage;

@Listeners(CustomListener.class)
public class LoginTest extends TestBase {
	LoginPage lp;
	LoginEntryPage lpe;
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		lp= new LoginPage();
	}
	
	@Test(priority=1)
	public void ValidateTitle() {
		String title= lp.pagetitle();
		Assert.assertEquals(title, "#1 Free CRM customer relationship management software cloud");
	}
	
	@Test(priority=3)
	public void ValidateURL() {
		String url= lp.pageURL();
		Assert.assertEquals(url, "https://freecrm.com/");
	}
	
	@Test(priority=2)
	public void ValidatePricing() {
		boolean display= lp.verifyPricing();
		Assert.assertEquals(display, true);
	}
	
	@Test(priority=4)
	public void ValidateLogin() {
		lpe= lp.verifyLogin();
		String title1= lpe.loginEntryTitle();
		Assert.assertEquals(title1, "Cogmento CRM");
	}
	
	
	@AfterMethod
	public void teardown() {
		dr.quit();
	}

}

package qa.crm.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import qa.crm.base.TestBase;
import qa.crm.listeners.CustomListener;
import qa.crm.pages.HomePage;
import qa.crm.pages.LoginEntryPage;
import qa.crm.pages.LoginPage;

@Listeners(CustomListener.class)
public class LoginEntryTest extends TestBase {
	
	LoginPage lp;
	LoginEntryPage lpe;
	HomePage home;
	
	public LoginEntryTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		lp= new LoginPage();
		lpe= new LoginEntryPage();
		home= new HomePage();
	}
	
	@Test()
	public void Validateloginbtn()  {
		lpe= lp.verifyLogin();
		home= lpe.loginButton(prop.getProperty("E-mailaddress"), prop.getProperty("password"));
		String homeURL= home.homepageURL();
		Assert.assertEquals(homeURL, "https://ui.cogmento.com/");
	}
	
	@Test()
	public void InvalidDetails() {
		lpe= lp.verifyLogin();
		String message= lpe.invalidlogin(prop.getProperty("e-mail"), prop.getProperty("password1"));
		Assert.assertEquals(message, "Invalid login");
	}
	
	@AfterMethod
	public void teardown() {
		dr.quit();
	}

}

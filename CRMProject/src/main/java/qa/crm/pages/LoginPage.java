package qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.crm.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//a[@href='https://ui.cogmento.com']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='Pricing']")
	WebElement price;
	
	public LoginPage() {
		PageFactory.initElements(dr, this);
	}
	
	public String pagetitle() {
		return dr.getTitle();
	}
	
	public String pageURL() {
		return dr.getCurrentUrl();
	}
	
	public boolean verifyPricing() {
		return price.isDisplayed();
	}
	
	public LoginEntryPage verifyLogin() {
		login.click();
		return new LoginEntryPage();
	}
	

}

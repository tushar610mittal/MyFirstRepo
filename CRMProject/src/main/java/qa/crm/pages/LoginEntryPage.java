package qa.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.crm.base.TestBase;

public class LoginEntryPage extends TestBase {
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//*[text()='Invalid login']")
	WebElement msg;
	
	public LoginEntryPage() {
		PageFactory.initElements(dr, this);
	}
	
	public String loginEntryTitle() {
		return dr.getTitle();
	}
	
	public HomePage loginButton(String un, String pwd) {
		email.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		return new HomePage();
	}
	
	public String invalidlogin(String un, String pwd) {
		email.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		return msg.getText();
	}

}

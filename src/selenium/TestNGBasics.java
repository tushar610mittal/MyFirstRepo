package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	WebDriver dr;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tushar.mittal\\Documents\\Java code\\Automation\\Driver\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();

		dr.get("http://www.google.com");

	}

	@Test
	public void Titletest() {
		String str= dr.getTitle();
		System.out.println("Title is--->" +str);
		Assert.assertEquals(str, "Google");

	}
	@Test
	public void ButtonTest(){
		boolean b= dr.findElement(By.xpath("(//input[@aria-label='Google Search'])[2]")).isDisplayed();
		System.out.println(b);
	}
	
	@AfterTest
	public void teardown() {
		dr.quit();
	}

}
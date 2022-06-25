package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tushar.mittal\\Documents\\Java code\\Automation\\Driver\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();

		dr.get("http:www.google.com");

		WebElement textbox = dr.findElement(By.xpath("//input[@type='text']"));

		textbox.sendKeys("Facebook");

		//textbox.sendKeys(Keys.ENTER);

		// dr.findElement(By.xpath("//a[text()='Images']")).click();

	}

}

package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

	public static void main(String[] args) {

		// dr.get("http:www.facebook.com");
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tushar.mittal\\Documents\\Java code\\Automation\\Driver\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.get("https://www.youtube.com/");
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();

		dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement ele = dr.findElement(By.xpath("//input[contains(@id,'search')]"));
		ele.sendKeys("Zara Zara");
		ele.sendKeys(Keys.ENTER);

		// List<WebElement> list=dr.findElements(By.tagName("a"));
		// System.out.println(list.size());

		// for(int i=0; i<list.size(); i++) {
		// System.out.println(list.get(i).getText());
		// }

		// dr.get("http://www.google.com");
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
		// dr.quit();

	}

}

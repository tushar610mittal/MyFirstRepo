package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseConcepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tushar.mittal\\Documents\\Java code\\Automation\\Driver\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();

		dr.get("https://paytm.com/");
		dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();

		Actions action = new Actions(dr);
		action.moveToElement(dr.findElement(By.xpath("//a[text()='Company']"))).build().perform();

		dr.findElement(By.xpath("//a[text()='Contact Us']")).click();
	}

}

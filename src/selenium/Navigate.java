package selenium;

import java.io.BufferedReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tushar.mittal\\Documents\\Java code\\Automation\\Driver\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();

		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();

		dr.get("http://www.google.com");
		dr.navigate().to("http://www.youtube.com");

		Thread.sleep(3000);

		dr.navigate().back();

		Thread.sleep(3000);

		dr.navigate().forward();

		Thread.sleep(2000);

		dr.navigate().back();
	}

}

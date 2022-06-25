package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tushar.mittal\\Documents\\Java code\\Automation\\Driver\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		
		dr.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		dr.get("https://www.demo.guru99.com/popup.php");
		dr.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		String Parent= dr.getWindowHandle();
		System.out.println(Parent);
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
		
		Set<String> handle= dr.getWindowHandles();
		for(String child: handle) {
			if(!child.equals(Parent))
				dr.switchTo().window(child);
		}
		String child= dr.getWindowHandle();
		System.out.println(child);
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
		
		dr.close();
		
		dr.switchTo().window(Parent);
		dr.findElement(By.xpath("//a[text()='Insurance Project']")).click();
	}

}

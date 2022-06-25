package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tushar.mittal\\Documents\\Java code\\Automation\\Driver\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();

		dr.get("https://mail.rediff.com/cgi-bin/login.cgi");
		dr.findElement(By.xpath("//input[@type='submit']")).click();

		Alert al = dr.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(5000);
		al.accept();

	}

}

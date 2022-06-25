package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tushar.mittal\\Documents\\Java code\\Automation\\Driver\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();

		dr.get("https://4achievers.com/contact");

		Select select = new Select(dr.findElement(By.xpath("//select")));
		select.selectByVisibleText("Net Suite Training");
	}

}

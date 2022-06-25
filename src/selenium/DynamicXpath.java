package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tushar.mittal\\Documents\\Java code\\Automation\\Driver\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("http://www.google.com");
		
		dr.findElement(By.xpath("//input[@title='Search']")).sendKeys("testing");
		
		List<WebElement> list=dr.findElements(By.xpath("(//ul[@role='listbox'])[2]//li/descendant::div[@class='wM6W7d']"));

		System.out.println(list.size());
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("testingxperts")) {
				list.get(i).click();
				break;
			}
		}
	}

}

package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tushar.mittal\\Documents\\Java code\\Automation\\Driver\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();

		dr.get("https://jqueryui.com/droppable/");
		dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();

		WebElement ele = dr.findElement(By.xpath("//iframe"));

		dr.switchTo().frame(ele);

		Actions action = new Actions(dr);
		action.clickAndHold(dr.findElement(By.xpath("//div[@id='draggable']")))
				.moveToElement(dr.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();

		List<WebElement> list = dr.findElements(By.tagName("div"));
		System.out.println(list.size());

	}
}

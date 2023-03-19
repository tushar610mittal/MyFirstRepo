package qa.crm.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static qa.crm.util.Constants.*;

public class TestBase {

	public static WebDriver dr;
	public static Properties prop;

	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(propertyfile);
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {
		String bname = prop.getProperty("Browser");
		if (bname.equals("Chrome"))
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\tushar.mittal\\Documents\\Java code\\Automation\\Driver\\chromedriver.exe");

		dr = new ChromeDriver();

		dr.get(prop.getProperty("URL"));

		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();

		dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageload));
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeunit));
	}
	
	public static void failed(String methodname) {
		File scrfile= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrfile, new File("C:\\Users\\tushar.mittal\\Documents\\Java code\\CRMProject\\screenshots"
													+methodname+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

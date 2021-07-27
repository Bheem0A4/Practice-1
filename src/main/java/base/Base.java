package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Bheemesh\\Learnings\\Selenium\\Jars\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	
	public void tearDown()
	{
		driver.quit();
	}

}

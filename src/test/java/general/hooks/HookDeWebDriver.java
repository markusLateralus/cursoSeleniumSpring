package general.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookDeWebDriver {

	public static WebDriver webdriver;
	
	@Before
	public static void antesDeEjecutarse() {
		System.setProperty("webdriver.chrome.driver", "./drivers/windows/chromedriver.exe");
	    webdriver=new ChromeDriver();
	    webdriver.manage().window().maximize();
	   // webdriver.get("https://www.globalsqa.com/contact-us/");
	}
	
	@After
	public static void despuesDeEjecutarse() {
		if(webdriver!=null) {
			webdriver.quit();
		}else {
			System.out.println("dentro joooo");
		}
	
	}
}

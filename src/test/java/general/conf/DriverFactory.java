package general.conf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import general.enums.Navegador;

public class DriverFactory {

	public static WebDriver get(Navegador navegador) {
		if(Navegador.chrome==navegador) {
			System.setProperty("webdriver.chrome.driver", "./drivers/windows/chromedriver.exe");
			return new ChromeDriver();
		}
		if(Navegador.firefox==navegador) {
			
		}
		if(Navegador.ie==navegador) {
			
		}
		return new ChromeDriver();
	}
}

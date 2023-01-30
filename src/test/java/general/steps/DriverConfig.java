package general.steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import general.conf.DriverFactory;
import general.enums.Navegador;

@Configuration
@ComponentScan(basePackages="general")
@PropertySource("classpath:/aplicacion.properties")
public class DriverConfig {

    @Value("${driver.type}")
	private Navegador navegador;
    
    @Value("${element.wait.timeout.seconds}")
    private int tiempo; //tiempo de espera para WWebDriverWait
	
	@Bean  //es un pojo, un objeto, y se crea como un singleton spring lo crea y lo maneja
	public WebDriver getWebDriver() {
		//System.setProperty("webdriver.chrome.driver", "./drivers/windows/chromedriver.exe");
		//return new ChromeDriver();
		return DriverFactory.get(navegador);
		
	}
	
	@Bean  
	public WebDriverWait esperaImplicita() {
		return new WebDriverWait(this.getWebDriver(),Duration.ofSeconds(tiempo));
		
	}
}

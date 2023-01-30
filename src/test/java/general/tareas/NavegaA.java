package general.tareas;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NavegaA {

	@Autowired
	private WebDriver webdriver;
	
	@Value("${url}")
	private String url;
	
	public void pageContacto() {
		this.webdriver.get(url);
	}
}

package general.utiles;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.springframework.beans.factory.annotation.Autowired;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ImagenHook {

	@Autowired
	private WebDriver webdriver;
	
	@After
	public void capturaImagen(Scenario escenario, String tituloImagen) {
		try {
		final byte[] imagen= ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.BYTES);
		escenario.attach(imagen,"imagen/png",tituloImagen);
		}
		catch(WebDriverException error) {
			System.out.println("Error al hacer una captura de imagen " + error.getMessage());
		}
	}
}

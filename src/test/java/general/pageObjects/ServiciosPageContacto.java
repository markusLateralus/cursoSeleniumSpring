package general.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiciosPageContacto {

	@Autowired
	private WebDriver webdriver;
	@Autowired
	private PageContacto pageContacto;
	@Autowired
	private WebDriverWait webdriverwait;
/*	
	@Autowired //spring realiza una inyeccion de dependencia sin tener que definir el atributo en la classe
	public ServiciosPageContacto(WebDriver webdriver) {
		//this.pageContacto=new PageContacto(webdriver);
		this.webdriver=webdriver;
	}
	*/
	public void ir(String url) {
		
		this.webdriver.get(url);
	}
	
	public void escribeNombre(String nombre) {
		//this.webdriver.findElement(this.pageContacto.getNombre()).sendKeys(nombre);
		webdriverwait.until(ExpectedConditions.visibilityOf(this.pageContacto.getNombre()));
		this.pageContacto.getNombre().sendKeys(nombre);
	}
	public void escribeEmail(String email) {
		this.pageContacto.getEmail().sendKeys(email);
	}
	public void escribeTituloMensaje(String titulo) {
		this.pageContacto.getTituloMensaje().sendKeys(titulo);
	}
	public void escribeMensaje(String mensaje) {
		this.pageContacto.getContenedorMensaje().sendKeys(mensaje);
	}
	public void enviar() {
		Actions accion =new Actions(this.webdriver);
		accion.click(this.pageContacto.getEnviar());
	
	}
	
}

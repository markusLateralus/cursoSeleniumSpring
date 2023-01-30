package general.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;//spring realiza una inyeccion de dependncia
import org.springframework.stereotype.Component;  //spring lo reconoce como un @Bean


import lombok.Getter;  // me genera los getters de los webElement!!!!

@Getter
@Component
public class PageContacto extends PageBase{

	@Autowired
	public PageContacto(WebDriver webdriver) {
	super(webdriver);
	}
	//@Getter
	@FindBy(id = "comment_name")
	private WebElement nombre;
	@FindBy(id = "email")
	private WebElement email;
	@FindBy(id = "subject")
	private WebElement tituloMensaje;
	@FindBy(id = "comment")
	private WebElement contenedorMensaje;
	@FindBy(id = "submit")
	private WebElement enviar;
	
	public WebElement getNombre() {
		return nombre;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getTituloMensaje() {
		return tituloMensaje;
	}
	public WebElement getContenedorMensaje() {
		return contenedorMensaje;
	}
	public WebElement getEnviar() {
		return enviar;
	}
	



}

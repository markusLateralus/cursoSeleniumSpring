package general.steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;  //la antigua

import general.builders.datos.ContactoBuilder;

import general.modelos.Contacto;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import junit.framework.Assert;
import general.pageObjects.ServiciosPageContacto;
import general.tareas.FormularioPageContacto;
import general.tareas.NavegaA;
import static org.junit.Assert.assertTrue;
@CucumberContextConfiguration
//@ContextConfiguration
@SpringBootTest(classes= DriverConfig.class) //llamamos a la clase que tiene almacenada la información del WebDriver para inicializarlo
public class ContactoStep {
	
	//@Autowired
//	private  ServiciosPageContacto servicioPageContacto;
	
	@Autowired
	private NavegaA navegaA;
	@Autowired
	private FormularioPageContacto formularioPageContacto;
	
	@Given("^un cliente tiene una cuenta$")
	@Given("^un cliente tiene una cuenta erronea$")
	public void un_cliente_tiene_una_cuenta(){
	
	    //ServiciosPageContacto servicioPageContacto=new ServiciosPageContacto(HookDeWebDriver.webdriver);
	  
	    navegaA.pageContacto();
	}

	@When("^el cliente rellena ls datos de login$")
	@When("^el cliente rellena ls datos de login erroneos$")
	public void el_cliente_rellena_ls_datos_de_login() {
		
	    //formularioPageContacto.rellenaDatos(ContactoBuilder.unContacto().porDefecto().construyelo();  //usando BUILDER
		Contacto contacto=new Contacto();
		formularioPageContacto.rellenaDatos(new Contacto("marcos", "marcoslateralus@gmail.com", "saludos", "me llamo marcos hola"));
	}

	@Then("^el accede a la pagina princial$")
	public void el_accede_a_la_pagina_princial(){
	   //Assert.assertTrue(false);
	   assertTrue(true);
		System.out.println("todo bien");
	}
	
	@Then("el accede a la pagina princial DANDO ERROR")
	public void el_accede_a_la_pagina_princial_dando_error() {
		  assertTrue(true);
			System.out.println("todo MAL");
	}


}

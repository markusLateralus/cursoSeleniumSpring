package general.builders.datos;

import general.modelos.Contacto;

public class ContactoBuilder {

	private Contacto contacto;
	
	public static ContactoBuilder unContacto() {
		return new ContactoBuilder();
	}
	/*
	public ContactoBuilder porDefecto() {
		this.contacto=Contacto.builder()
				.nombre("marcos")
				.email("marcoslateralus@gamil.com")
				.tituloMensaje("Saludos")
				.mensaje("bla bla bla")
				.build();
				
		return this;
		
	}
	
	*/
	/*
	public ContactoBuilder pero() {
		return withDefaultInfo();
	}
	*/
	/*
	public ContactoBuilder conEmail() {
		this.pero().contacto.setEmail("nuevoEmail");
		return this;
	}
	*/
	public Contacto construyelo() {
		return this.contacto;
	}
	public Contacto nuevo() {
		return new Contacto("marcos", "marcoslateralus@gmail.com", "Saludarte", "bla bla bla");
		
	}
}

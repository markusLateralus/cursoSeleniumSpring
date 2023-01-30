package general.modelos;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class Contacto {

	
	private String nombre;
	private String email;
	private String tituloMensaje;
	private String mensaje;

	public Contacto(String n, String e, String tit , String men) {
		this.nombre=n;
		this.email=e;
		this.tituloMensaje=tit;
		this.mensaje=men;
	}
	public Contacto() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTituloMensaje(String tituloMensaje) {
		this.tituloMensaje = tituloMensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getTituloMensaje() {
		return tituloMensaje;
	}

	public String getMensaje() {
		return mensaje;
	}
	
	
}

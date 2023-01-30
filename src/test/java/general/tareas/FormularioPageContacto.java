package general.tareas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import general.modelos.Contacto;
import general.pageObjects.ServiciosPageContacto;

@Component
public class FormularioPageContacto {

	@Autowired
	ServiciosPageContacto servicioPageContacto;
	
	public void rellenaDatos(Contacto contacto) {
		    servicioPageContacto.escribeNombre(contacto.getNombre());
		    servicioPageContacto.escribeEmail(contacto.getEmail());
		    servicioPageContacto.escribeTituloMensaje(contacto.getTituloMensaje());
		    servicioPageContacto.escribeMensaje(contacto.getMensaje());
		   // servicioPageContacto.enviar();
	}
	
}

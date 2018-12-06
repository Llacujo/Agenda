package spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.model.Contacto;
import spring.services.IServices;
/**
 * Clase AgendaController
 *
 * Contiene todos los metodos para controlar la vista y obtiene los datos
 * a tarves de la capa service
 *
 * @author GrupoA
 * @version 1.0
 */
@Controller
public class AgendaController {

	@Autowired
	IServices servicio;
	
	/**
     * Obtiene los datos de una entidad y carga la pagina de detalle
     * con ellos.
     * @param Id: Id de la entidad
     * @return pagina a cargar
     */
	@RequestMapping(value="/detalle", method=RequestMethod.GET)
	public String detallar(@RequestParam("id") int id,ModelMap model) {
		model.addAttribute("contacto", servicio.detallar(Contacto.class, id));
		return "detalle";
	}
	/**
     * Devuelve una lista de entidades dada una entidad a traves de la capa services
     * @param clase: Clase de una entidad
     * @return List<Entidad>: devuelve una lista de una entidad
     */
	public <T> List<T> listar(Class< T > clazz){
		servicio.setClazz(clazz);
		return servicio.listar();
	}
}

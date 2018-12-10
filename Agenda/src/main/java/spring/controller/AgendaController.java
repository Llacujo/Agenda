package spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	 * Crea un nuevo contacto a partir de los datos introducidos en la página Anadir
	 * 
	 * @return model
	 */
	@RequestMapping (value = "/anadir", method = RequestMethod.GET)
	public ModelAndView anadir () {
		ModelAndView model = new ModelAndView("Anadir"); 
		model.addObject("contacto", new Contacto());
		return model;
	}
	
	 /**
	  * Primera página de la agenda. Es una lista con el nombre de todos los contactos
	  * @return String
	  */
	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public String iniciarList(Model model) {
		System.out.println(servicio.listar(Contacto.class));
		model.addAttribute("listaContacto",servicio.listar(Contacto.class));
		return "list2";
	}
	
	/**
	 * Nos lleva a la página para editar contactos
	 * @param id: id del contacto a editar
	 * @param model
	 * @return String
	 */
	@RequestMapping(value="/editar" ,method=RequestMethod.GET)
	public String editar(@RequestParam("id") int id,ModelMap model) {
		model.addAttribute("contacto", servicio.detallar(Contacto.class,id));
		
		return "anadir";
	}
	
	/**
	 * Es el servlet encargado de editar el contacto introducido antes.
	 * Viene de la pagina de editar y nos reenvia a la lista de contactos
	 * @param contacto
	 * @return
	 */
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String edit(@ModelAttribute("contacto") Contacto contacto) {
		servicio.editar(contacto);
		return "list2";
	}
	
	/**
	 * Borra un Contacto dado su ID y redirecciona a la lista de Contactos
	 * 
	 * @return model list2
	 */
	@GetMapping("/borrar")
	public ModelAndView deleteUser(@RequestParam("id") int id) {
		
		servicio.borrar(id);
		return new ModelAndView("redirect:/");		
	}
	
	
	
	
	
	
}

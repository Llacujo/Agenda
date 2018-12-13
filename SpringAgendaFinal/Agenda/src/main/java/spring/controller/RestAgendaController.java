package spring.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import spring.model.Contacto;
import spring.model.Provincia;
import spring.services.IServices;

@RestController
@CrossOrigin(origins="*")
public class RestAgendaController {
	@Autowired
	IServices servicio;
	
	/**
     * Devuelve un contacto mediante un id a traves de la capa services
     * @param id: id de usuario
     * @return Contacto: devuelve un contacto
     */
	@RequestMapping(value="/detalleR", method=RequestMethod.GET)
	public Contacto detallar(@RequestParam("id") int id) {
		return	 (Contacto) servicio.detallar(Contacto.class, id);
	}
	/**
	 * Crea un nuevo contacto
	 * @param Contacto.class
	 * @return ResponseEntity
	 */
	@PostMapping("/anadirR")
	public void  anadir(@RequestBody Contacto contacto){
		this.servicio.editarContacto(contacto);

		
	}

	/**
	 * Devuelve una lista de todos los contactos 
	 * @return List de contactos
	 */
	@RequestMapping(value = "/R")
	public List<Contacto> listarR(){
		return servicio.listar(Contacto.class);
	}
	
	/**
	 * Borra un Contacto por su ID
	 */
	@RequestMapping(value="/borrarR", method=RequestMethod.DELETE)
	public void borrar1(@RequestParam("id") int id) {
		 servicio.borrar(id);
	}
	
	@RequestMapping(value = "/provinciaR")
	public List<Provincia> listarProvincia(){
		return servicio.listar(Provincia.class);
	}
	
}

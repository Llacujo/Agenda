package spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.model.Contacto;
import spring.services.IServices;

@RestController
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
	
}

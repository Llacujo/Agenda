package spring.services;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import spring.model.Contacto;
import spring.model.Telefono;

/**
 * Clase ServicesImpl
 * 
 * Implementacion de la clase IServices
 * 
 * @author GrupoA
 * @version 1.0
 */
@Service
public class ServicesImlp<T extends Serializable> extends ServicesAbstract<T> implements IServices<T> {

	public void editarContacto(Contacto contacto) {
		Contacto merge = dao.mergeId(contacto);
		for (Telefono tel : contacto.getTelefonos()) {
			tel.setContacto(merge);
			editar((T) tel);
		}
	}
}

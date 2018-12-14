package spring.services;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import spring.dao.IDAO;

/**
 * Clase ServicesAbstract
 * 
 * Clase generica para realizar
 * 
 * @author GrupoA
 * @version 1.0
 */

public abstract class ServicesAbstract<T extends Serializable> {

	private static final Logger logger = LoggerFactory.getLogger(ServicesAbstract.class);

	private Class<T> clazz;

	@Autowired
	IDAO<T> dao;

	/**
	 * Asigna una entidad al tipo generico
	 * 
	 * @param clase de una entidad
	 */
	public void setClazz(Class<T> clazzToSet) {
		logger.debug("Asignamdo clase" + clazzToSet + "a Services");
		this.clazz = clazzToSet;
		dao.setClazz(clazzToSet);
	}

	/**
	 * Obtiene una lista de entidades a traves del DAO
	 * 
	 * @return List<Entidad>: Lista de entidades
	 */
	public List<T> listar(Class<T> clazz) {
		logger.warn("service: listar" + clazz.getName());
		setClazz(clazz);
		return dao.listar();
	}

	/**
	 * Añade al DAO una nueva entidad
	 * 
	 * @param entity
	 */
	public void anadir(T entity) {
		logger.info("Añadiendo nuevo contacto");
		dao.anadir(entity);
	}

	/**
	 * Obtiene del DAO una entidad mediante su id
	 * 
	 * @param Id en formato int
	 * @return Objeto entidad
	 */
	public T detallar(Class<T> clazz, int id) {
		setClazz(clazz);
		return dao.detallar(id);
	}

	/**
	 * Llama al metodo editar de la clase DAOImpl, pasandole una entidad
	 * 
	 * @param entity
	 * @return
	 */
	public void editar(T entity) {

		dao.editar(entity);
	}

	/**
	 * Llama al DAO para borrar una entidad dado su ID
	 * 
	 * @param entity
	 */
	public void borrar(int id) {
		logger.info("Borrar Contacto");
		dao.borrar(id);
	}

}

package spring.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase DAOAbstract
 *
 * Clase generica con los metodos CRUD mediante EntityManager
 * 
 * @author GrupoA
 * @version 1.0
 */
public abstract class DAOAbstract<T extends Serializable> {

	private static final Logger logger = LoggerFactory.getLogger(DAOAbstract.class);

	private Class<T> clazz;

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Asigna una entidad al tipo generico
	 * 
	 * @param clase: Clase de una entidad
	 */
	public void setClazz(Class<T> clazzToSet) {
		logger.debug("Asignando clase " + clazzToSet + " al DAO");
		this.clazz = clazzToSet;
	}

	/**
	 * Obtiene mediante createquery la lista de objetos correspondientes a una
	 * entidad
	 * 
	 * @return List<Entidad>: Lista de entidades
	 */
	public List<T> listar() {
		logger.warn("dao listar");
		return entityManager.createQuery("from " + clazz.getName()).getResultList();
	}

	/**
	 * Obtiene una entidad mediante su id
	 * 
	 * @param  Id en formato int
	 * @return Objeto entidad
	 */
	public T detallar( int id ){
	      return entityManager.find( clazz, id );
	   }
}

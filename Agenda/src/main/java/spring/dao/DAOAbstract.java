package spring.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

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
	 * Añade una nueva entidad
	 * 
	 * @param entity
	 */
	public void anadir(T entity) {
		entityManager.persist(entity);
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
	
	/**
	 * Actualiza la base de datos con los datos introducidos
	 * 
	 * @param entity
	 * @return entidad
	 */
	public void editar(T entity) {
		
		entityManager.merge(entity);
	}
	
	/**
	 * Crea una Entidad a partir de su id y la envia al metodo Borrar
	 * 
	 * @param entity
	 */
	@Transactional
	 public void borrar( int id ){
	      T entity = detallar( id );
	      borrar( entity );
	   }
	
	/**
	 * Borra una Entidad a partir de su id y la envia al metodo Borrar
	 * @param entity
	 */
	@Transactional
	 public void borrar( T entity ){
	      entityManager.remove( entity );
	   }
}

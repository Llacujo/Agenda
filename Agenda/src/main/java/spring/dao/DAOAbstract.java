package spring.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Clase DAOAbstract
 *
 * Clase generica con los metodos CRUD mediante EntityManager
 * @author GrupoA
 * @version 1.0
 */
public abstract class DAOAbstract< T extends Serializable >{
	
	private static final Logger logger = LoggerFactory.getLogger(DAOAbstract.class);

	
	   private Class< T > clazz;
	 
	   @PersistenceContext
	   EntityManager entityManager;
	   /**
	     * Asigna una entidad al tipo generico
	     * @param clase: Clase de una entidad
	     */
	   public void setClazz( Class< T > clazzToSet ) {
		   logger.debug("Asignando clase "+clazzToSet+" al DAO");
	      this.clazz = clazzToSet;
	   }

}

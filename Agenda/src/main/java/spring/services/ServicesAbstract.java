package spring.services;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
		
	/**
	 * Asigna una entidad al tipo generico
	 * 
	 * @param clase de una entidad
	 */
	public void setClazz(Class<T> clazzToSet) {
		logger.debug("Asignamdo clase"+clazzToSet+"a Services");
		this.clazz=clazzToSet;
	}
	
	
}

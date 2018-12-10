package spring.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Interface IDAO
 *
 * Interface generica con los metodos CRUD 
 * 
 * @author GrupoA
 * @version 1.0
 */
public interface IDAO<T extends Serializable> {
	void setClazz(Class<T> clazzToSet);

	public List<T> listar();
	
	public void anadir(T entity);
	
	public T detallar( int id );
	
	public void editar(T entity);
	
	public void borrar(int id);
}

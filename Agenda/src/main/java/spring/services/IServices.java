package spring.services;

import java.io.Serializable;
import java.util.List;

public interface IServices <T extends Serializable>{
	
	void setClazz (Class <T> clazzToSet);
	
	List<T> listar(Class<T> clazz);
	
	public void anadir(T entity);
	
	public T detallar(Class<T> clazz, int id );
	
	public void editar(T entity);
}

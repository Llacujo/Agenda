package spring.dao;

import java.io.Serializable;



import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Clase DAOimpl
 *
 * Implementacion de la interface Idao y de la clase abstract DAOAbstract
 * con los metodos CRUD basicos 
 * @author GrupoA
 * @version 1.0
 */
@Repository
@Transactional
@Scope("prototype")
public class DAOImpl<T extends Serializable> extends DAOAbstract<T> implements IDAO<T> {


}

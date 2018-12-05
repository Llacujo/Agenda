package spring.services;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Clase ServicesImpl
 * 
 * Implementacion de la clase IServices
 * @author GrupoA
 * @version 1.0
 */
@Service("services")
@Transactional
@Scope("prototype")
public class ServicesImlp<T extends Serializable> extends ServicesAbstract<T> implements IServices<T> {

}

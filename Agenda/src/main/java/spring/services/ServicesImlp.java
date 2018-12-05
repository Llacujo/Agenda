package spring.services;

import java.io.Serializable;

import org.springframework.stereotype.Service;

/**
 * Clase ServicesImpl
 * 
 * Implementacion de la clase IServices
 * @author GrupoA
 * @version 1.0
 */
@Service
public class ServicesImlp<T extends Serializable> extends ServicesAbstract<T> implements IServices<T> {

}

package spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import spring.controller.AgendaController;
import spring.model.Contacto;
import spring.services.IServices;
/**
 * Clase ServicesListarTest
 *
 * Test sobre los métodos listar() y detallar() del paquete de servicios.
 *
 * @author Miriam
 * @version V1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ServicesTest {

	@Autowired
	IServices service;

	/**
	 * Prueba unitaria que comprueba que el método listar() devuelve una lista
	 */
	@Test
	public void ComprobarListar() {		 
		assertThat(service.listar(Contacto.class)).asList();
	}
	
	/**
	 * Prueba unitaria que comprueba que la devolución del método detallar() contiene el campo "nombre"  
	 */
	@Test
	public void ComprobarDetallar() {
		assertThat(service.detallar(Contacto.class, 1)).hasFieldOrProperty("nombre");
	}
	
	
}
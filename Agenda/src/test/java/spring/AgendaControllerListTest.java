package spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import spring.controller.AgendaController;
import spring.model.Contacto;
/**
 * Clase AgendaControllerListTest
 *
 * Contiene un test basico sobre el metodo list() de AgendaController del paquete controller
 *
 * @author Andoni
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AgendaControllerListTest {

	@Autowired
	AgendaController control;

	/**
     * A traves de un Autowired trae un objeto de clase AgendaController
     * y utiliza el metodo list() de la clase para obtener una lista de entidades 
     * Contacto comprobando si la lista generada es realmente una lista.
     */
	@Test
	public void devuelveLista() {
		 
		assertThat(control.listar(Contacto.class)).asList();
		
	}
}

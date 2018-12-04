package spring;

/**
 * Clase Test AgendaControllerTest
 * 
 * @author Jorge
 * @version 1.0
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AgendaControllerTest {
	
	@Autowired
	AgendaController controller;
	
	/**
	 *Prueba unitaria para el controlador.
	 *Comprueba que no crea objetos vacios
	 * @throws Exception
	 */
	@Test
	public void compruebaQueNoInyectaObjetoNulo() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	

}
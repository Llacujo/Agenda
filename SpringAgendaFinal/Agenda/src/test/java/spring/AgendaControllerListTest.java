package spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import spring.controller.AgendaController;
import spring.dao.DAOImpl;
import spring.model.Contacto;
import spring.services.ServicesImlp;
/**
 * Clase AgendaControllerListTest
 *
 * Contiene un test basico sobre el metodo list() de AgendaController del paquete controller
 *
 * @author Andoni
 * @version 1.0
 */
@RunWith(SpringRunner.class)

@WebMvcTest(AgendaController.class)
public class AgendaControllerListTest {

	  @Autowired
	    private MockMvc mockMvc;
	  
	  @MockBean
	    private ServicesImlp servicio;

	/**
     * A traves de un Autowired trae un objeto de clase AgendaController
     * y utiliza el metodo list() de la clase para obtener una lista de entidades 
     * Contacto comprobando si la lista generada es realmente una lista.
	 * @throws Exception 
     */
	@Test
	public void devuelveLista() throws Exception {
	
		List lista=new ArrayList();
		lista.add(new Contacto());
		lista.add(new Contacto());
		when(servicio.listar(Contacto.class)).thenReturn(lista);
		mockMvc.perform(get("/"))
        .andExpect(status().isOk())
       
        .andExpect(model().attribute("listaContacto", lista));
		
	}
}

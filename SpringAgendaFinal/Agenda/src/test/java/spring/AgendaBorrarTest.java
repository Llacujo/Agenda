package spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import spring.controller.AgendaController;
import spring.controller.RestAgendaController;
import spring.dao.IDAO;
import spring.model.Contacto;
import spring.services.IServices;
import spring.services.ServicesImlp;

/**
 * Clase AgendaBorrarTest
 *
 * Comprueba  el metodo borrar del controlador Rest
 *
 * @author Miguel
 * @version 1.0
 */

@RunWith(SpringRunner.class)
@WebMvcTest(RestAgendaController.class)
public class AgendaBorrarTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private IServices servicios;
	
	@Test
	public void servletEditarWorks() throws Exception{
		
		this.mockMvc.perform(delete("/borrarR?id=1"))
		.andExpect(status().isOk());
	}

}


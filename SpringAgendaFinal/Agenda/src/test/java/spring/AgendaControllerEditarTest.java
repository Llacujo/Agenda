package spring;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import spring.controller.AgendaController;
import spring.model.Contacto;
import spring.services.IServices;

/**
 * Prueba unitaria para comprobar que el servlet mapeado como "/anadir" funciona.
 * Creamos un dummy de tipo Contacto para poder acceder a la pagina, luego se borra.
 * @throws Exception
 */
@RunWith(SpringRunner.class)
@WebMvcTest(AgendaController.class)
class AgendaControllerEditarTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private IServices servicios;
	
	@Test
	public void servletEditarWorks() throws Exception{
		Contacto contacto=new Contacto();
		contacto.setIdContacto(-1);
		servicios.anadir(contacto);
		
		this.mockMvc.perform(post("/editar?id=-1"))
		.andExpect(status().isOk())
		//.andExpect(content().mimeType("text/html"))
		.andExpect(forwardedUrl("/WEB-INF/views/anadir.jsp"));
	}

}

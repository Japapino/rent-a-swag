package rentaswag.website;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

public class browseMVCTest {
	
	@Resource MockMvc mvc; 
	
	@Test
	public void shouldDisplayProducts() throws Exception {
		mvc.perform(get("/products")).andExpect(status().isOk()); 
	}
}

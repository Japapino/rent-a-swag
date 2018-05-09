package rentaswag.website;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.boot.test.web.client.TestRestTemplate;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class containerRestTest {
	@Resource
	private TestRestTemplate restTemplate; 
	
	@Test
	public void shouldDisplayCart() {
		ResponseEntity<String> response = restTemplate.getForEntity("/cart", String.class); 
		
		HttpStatus status = response.getStatusCode(); 
		
		assertThat(status, is(HttpStatus.OK)); 
		}
}

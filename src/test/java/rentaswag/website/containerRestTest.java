package rentaswag.website;

import javax.annotation.Resource;
import static org.hamcrest.Matchers.greaterThan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ContainerRestTest {
	
	@Resource
	private TestRestTemplate restTemplate; 
	
	//neither not yet passing as of 7c64be...fe01a55
	@Test
	public void shouldDisplayProducts() {
		ResponseEntity<String> response = restTemplate.getForEntity("/products", String.class); 
		HttpStatus status = response.getStatusCode(); 
		assertThat(status, is(HttpStatus.OK)); 
		}
	
	@Test
	public void shouldCreateNewProduct() {
		Product product = new Product("test");
		ResponseEntity<Product> response = restTemplate.postForEntity("/products", product, Product.class);
		assertThat(response.getBody().getId(), is(greaterThan(0L)));
	}
}

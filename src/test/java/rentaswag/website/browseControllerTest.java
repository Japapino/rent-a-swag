package rentaswag.website;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.not;


public class browseControllerTest {
//	@InjectMocks
	BrowseController underTest; 
//	
//	@Mock
//	private Product product; 
	
	@Before
	public void setup() {
		underTest = new BrowseController(); 
	}
	
	@Test
	public void shouldFindAllProducts() {
		Collection<Product> result = underTest.findAllProducts(); 
		
		assertThat(result.size(), is(greaterThan(0)));
	}
	
	@Test
	public void shouldFindProductById() {
		Product result = underTest.findOneById(1L); 
		
		assertThat(result, is(not(nullValue()))); 
	}
}

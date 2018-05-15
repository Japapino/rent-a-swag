package rentaswag.website;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.contains;


public class browseControllerTest {
	@InjectMocks
	BrowseController underTest; 
	
	@Mock
	private ProductRepository productRepo; 
	
	@Mock
	private Product product; 
	
	@Before
	public void setup() {
//		underTest = new BrowseController(); 
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void shouldFindAllProducts() {
//		Collection<Product> result = underTest.findAllProducts(); 
//		assertThat(result.size(), is(greaterThan(0)));
		when(productRepo.findAll()).thenReturn(Collections.singleton(product));
		
		Iterable<Product> result = underTest.findAllProducts(); 
		
		assertThat(result, contains(any(Product.class))); 
		
	}
	
	@Test
	public void shouldFindProductById() {
		Product result = underTest.findOneById(1L); 
		
		assertThat(result, is(not(nullValue()))); 
	}
	
	@Test
	public void shouldFindAllProductsInDataBase() {
		when(productRepo.findAll()).thenReturn(Collections.singleton(product)); 
		Iterable<Product> result = underTest.findAllProducts();
		assertThat(result, contains(product)); 
	}
}

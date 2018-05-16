package rentaswag.website;

import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class BrowseControllerTest {
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
		when(productRepo.findOne(1L)).thenReturn(product); 
		
		Product result = underTest.findProductById(1L); 
		
		assertThat(result, is(product)); 
	}
	
	@Test
	public void shouldFindAllProductsInDataBase() {
		when(productRepo.findAll()).thenReturn(Collections.singleton(product)); 
		Iterable<Product> result = underTest.findAllProducts();
		assertThat(result, contains(product)); 
	}
}

package rentaswag.website;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.hamcrest.Matchers.is;
import org.junit.Before;
import static org.junit.Assert.assertThat;

public class MaintenanceControllerTest {

	@InjectMocks
	MaintenanceController underTest;
	
	@Mock
	private ProductRepository productRepo;
	
	@Mock
	private Product incomingProduct; 
	
	@Mock
	private Product persistantProduct; 
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void shouldCreateNewProduct() {
		when(productRepo.save(incomingProduct)).thenReturn(persistantProduct);
		Product result = underTest.addNewProduct(incomingProduct);
		assertThat(result, is(persistantProduct));
	}
	
}

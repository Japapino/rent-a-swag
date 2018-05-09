package rentaswag.website;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class browseControllerTest {
	
	BrowseController underTest; 
	
	@Before
	public void setup() {
		underTest = new BrowseController(); 
	}
	
	@Test
	public void shouldFindAllProducts() {
		Collection<Product> result = underTest.findProducts(); 
		
		assertThat(result.size(), is(greaterThan(0)));
	}
}

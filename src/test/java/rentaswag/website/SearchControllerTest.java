package rentaswag.website;
import static org.hamcrest.Matchers.is;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.Before;

public class SearchControllerTest {
	
	SearchController underTest; 
	
	@Before(value = "") 
	public void setup() {
		underTest = new SearchController(); 
	}
	
	@Test
	public void shouldSearchAndFindOneProductByName() {
		Product result = underTest.findOneByName("test"); 
		assertThat(result.getName(), is("test"));
	}

}

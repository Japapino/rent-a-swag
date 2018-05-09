package rentaswag.website;

import java.util.Collection;
import java.util.Collections;

public class BrowseController {
	
	public Collection<Product> findProducts() {
		return Collections.singleton(new Product()); 
	}

}

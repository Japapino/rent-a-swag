package rentaswag.website;

import java.util.Collection;
import java.util.Collections;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrowseController {
	
	@RequestMapping("/products")
	public Collection<Product> findAllProducts() {
		return Collections.singleton(new Product("Test")); 
	}

	@RequestMapping("/products/{id}")
	public Product findOneById(@PathVariable long id) {
		
		return new Product("Test");
	}

}

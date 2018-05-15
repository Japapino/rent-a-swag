package rentaswag.website;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrowseController {
	
	@Resource
	private ProductRepository productRepo; 
	
	@RequestMapping("/products")
//	public Collection<Product> findAllProducts() {
//		return Collections.singleton(new Product("Test")); 
//	}
	public Iterable<Product> findAllProducts() {
		return productRepo.findAll(); 
	}

	@RequestMapping("/products/{id}")
	public Product findOneById(@PathVariable long id) {
		
		return new Product("Test");
	}

}

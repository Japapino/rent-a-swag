package rentaswag.website;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
		
	@RequestMapping("/search")
	public Product findOneProductByName(String input) {
		return new Product(input); 
	}


}

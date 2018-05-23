package rentaswag.website;

import javax.annotation.Resource;

import org.springframework.data.repository.CrudRepository;

@Resource
public interface ProductRepository extends CrudRepository<Product, Long>{

	Product findOne(long id);
	
}

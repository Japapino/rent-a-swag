package rentaswag.website;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long>{

	Product findOne(long id);
}

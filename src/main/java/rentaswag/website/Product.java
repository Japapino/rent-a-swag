package rentaswag.website;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue //caused container rest test to fail
	private long id; 
	
	private String name; 
	
	@SuppressWarnings("unused")
	private Product() {}
	
	public Product(String name) {
		this.name = name; 
	}

	public String getName() {
		return name; 
	}
	
	public long getId() {
		return id; 
	}
}

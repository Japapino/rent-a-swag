package rentaswag.website;

import javax.persistence.Entity;

@Entity
public class Product {
	
	private String name; 
	
	@SuppressWarnings("unused")
	private Product() {}
	
	public Product(String name) {
		this.name = name; 
	}

	public String getName() {
		return name; 
	}
}

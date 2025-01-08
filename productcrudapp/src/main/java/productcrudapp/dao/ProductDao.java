package productcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productcrudapp.model.Product;

@Component
public class ProductDao {
	
	//create
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	// get all records(object)
		public List<Product> getProducts() {
			List<Product> products = this.hibernateTemplate.loadAll(Product.class);
			return products;
		}
		
		//deleting the row and data
		@Transactional
		public void deleteProduct(int pid) {
		Product product =	this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(product);
		}
		
		//updating data
//		@Transactional
//	   public void updateProduct(Product product) {
//		 this.hibernateTemplate.update(product);
//	   }
		
		// get the single data(object)
		public Product getProduct(int pid) {
			Product product = this.hibernateTemplate.get(Product.class, pid);
			return product;
		}

}

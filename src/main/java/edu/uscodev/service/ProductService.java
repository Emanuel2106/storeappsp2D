
package edu.uscodev.service;

import edu.uscodev.model.Product;
import java.util.List;


public interface ProductService {
     public List<Product> findAllProduct();
    public List<Product> findAllProduct(String filtro);
    public Product findProductbyproductName(Product product);
     public Product findProductbyId(Product product);
    public void insertProduct(Product product);
    public void deleteProduct(Product product);
    public void updateProduct(Product product); 
}

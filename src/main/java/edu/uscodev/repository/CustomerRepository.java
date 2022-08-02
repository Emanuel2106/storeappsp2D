
package edu.uscodev.repository;

import edu.uscodev.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, String> {
    
}

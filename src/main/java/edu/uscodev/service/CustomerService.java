
package edu.uscodev.service;

import edu.uscodev.model.Customer;
import java.util.List;

public interface CustomerService {
    public List<Customer> findAllCustomer();
    public List<Customer> findAllCustomer(String filtro);
    public Customer findCustomerbyId(Customer customer);
    public Customer findCustomerbyEmail(Customer customer);
    public void insertCustomer(Customer customer);
    public void deleteCustomer(Customer customer);
    public void updateCustomer(Customer customer);    

    
}

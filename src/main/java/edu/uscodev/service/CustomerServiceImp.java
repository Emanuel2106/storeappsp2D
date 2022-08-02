
package edu.uscodev.service;

import edu.uscodev.model.Customer;
import edu.uscodev.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Customer> findAllCustomer() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public List<Customer> findAllCustomer(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Customer findCustomerbyId(Customer customer) {
        return customerRepository.findById(customer.getCustomerID()).orElse(null);

    }

    @Override
    public Customer findCustomerbyEmail(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);

    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    
    }
    
}

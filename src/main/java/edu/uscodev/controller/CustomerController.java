package edu.uscodev.controller;

import edu.uscodev.model.Customer;
import edu.uscodev.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class CustomerController {

    @Autowired
    CustomerService customerservice;

    @GetMapping("/customer")
    public String list(Model model) {
        var customers = customerservice.findAllCustomer();
        model.addAttribute("customers", customers);
        return "mngcustomer";
    }

    @GetMapping("/addcustomer")
    public String routeAdd(Customer customer) {
        return "editcustomer";
    }

    @PostMapping("/savecustomer")
    public String saveCustomer(Customer customer) {
        log.info(" UP ID:" + customer.getCustomerID());
        customerservice.insertCustomer(customer);
        return "redirect:/customer";
    }

    @GetMapping("/editcustomer/{customerID}")
    public String editCustomer(Customer customer, Model model) {
        customer = customerservice.findCustomerbyId(customer);
        model.addAttribute("customer", customer);
        return "editcustomer";
    }

    @GetMapping("/removecustomer")
    public String removeCustomer(Customer customer) {
        customerservice.deleteCustomer(customer);
        return "redirect:/customer";
    }

}

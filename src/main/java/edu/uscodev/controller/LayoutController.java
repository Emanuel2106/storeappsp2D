package edu.uscodev.controller;

import edu.uscodev.service.CustomerService;
import edu.uscodev.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class LayoutController {

    //Para Customer
    @Autowired
    CustomerService customerservice;
   
    @GetMapping("/customer2")
    public String listCustomer(Model model) {
        var customers = customerservice.findAllCustomer();
        model.addAttribute("customers", customers);
        return "mngcustomer";
    }
    
    
    @Autowired
    ProductService productservice;
    @GetMapping("/product2")
    public String listProduct(Model model) {
        var products = productservice.findAllProduct();
        model.addAttribute("products", products);
        return "mngproduct";
    }

}

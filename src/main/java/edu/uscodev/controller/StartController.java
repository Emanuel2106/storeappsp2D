
package edu.uscodev.controller;


import edu.uscodev.model.Customer;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class StartController {
    
    @Value("${index.msgapp}")
    private String msgapp;
    
    @GetMapping("/")
    public String start(Model model){
        log.info("Controller MVC Start");
        model.addAttribute("msgapp", msgapp);
        model.addAttribute("mensaje", "Mensaje desde el Controller...");
//        Customer c = new Customer("12345", "Pepa Matinez", 3125678, "pepa@mail.com");
//        model.addAttribute("customer", c);
//        Customer c1=new Customer("29876", "Pedro", "Centro", "Neiva", "Huila", 12345, 6092220, "pedro@mail.com", "NA");
//        Customer c2=new Customer("39876", "Pablo", "Sur", "Medellin", "Antioquia", 12345, 6092220, "pablo@mail.com", "NA");
//        Customer c3=new Customer("59876", "Vilma", "Norte", "Ibague", "Tolima", 12345, 6092220, "vilma@mail.com", "NA");
//        var customers = Arrays.asList(c,c1,c2,c3);
//        //var customers = Arrays.asList();
//        model.addAttribute("customers", customers);
        return("index");
    }
}

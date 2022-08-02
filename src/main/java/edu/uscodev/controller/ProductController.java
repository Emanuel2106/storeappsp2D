/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uscodev.controller;

import edu.uscodev.model.Product;
import edu.uscodev.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author USUARIO
 */

@Controller
@Slf4j
public class ProductController {
    @Autowired
    ProductService productservice;
    
    @GetMapping("/product")
    public String list(Model model) {
        var products = productservice.findAllProduct();
        model.addAttribute("products", products);
        return "mngproduct";
    }

    @GetMapping("/addproduct")
    public String routeAdd(Product product) {
        return "editproduct";
    }
    
    @PostMapping("/saveproduct")
    public String saveProduct(Product product) {
        log.info(" UP ID:"+product.getProductId());
        productservice.insertProduct(product);
        return "redirect:/product";
    }
    
    @GetMapping("/editproduct/{productId}")
    public String editProduct(Product product, Model model){
        product = productservice.findProductbyId(product);
        model.addAttribute("product", product);
        return "editproduct";
    }
    
    @GetMapping("/removeproduct")
    public String removeProduct (Product product){
        productservice.deleteProduct(product);
        return "redirect:/product";
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.uscodev.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "productId")
    private String productId;
    @Basic(optional = false)
    //@Size(min = 1, max = 50)
    @Column(name = "productName")
    private String productName;
    //@JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
    @ManyToOne(targetEntity = Category.class)
   // @Column(name = "categoryId")
    @JoinColumn(name="categoryId",referencedColumnName="categoryId") 
    private Category categoryId;
    @NotNull
    @Column(name="price")
     private Double price;

    public Product(String productId, String productName, Category categoryId, Double price) {
        this.productId = productId;
        this.productName = productName;
        this.categoryId = categoryId;
        this.price = price;
    }

    public Product() {
    }
    

}


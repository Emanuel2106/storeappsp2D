
package edu.uscodev.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "customerID")
    private String customerID;
    @Basic(optional = false)
    @Column(name = "customerName")
    private String customerName;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @Column(name = "phone")
    private int phone;
    @Basic(optional = false)
    @Column(name = "mobileno")
    private int mobileno;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Lob
    @Column(name = "notes")
    private String notes;

    public Customer(String customerID, String customerName, String address, String city, String state, int phone, int mobileno, String email, String notes) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.mobileno = mobileno;
        this.email = email;
        this.notes = notes;
    }

    public Customer(String customerID, String customerName, int mobileno, String email) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.mobileno = mobileno;
        this.email = email;
    }

    
    public Customer() {
    }

    
}

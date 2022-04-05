package com.example.petstore.domain;

//import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;


@Entity
public class CartItem {

    @Id  @GeneratedValue
    Long id;
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }

    @ManyToOne
    Customer customer;
        public Customer getCustomer() {
            return customer;
        }
        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

    
    String pet;

        public String getPet() {
            return pet;
        }
        public void setPet(String pet) {
            this.pet = pet;
        }

    @Embedded
    Payment payment;
        public Payment getPayment() {
            return payment;
        }
        public void setPayment(Payment payment) {
            this.payment = payment;
        }

    
}

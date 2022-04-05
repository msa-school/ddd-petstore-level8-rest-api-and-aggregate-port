package com.example.petstore.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Money {

    Currency currency;
    Double amount;

    public Currency getCurrency() {
        return currency;
    }
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
}

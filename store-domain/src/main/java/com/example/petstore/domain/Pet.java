package com.example.petstore.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Pet implements Serializable {
    
    String petId;

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }


}

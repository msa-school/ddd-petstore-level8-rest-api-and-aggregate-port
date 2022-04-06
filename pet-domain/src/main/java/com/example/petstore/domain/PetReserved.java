package com.example.petstore.domain;

import com.example.petstore.AbstractEvent;

public class PetReserved extends AbstractEvent {
    Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {this.id = id;}

    private int appearance;
    public int getAppearance() {
        return appearance;
    }
    public void setAppearance(int appearance) {
        this.appearance = appearance;
    }


    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name==null) throw new IllegalArgumentException("이름은 꼭 들어가야 합니다");
        this.name = name;
    }

    String type;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    private int energy = 0;
    protected int getEnergy() {
        return energy;
    }
    protected void setEnergy(int energy) {
        if(Math.abs(this.energy - energy) < 3 )
            this.energy = energy;
        else
            throw new IllegalArgumentException("Energy change is too big");
    }

}

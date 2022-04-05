package com.example.petstore.domain;




import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cat")
public class Cat extends Pet implements Groomable, Runnable{

    public Cat() {
        setType("Cat");
    }

    @Override
    public void speak() {

        if(getEnergy() < 5){            
            System.out.println("I'm hungry");
        }else     
            System.out.println("Hi");
    }

    @Override
    public String grooming() {
        //answer must be obtained by UI
        setAppearance(getAppearance()+1);

        return "야옹. 행복하다 집사야.";
    }

    @Override
    public void run() {
        
        System.out.println("I'm running!!!");
        
    }

    
}

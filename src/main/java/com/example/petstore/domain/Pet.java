package com.example.petstore.domain;

import javax.persistence.*;

@Entity
@DiscriminatorColumn(
    discriminatorType = DiscriminatorType.STRING,
    name = "pet_type",
    columnDefinition = "CHAR(5)"
)
public abstract class Pet {     // Entity. Domain Class.


    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;    
        public Long getId() {
            return id;
        }

    private int appearance;
        public int getAppearance() {
            return appearance;
        }
        protected void setAppearance(int appearance) {
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


    abstract public void speak();

        
    // List<Listener> listeners = new ArrayList<Listener>();
    // public void addListener(Listener listener) {
    //     this.listeners.add(listener);
    // }

    private int energy = 0;
        public int getEnergy() {
            return energy;
        }
        protected void setEnergy(int energy) {
            if(Math.abs(this.energy - energy) < 3 )
                this.energy = energy;
            else    
                throw new IllegalArgumentException("Energy change is too big");
        }

    public void eat(){
        energy += 1;

		if(energy > 10) throw new TooMuchEnergyException();
    }

    public void sleep(){
        energy += 2;
    }

    @Override
    public String toString() {
        
        return "<a href='./"+this.getClass().getSimpleName().toLowerCase()+"'" + ">" + this.getClass().getSimpleName() + "</a>";
    }
    
}

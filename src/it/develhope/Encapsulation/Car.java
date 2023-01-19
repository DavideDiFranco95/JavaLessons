package it.develhope.Encapsulation;

//import lombok.Data; //Implementa get e set

import lombok.*;

//@Data
@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Car {
    private double power;
    private int doors;
    //private double consumption;
    private double weight;
    private CarConsumption carConsumption= new CarConsumption();


    public void setDoors(int doors) {
        if (this.doors>4)return;
        this.doors = doors;
    }
    public Car(double power,int doors,double consumption,double weight){
        this(power,doors,weight,new CarConsumption());
        this.carConsumption.setFuel(consumption);
    }
    public double getConsumption(){
        return carConsumption.getFuel();
    }
    /*public double setConsumption(){
        return carConsumption.setFuel();
    }*/
}

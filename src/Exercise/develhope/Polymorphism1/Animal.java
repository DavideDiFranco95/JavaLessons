package Exercise.develhope.Polymorphism1;

import Exercise.develhope.Polymorphism2.Lion;

public class Animal {
    public String animalName;
    public Animal(String animalName){
        this.animalName=animalName;
    }
    public void animalSound(){
        System.out.println("Roarr!");

    }
    public void animalSound(String intensity){

    }

}

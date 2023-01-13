package it.develhope.zoo;

public class Zookeeper {

    public String name;
    public String surname;
    public Zookeeper(String name) {
        this.name=name;
    }
    public void feedAnimal(Animal animal){
        this.callAnimal();
        System.out.println(name + " is feeding " + animal.name);
    }
    public int feedAnimal(Animal animal, Food food){ //Overload
        this.callAnimal(animal);
        System.out.println(name + " is feeding " + animal.name + " with food " + food.name);
        return food.energy;
    }


    public void callAnimal(){
        System.out.println("Calling the animal");
    }
    public void callAnimal(Animal animal){
        System.out.println("Calling " + animal.name);
    }

    /**
     * Gets the complete name of the Zookeeper
     * @deprecated Moving on getCompleteNameV2
     * @return
     */
    public String getCompleteName(){
        return name + " " + surname;
    }
    public String getCompleteNameV2(){
        return Zookeeper.getCompleteName(this);
    }

    /**
     * Extract the zookeeper complete name (name and surname)
     * @param zookeeper The Zookeeper to work on
     * @return The zookeeper complete name
     */
    public static String getCompleteName(Zookeeper zookeeper){
        return zookeeper.name +" "+ zookeeper.surname;
    }


}

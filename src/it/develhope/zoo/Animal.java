package it.develhope.zoo;

/**
 * This class represents an animal
 */
public class Animal {
    /** Animal name */
    public String name;
    public String type;
    public boolean hasFur;

    /**
     * Creates an animal
     */
    public Animal(){
        //molto spesso è un metodo.
        System.out.println("A new animal was born");
    }

    /**
     * creates a new animal with name
     * @param name the name of the animal
     */
    public Animal(String name){ //le funzioni hanno sempre un input e un output
        System.out.println("A new animal was born, it is called " + name);
        this.name = name; //introspezione
    }

    /**
     * creates a new animal with name and type
     * @param name the name of the animal
     * @param type the type of the animal
     */
    public Animal(String name, String type){
        System.out.println("A new "+ type + " was born, it is called " + name);
        this.name = name;
        this.type = type;
    }

    /**
     * creates a new animal with fur or not
     * @param hasFur
     */
    public Animal(boolean hasFur){
        System.out.println("A new animal was born, does it has fur? " + hasFur);
        this.hasFur = hasFur;
    }
}

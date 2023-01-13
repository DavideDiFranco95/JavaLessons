package it.develhope.zoo;

public class Food {
    public String name;
    /**
     * Energy of the food [kcal]
     */
    public int energy; //in queste unità di tipo "Tecnico" metti sempre il java doc (/** e invio)

    public Food(String name, int energy){
        this.name = name;
        this.energy = energy;
    }
}

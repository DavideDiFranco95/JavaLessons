package it.develhope.polimorfism;

import it.develhope.polimorfism.entities.AnimalAbstract;
import it.develhope.polimorfism.entities.Dolphin;
import it.develhope.polimorfism.entities.Lion;
import it.develhope.polimorfism.entities.Zebra;
import it.develhope.polimorfism.interfaces.Animal;
import it.develhope.polimorfism.interfaces.Food;

import java.util.ArrayList;
import java.util.List;

public class Start {

    static Food genericFood = new Food() {
        @Override
        public double getCalories() {
            return 0;
        }

        @Override
        public double getFatGrams() {
            return 0;
        }

        @Override
        public double getCarbosGrams() {
            return 0;
        }

        @Override
        public double getVitaminsGrams() {
            return 0;
        }

        @Override
        public double getProteinsGrams() {
            return 0;
        }

        @Override
        public String getName() {
            return null;
        }
    };

    public static void main(String[] args){
        Animal lion = new Lion();
        AnimalAbstract lion1 = new Lion();
        Lion lion2 = new Lion();
        //3 metodi per richiamare la STESSA COSA su
        Animal zebra = new Zebra();
        Animal dolphin = new Dolphin();

        List<Animal> zoo = new ArrayList<>();
        zoo.add(lion);
        zoo.add(zebra);
        zoo.add(dolphin);

        System.out.println("Lion vs Zebra, does the lion win?: " + lion.fightAgainst(zebra));
        System.out.println("Dolphin vs Zebra, does the dolphin win?: " + dolphin.fightAgainst(zebra));

        System.out.println("The animals are running " );
        zoo.stream().forEach(animal -> {
            animal.run();
        });

        zoo.stream().forEach(animal -> {
            double calories = animal.eat(genericFood);
        });
        System.out.println("----------------------------------------");

        double totalCalories= 0;
        for(int i=0;i<zoo.size(); i++){
            Animal single = zoo.get(i);
            double totalCaloriesAnimal = single.eat(genericFood);
            totalCalories+=totalCaloriesAnimal;
        }

        Animal zebraAnimal = (Animal) zebra; //Casting
        Lion lionCast = (Lion) lion; //Casting se bisogna intervenire su qualche problema

        System.out.println("----------------------------------------");
        System.out.println("All animals have eaten " +  totalCalories + " calories");
        System.out.println("----------------------------------------");



    }
}

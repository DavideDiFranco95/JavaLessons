package it.develhope.zoo;

public class Start {
    //1 publica 2 statica 3 non ritorna nulla 4 nome della funzione 5 argomenti della funzione [Array]
    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println("We are creating the Zoo");
        System.out.println("-----------------------");

        /*
        //NON FARE COSI'
        Animal giraffe= null;
        giraffe= new Animal();
        Animal lion= null;
        lion= new Animal();
         */
        System.out.println("--- Declared three animals ---");
        Animal giraffe, lion, penguin; //Declaration - Dichiarazione
        giraffe = new Animal(  "Lory",  "Giraffe"); //Instance - Creation
        lion = new Animal(  "Leo"); //Instance - Creation
        penguin = new Animal( false); //Instance - Creation

        System.out.println("--- Created three animals ---");

        //Now i set all the parameters
        giraffe.hasFur = true;
        lion.type = "Lion";
        lion.hasFur = true;
        penguin.name = "Giovanni";
        penguin.type = "Penguin";


        System.out.println("--- Creating the zookeeper ---");
        String aNewAnimal = "Fish"; //Non si può usare come gli altri "animal"
        Zookeeper marco = new Zookeeper("Marco");
        marco.surname = "Rossi";

        //Extracting the complete name
        String marcoCompleteName = Zookeeper.getCompleteName(marco);
        System.out.println("Zookeeper name is " + marcoCompleteName);

        System.out.println("Zookeeper name is " + marco.getCompleteNameV2());



        //Creating Food
        Food meat = new Food("T-bone",500);
        Food green = new Food("Grass",200);
        Food leaf = new Food("leaf",100);

        System.out.println("--- Feeding ---");
        int giraffeCalories = marco.feedAnimal(giraffe,leaf);
        int lionCalories = marco.feedAnimal(lion,meat);
        int penguinCalories = marco.feedAnimal(penguin,green);

        int totalCalories = giraffeCalories + lionCalories + penguinCalories;
        System.out.println("--- All animals are fed with " + totalCalories + " kcal");
    }
}

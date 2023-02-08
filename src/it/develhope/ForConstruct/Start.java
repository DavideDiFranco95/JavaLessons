package it.develhope.ForConstruct;

import java.util.*;

public class Start {
    public static void main(String[] args) {
        String[] myStringArray = new String[]{
                "zero","one","two","three"
        };
        System.out.println("For Base");
        for (int i=0; i< myStringArray.length ;i++){
            String theValue = myStringArray[i];
            System.out.println("The index is " + i + " - " + theValue);
        }
        System.out.println("--------------------------------");
        for (int i=0; i< myStringArray.length ;i+=2){
            String theValue = myStringArray[i];
            System.out.println("The index is " + i + " - " + theValue);
        }
        System.out.println("--------------------------------");
        for (int i= myStringArray.length-1;i>=0;i--){ //Da ricordare.
            String theValue = myStringArray[i];
            System.out.println("The index is " + i + " - " + theValue);
        }
        System.out.println("--------------------------------");

        System.out.println("For Advanced");

        Animal lion = new Animal("Lion",10);
        Animal zebra = new Animal("Zebra",15);
        Animal penguin = new Animal("Penguin",5);
        Animal[] animalArray = new Animal[]{zebra,lion,penguin};
        boolean isThereALion = false;
        for (int i = 0; i < animalArray.length; i++) {
            System.out.println(animalArray[i]);
            Animal singleValue=animalArray[i];
            System.out.println("Index is " + i);
            if (singleValue.type.equals("Lion")){
                isThereALion = true;
                break; //così si blocca, senza controllare gli altri elementi.
                //interrompe il ciclo.
            }
        }
        //Mi piace di più :D
        Arrays.stream(animalArray).anyMatch(animal -> animal.type.equals("Lion"));

        System.out.println("Is there at least a lion? " + isThereALion);

        System.out.println("--------------------------------");
        for (int i = 0; i < animalArray.length; i++) {
            Animal singleValue = animalArray[i];
            if (singleValue.type.equals("Lion")){
                System.out.println("Index is " + i);
                System.out.println("I am stopping current cycle, it is a lion");
                continue;
            }
            System.out.println("Index is " + i);
            System.out.println("Index is " + singleValue);
        }

        System.out.println("--------------------------------");
        System.out.println("For with a List");
        List<Animal> animalList = new ArrayList<>();
        animalList.add(lion);
        animalList.add(zebra);
        animalList.add(penguin);
        for (int i = 0; i < animalList.size(); i++) {
            Animal singleValue = animalList.get(i);
            System.out.println("The single animal is " + singleValue);
        }
        System.out.println("--------------------------------");

        for (int i = animalList.size()-1;i>=0; i--){
            Animal singleValue = animalList.get(i);
            if (singleValue.type.equals("Lion")){
                animalList.remove(i);
            }
        }
        //evita
        //System.out.println("Animals are " + animalList.get(0));
        //System.out.println("Animals are " + animalList.get(1));

        System.out.println("--------------------------------");
        System.out.println("Lambda");
        animalList.stream().forEach(singleAnimal->{
            System.out.println("Animal is " + singleAnimal);
        });

        System.out.println("--------------------------------");
        for (Animal animal : animalList){
            System.out.println("The single animal is " + animal);
        }
        System.out.println("--------------------------------");
        for (Animal animal : animalArray){
            System.out.println("The single animal is " + animal);
        }
        System.out.println("--------------------------------");

        Map<String,Animal> map = new HashMap<>();
        map.put("Lion",lion);
        map.put("Penguin",penguin);
        map.put("Zebra",zebra);

        for (int i =0; i<map.values().size();i++){
            Animal singleValue = (Animal) map.values().stream().toArray()[i];
            System.out.println("The single animal from map is " + singleValue);
        }
        System.out.println("--------------------------------");
        for(Animal singleValue : map.values()){
            System.out.println("The single animal from map in ForEach is " + singleValue);
        }
        System.out.println("--------------------------------");
        Set<Animal> myAnimalSet = new HashSet<>();
        myAnimalSet.add(lion);
        myAnimalSet.add(penguin);
        myAnimalSet.add(zebra);

        Object[] myAnimalArrayFromSet = myAnimalSet.toArray();
        for (int i=0; i<myAnimalArrayFromSet.length; i++){
            Animal singleValue = (Animal) myAnimalArrayFromSet[i];
            System.out.println("The single animal from map in ForEach is " + singleValue);
        }

        for(Animal singleValue : myAnimalSet){
            System.out.println("The single animal from Set in ForEach is " + singleValue);
        }
        System.out.println("--------------------------------");
        System.out.println("Array 2D");
        String[][] myStringArray2d = new String[][]{
                new String[]{"one","two","three","fuor"},
                new String[]{"1","2","3","4"},
                new String[]{"A","B","C"},
        };
        for (int i=0; i<myStringArray2d.length;i++){
            String[] singleValue = myStringArray2d[i];
            System.out.println("Array 2D - Single Value " + singleValue);
            for (int j=0;j<singleValue.length ;j++){
                String singleSingleValue = singleValue[j];
                System.out.println("Array 2D - String[i][j] - Value"
                        + singleSingleValue + " Index I: " +i+ " Index J " +j);
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("List in object");

        Animal superLion = new Animal("Lion",10,Arrays.asList("meat","pork","zebra"));
        Animal superZebra = new Animal("Zebra",15,Arrays.asList("grass","leaf","water"));
        Animal superPenguin = new Animal("Penguin",5);
        List<Animal> superAnimals = Arrays.asList(superLion,superZebra,superPenguin);
        for (int i=0;i<superAnimals.size();i++){
            Animal singleValue = superAnimals.get(i);
            if (singleValue.favouriteFood!= null) for (int j = 0; j < singleValue.favouriteFood.size(); j++) {
                System.out.println("Printing favourite foods for "
                        + singleValue.type + " " + singleValue.favouriteFood.get(j));
            }
        }
        System.out.println("--------------------------------------------------");
        for (Animal animal:superAnimals) {
            if (animal.favouriteFood!= null) for (String food :animal.favouriteFood){
                System.out.println("Printing favourite foods for "
                        + animal.type + " " + food);
            }
        }
        System.out.println("--------------------------------------------------");

        superAnimals.stream().forEach(singleAnimal->{
            if (singleAnimal.favouriteFood!= null) singleAnimal.favouriteFood.stream().forEach(singleFood->{
                System.out.println("Printing favourite foods for "
                        + singleAnimal.type + " " + singleFood);
            });
        });


        // if (singleAnimal.favouriteFood!= null) = serve per proteggerci da un errore:
        //se non tutti hanno il parametro "cibo" darà error, questo lo evita
    }
}

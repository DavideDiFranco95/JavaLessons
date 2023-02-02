package it.develhope.mapAndSets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        String[] myStringArray = new String[]{"one","two","three"};
        Arrays.stream(myStringArray).forEach(single->{
            System.out.println(single);
        });
        System.out.println("-------------------------------------------------------------");
        // Set concept
        //Nei Set si può inserire "qualcosa"
        Set<String> mySet = new HashSet<>();
        mySet.add("Pippo");
        mySet.add("Pluto");
        mySet.add("Paperino");
        mySet.addAll(Arrays.asList("Pippo2","Pluto2","Paperino2"));
        //non si possono inserire elementi uguali.

        Object[] myArray = mySet.toArray();
        Arrays.stream(myArray).forEach(singleElement->{
            System.out.println(singleElement);
        });
        System.out.println("-------------------------------------------------------------");
        mySet.stream().forEach(singleElement->{
            //.stream()= fa una copia per lavorarci su
            //forEach,per ogni elemento //singleElement-> = lambda e significa ad ogni elemento fai:
            System.out.println("Single element in array - " + singleElement);
        });
        System.out.println("-------------------------------------------------------------");
        mySet.stream().filter(singleElement->{
            return singleElement.contains("2");
        }).forEach(singleElement->{
            System.out.println("Single element in array - " + singleElement);
        });
        System.out.println("-------------------------------------------------------------");
        //String ha lo stream come il Set.
        /*String[] arrayOf2 = (String[]) mySet.stream().filter(singleElement->{
            return singleElement.contains("2");
        }).toArray();
         */
        System.out.println("-------------------------------------------------------------");
        //MOLTO IMPORTANTE: Quando si definisce un oggetto(Object), si definisce anche l'HashCode.
        User lorenzo  = new User("lorenzo@develhope.com","Lorenzo", "lorenzoDev");
        User lorenzo2 = new User("lorenzo@develhope.com","Lorenzo", "lorenzoDev");
        User lorenzo3 = new User("lorenzo@develhope.com","Lorenzo", "lorenzoDev");
        //ESEMPIO e MODIFICA a name: "Lorenzo(numero)" per test sugli Hashcode.
        int lorenzoHashcode = lorenzo.hashCode();
        int lorenzo2Hashcode = lorenzo2.hashCode();

        System.out.println("hash codes " + lorenzoHashcode + " - " + lorenzo2Hashcode);

        Set<User> mySetUser = new HashSet<>();
        mySetUser.add(lorenzo);
        mySetUser.add(lorenzo2);
        mySetUser.add(lorenzo3);

        mySetUser.stream().forEach(singleUser->{
            System.out.println("User - " + singleUser + " - User hash code: " + singleUser.hashCode());
            //Stamperà un solo elemento se l'interno degli oggetti è uguale.
        });
        System.out.println("-------------------------------------------------------------");

        //mySetUser.forEach(value->{
        // Itererai sul valore se non è Map
        //});
    }
}
